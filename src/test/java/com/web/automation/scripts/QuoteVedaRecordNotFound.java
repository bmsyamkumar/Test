package com.web.automation.scripts;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.web.automation.accelerators.TestEngineWeb;
import com.web.automation.fileutils.ExcelReader;
import com.web.automation.logs.ExtentLogs;
import com.web.automation.pages.QuoteBasicDetails;
import com.web.automation.pages.QuoteEmploymentDetails;
import com.web.automation.pages.QuoteResultDetails;
import com.web.automation.pages.ReadTestData;
import com.web.automation.utilities.CommonVariables;

public class QuoteVedaRecordNotFound extends TestEngineWeb {
	
	private String testCaseFailureReason = "";
	private boolean testCaseStatus = true;	
	private ExtentLogs extentLogs = new ExtentLogs();
	private QuoteBasicDetails QuoteBasicDetailsPage;
	private QuoteEmploymentDetails QuoteEmploymentDetailsPage;
	private QuoteResultDetails QuoteResultDetailsPage;
	
	
	public void TestCaseStatus(Boolean status, String reason) {
		if (status == false) {
			Assert.fail("Test Case Failed because - " + reason);
		}
	}	
	

	@DataProvider(name="DataSets")
    public Object[][] getDataFromDataprovider() throws IOException{
    Object[][] DataObject = null;
    ReadTestData file = new ReadTestData();
    
    
    Sheet DataSheet = file.readExcel(System.getProperty("user.dir").replace("\\", "/") + "/testdata","WisrAutomationTestData.xlsx" , "QuoteVedaRecordNotFound");
    int rowCount = DataSheet.getLastRowNum()-DataSheet.getFirstRowNum();
    
    DataObject = new Object[rowCount][38];
    for (int i = 0; i < rowCount; i++) {
    	Row row = DataSheet.getRow(i+1);
        for (int j = 0; j < row.getLastCellNum(); j++) {
        	DataObject[i][j] = row.getCell(j).toString();
        }
    }    
     return DataObject;    
    }
	
	
	
	@Test(dataProvider="DataSets",description = "QuoteErrorResult", groups = { "smoke", "regression" })
	public void QuoteVedaRecordNotFound(String LoanAmount, String LoanPurpose, String LoanTerm, String Title, String FirstName, String MiddleName, String LastName, String DOB_Day, String  DOB_Month, String DOB_Year, String MaritalStatus, String NoOfDep, String EmilAddress, String Mobile, String DriverLicence, String HomeAddress, String TimeAtAdd_Years, String TimeAtAdd_Months, String LivingArrangements, String EmplymentStatus, String TimeAtEmploer_Years, String TimeAtEmployer_Months, String YearlyIcome, String RentPayments, String RentPayment_Frequency, String MortgagePayments, String MortgagePayments_Frequency, String PropertyValue, String OutstandingMortgageAmount, String HavePersonalLoans, String Personalloan_Amount, String Personalloan_Frequency, String HaveCreditCards, String NoOfCards, String TotalCreditLimit, String TnCPrivacyConcent, String TnCPrivacy, String TnCAuthorise) throws Throwable {
		try {	
			QuoteBasicDetailsPage = new QuoteBasicDetails(CommonVariables.CommonDriver.get());
			QuoteEmploymentDetailsPage = new QuoteEmploymentDetails(CommonVariables.CommonDriver.get());
			QuoteResultDetailsPage = new QuoteResultDetails(CommonVariables.CommonDriver.get());
			CommonVariables.getDriver().navigate().to("https://test-dm-services-webapp.azurewebsites.net/");
		    extentLogs.info("QuoteErrorResult","Iteration - ");
			
			QuoteBasicDetailsPage.fnQuote_EnterLoanDetails(LoanAmount, LoanPurpose, LoanTerm);
			
			QuoteBasicDetailsPage.fnQuote_EnterPersonalDetails(Title,FirstName,MiddleName,LastName,DOB_Day,DOB_Month,DOB_Year,MaritalStatus,NoOfDep);
			
			QuoteBasicDetailsPage.fnQuote_EnterContactDetails(EmilAddress,Mobile);
			
			QuoteBasicDetailsPage.fnQuote_EnterIdentificationDetails(DriverLicence);
			
			QuoteBasicDetailsPage.fnQuote_EnterAddressHistoryDetails_AndClickNext(HomeAddress,TimeAtAdd_Years,TimeAtAdd_Months,LivingArrangements);
			
			QuoteEmploymentDetailsPage.fnQuote_EnterEmploymentDetails(EmplymentStatus,TimeAtEmploer_Years,TimeAtEmployer_Months);
			
			QuoteEmploymentDetailsPage.fnQuote_EnterFinancialBreakdownDetails(LivingArrangements,YearlyIcome,RentPayments,RentPayment_Frequency,MortgagePayments,MortgagePayments_Frequency,PropertyValue,OutstandingMortgageAmount,HavePersonalLoans,Personalloan_Amount,Personalloan_Frequency,HaveCreditCards,NoOfCards,TotalCreditLimit);
			
			QuoteEmploymentDetailsPage.fnQuote_SelectPrivacyTermsConsent_AndClickGetEstimate(TnCPrivacyConcent,TnCPrivacy,TnCAuthorise);
			
			QuoteResultDetailsPage.fnResult_Validate_IDMatrix_Veda_ThankYou();
		}
	catch (Exception e) {
		testCaseFailureReason = "Failed to complete QuoteErrorResult";
		String stackTrace = extentLogs.getStackTraceAsString("Test", testCaseFailureReason, e);
		extentLogs.fail("QuoteErrorResult ", testCaseFailureReason + "Failed Reason : " + stackTrace);
		testCaseStatus = false;
	}
	TestCaseStatus(testCaseStatus, testCaseFailureReason);
	}
	
}
