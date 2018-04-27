package com.web.automation.pages;


import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.google.common.base.Optional;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.logs.ExtentLogs;
import com.web.automation.pages.BasePage;
import com.web.automation.utilities.ConfigManager;
import com.web.automation.objectrepository.QuoteBasic;
import com.web.automation.objectrepository.QuoteEmployer;

public class QuoteEmploymentDetails extends BasePage {	
	public WebDriver driver=ActionsLibrary.driver;
	public ExtentLogs extentLogs = new ExtentLogs();
	Optional<Long> timeoutInSecond = Optional.of(Long.parseLong("5"));

	public QuoteEmploymentDetails(WebDriver driver) {
		super(driver);		
	}
	
	public void fnQuote_EnterEmploymentDetails(String EmplymentStatus, String TimeAtEmploer_Years, String TimeAtEmployer_Months) throws Throwable
	{		
		try
		{
			if(actionLib.waitForElementPresent(QuoteEmployer.EmploymentStatus, 15))
			{	
				extentLogs.pass("Employment details","Employment details section displayed");
				
				if (!EmplymentStatus.isEmpty())
				{
					actionLib.Click(QuoteEmployer.EmploymentStatus, "EmploymentStatusOption button");
					actionLib.Click(QuoteEmployer.EmploymentStatusOption(EmplymentStatus), "EmploymentStatusOption ");
				}
				if (!TimeAtEmploer_Years.isEmpty())
				actionLib.type(QuoteEmployer.TimeatEmployerYears, TimeAtEmploer_Years, "TimeatEmployerYears");
				if (!TimeAtEmployer_Months.isEmpty())
				actionLib.type(QuoteEmployer.TimeatEmployerMonths, TimeAtEmployer_Months, "TimeatEmployerMonths");
				
				extentLogs.pass("Employment details","Successfully entered Employment details");	
				
			}
		}
		catch(Exception e)
		{	
			extentLogs.fail("Employment details","Not able to enter data into Employment details section");
			e.printStackTrace();			
		}		
	}

	public void fnQuote_EnterFinancialBreakdownDetails(String LivingArrangements, String YearlyIcome, String RentPayments, String RentPayment_Frequency, String MortgagePayments, String MortgagePayments_Frequency, String PropertyValue, String OutstandingMortgageAmount, String HavePersonalLoans, String Personalloan_Amount, String Personalloan_Frequency, String HaveCreditCards, String NoOfCards, String TotalCreditLimit) throws Throwable
	{		
		try
		{	
			if(actionLib.waitForElementPresent(QuoteEmployer.YearlyIncomeBeforeTax, 15))
			{
				extentLogs.pass("Financial Breakdown details","Financial Breakdown section displayed");
				
				if (!YearlyIcome.isEmpty())
				actionLib.type(QuoteEmployer.YearlyIncomeBeforeTax, YearlyIcome, "YearlyIncomeBeforeTax");
				if (!RentPayments.isEmpty())
				actionLib.type(QuoteEmployer.RentPayments, RentPayments, "RentPayments");
				if (!RentPayment_Frequency.isEmpty())
				{
					if (RentPayment_Frequency.toUpperCase().equals("WEEKLY"))
						actionLib.Click(QuoteEmployer.RentFrequencyWeekly, "RentFrequencyWeekly button");
					if (RentPayment_Frequency.toUpperCase().equals("MONTHLY"))
						actionLib.Click(QuoteEmployer.RentFrequencyMonthly, "RentFrequencyMonthly button");
					if (RentPayment_Frequency.toUpperCase().equals("YEARLY"))
						actionLib.Click(QuoteEmployer.RentFrequencyYearly, "RentFrequencyYearly button");
				}
				if (!MortgagePayments.isEmpty())
				actionLib.type(QuoteEmployer.MortgagePayments, MortgagePayments, "MortgagePayments");
				if (!MortgagePayments_Frequency.isEmpty())
				{
					if (MortgagePayments_Frequency.toUpperCase().equals("WEEKLY"))
						actionLib.Click(QuoteEmployer.MortgageFrequencyWeekly, "MortgageFrequencyWeekly button");
					if (MortgagePayments_Frequency.toUpperCase().equals("MONTHLY"))
						actionLib.Click(QuoteEmployer.MortgageFrequencyMonthly, "MortgageFrequencyMonthly button");
					if (MortgagePayments_Frequency.toUpperCase().equals("YEARLY"))
						actionLib.Click(QuoteEmployer.MortgageFrequencyYearly, "MortgageFrequencyYearly button");	
				}
				
				if (LivingArrangements.toUpperCase().equals("MORTGAGE"))
				{	
					if (!PropertyValue.isEmpty())
					actionLib.type(QuoteEmployer.PropertyValue, PropertyValue, "PropertyValue");
					if (!OutstandingMortgageAmount.isEmpty())
					actionLib.type(QuoteEmployer.OutstandingMortgageAmount, OutstandingMortgageAmount, "OutstandingMortgageAmount");
				}
				
				if (!HavePersonalLoans.isEmpty())
				{
					if (HavePersonalLoans.toUpperCase().equals("YES"))
					{
						actionLib.Click(QuoteEmployer.HavePersonalLoans_Yes, "HavePersonalLoans_Yes button");
						if (!Personalloan_Amount.isEmpty())
						actionLib.type(QuoteEmployer.AmountPayingForPersonalLoans, Personalloan_Amount, "AmountPayingForPersonalLoans");
						if (Personalloan_Frequency.toUpperCase().equals("WEEKLY"))
							actionLib.Click(QuoteEmployer.PersonalLoanFrequencyWeekly, "PersonalLoanFrequencyWeekly button");
						if (Personalloan_Frequency.toUpperCase().equals("MONTHLY"))
							actionLib.Click(QuoteEmployer.PersonalLoanFrequencyMonthly, "PersonalLoanFrequencyMonthly button");
						if (Personalloan_Frequency.toUpperCase().equals("YEARLY"))
							actionLib.Click(QuoteEmployer.PersonalLoanFrequencyYearly, "PersonalLoanFrequencyYearly button");	
					}else
						actionLib.Click(QuoteEmployer.HavePersonalLoans_No, "HavePersonalLoans_No button");
				}
				
				if (!HaveCreditCards.isEmpty())
				{
					if (HaveCreditCards.toUpperCase().equals("YES"))
					{
						actionLib.Click(QuoteEmployer.HaveCreditCards_Yes, "HaveCreditCards_Yes button");
						if (!NoOfCards.isEmpty())
						actionLib.type(QuoteEmployer.NoOfCreditCards, NoOfCards, "NoOfCreditCards");
						if (!TotalCreditLimit.isEmpty())
						actionLib.type(QuoteEmployer.TotalCombinedCardLimit, TotalCreditLimit, "TotalCombinedCardLimit");					
					}else
						actionLib.Click(QuoteEmployer.HaveCreditCards_No, "HaveCreditCards_No button");
				}
				
				extentLogs.pass("Financial Breakdown details","Successfully entered Financial Breakdown section");
				
			}
		}
		catch(Exception e)
		{	
			extentLogs.fail("Financial Breakdown details","Not able to enter data into Financial Breakdown details section");
			e.printStackTrace();			
		}		
	}

	public void fnQuote_SelectPrivacyTermsConsent_AndClickGetEstimate(String TnCPrivacyConcent, String TnCPrivacy, String TnCAuthorise ) throws Throwable
	{		
		try
		{	
			if(actionLib.waitForElementPresent(QuoteBasic.LoanAmount, 15))
			{
				extentLogs.pass("Privacy Terms and Consent details","Privacy Terms and Consent section displayed");
				
				if (!TnCPrivacyConcent.isEmpty())
				{
					if (TnCPrivacyConcent.toUpperCase().equals("YES"))
						actionLib.Click(QuoteEmployer.TnC_PrivacyConsent, "TnC_PrivacyConsent button");
				}
				if (!TnCPrivacy.isEmpty())
				{
					if (TnCPrivacy.toUpperCase().equals("YES"))
						actionLib.Click(QuoteEmployer.TnC_Consent, "TnC_Consent button");
				}
				if (!TnCAuthorise.isEmpty())
				{
					if (TnCAuthorise.toUpperCase().equals("YES"))
						actionLib.Click(QuoteEmployer.TnC_Authorise, "TnC_Authorise button");
				}
				
				actionLib.Click(QuoteEmployer.GetEstimate, "GetEstimate button");
				Thread.sleep(8000);
				
				extentLogs.pass("Privacy Terms and Consent details","Successfully selected Privacy Terms and Consent details");
			}
		}
		catch(Exception e)
		{	
			extentLogs.fail("Privacy Terms and Consent details","Not able to select options from Privacy Terms and Consent section");
			e.printStackTrace();			
		}		
	}
	
}




