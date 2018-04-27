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
import com.web.automation.pages.HomePage;
import com.web.automation.pages.JournalsPage;
import com.web.automation.pages.QuoteBasicDetails;
import com.web.automation.pages.QuoteEmploymentDetails;
import com.web.automation.pages.QuoteResultDetails;
import com.web.automation.pages.ReadTestData;
import com.web.automation.pages.SignInPage;
import com.web.automation.utilities.CommonVariables;

public class CreateJournal extends TestEngineWeb {
	
	private String testCaseFailureReason = "";
	private boolean testCaseStatus = true;	
	private ExtentLogs extentLogs = new ExtentLogs();
	private SignInPage SignIn;
	private HomePage Home;
	private JournalsPage Journals;
	
	boolean isLoginSuccessfull,isLogOutSuccessfull;
	
	public void TestCaseStatus(Boolean status, String reason) {
		if (status == false) {
			Assert.fail("Test Case Failed because - " + reason);
		}
	}	
	

	@DataProvider(name="DataSets")
    public Object[][] getDataFromDataprovider() throws IOException{
    Object[][] DataObject = null;
    ReadTestData file = new ReadTestData();
    
    
    Sheet DataSheet = file.readExcel(System.getProperty("user.dir").replace("\\", "/") + "/testdata","PrimeQTestData.xlsx" , "CreateJournal");
    int rowCount = DataSheet.getLastRowNum()-DataSheet.getFirstRowNum();
    
    DataObject = new Object[rowCount][6];
    for (int i = 0; i < rowCount; i++) {
    	Row row = DataSheet.getRow(i+1);
        for (int j = 0; j < row.getLastCellNum(); j++) {
        	DataObject[i][j] = row.getCell(j).toString();
        }
    }    
     return DataObject;    
    }
	
	
	
	@Test(dataProvider="DataSets",description = "Create Journal", groups = { "smoke", "regression" })
	public void QuoteAccept(String UserID, String Password, String BatchName, String BatchDescription, String JournalName, String JournalDescription) throws Throwable {
		try {	
			
			SignIn = new SignInPage(CommonVariables.CommonDriver.get());
			Home = new HomePage(CommonVariables.CommonDriver.get());
			Journals = new JournalsPage(CommonVariables.CommonDriver.get());
			
			SignIn.fnSignIn(UserID, Password);
			
			Home.fnNavigateToJournal();
			Journals.fnCreateJournal(BatchName, BatchDescription, JournalName, JournalDescription);
			
			
				
				/*QuoteBasicDetailsPage.fnQuote_EnterLoanDetails(LoanAmount, LoanPurpose, LoanTerm);
				
				QuoteBasicDetailsPage.fnQuote_EnterPersonalDetails(Title,FirstName,MiddleName,LastName,DOB_Day,DOB_Month,DOB_Year,MaritalStatus,NoOfDep);
				
				QuoteBasicDetailsPage.fnQuote_EnterContactDetails(EmilAddress,Mobile);
				
				QuoteBasicDetailsPage.fnQuote_EnterIdentificationDetails(DriverLicence);
				
				QuoteBasicDetailsPage.fnQuote_EnterAddressHistoryDetails_AndClickNext(HomeAddress,TimeAtAdd_Years,TimeAtAdd_Months,LivingArrangements);
				
				QuoteEmploymentDetailsPage.fnQuote_EnterEmploymentDetails(EmplymentStatus,TimeAtEmploer_Years,TimeAtEmployer_Months);
				
				QuoteEmploymentDetailsPage.fnQuote_EnterFinancialBreakdownDetails(LivingArrangements,YearlyIcome,RentPayments,RentPayment_Frequency,MortgagePayments,MortgagePayments_Frequency,PropertyValue,OutstandingMortgageAmount,HavePersonalLoans,Personalloan_Amount,Personalloan_Frequency,HaveCreditCards,NoOfCards,TotalCreditLimit);
				
				QuoteEmploymentDetailsPage.fnQuote_SelectPrivacyTermsConsent_AndClickGetEstimate(TnCPrivacyConcent,TnCPrivacy,TnCAuthorise);
				
				QuoteResultDetailsPage.fnResult_Validate_Accept();*/
			}
		catch (Exception e) {
			testCaseFailureReason = "Failed to complete Journal Creation";
			String stackTrace = extentLogs.getStackTraceAsString("Test", testCaseFailureReason, e);
			extentLogs.fail("Journal Creation ", testCaseFailureReason + "Failed Reason : " + stackTrace);
			testCaseStatus = false;
		}
		TestCaseStatus(testCaseStatus, testCaseFailureReason);
	}
	

}
