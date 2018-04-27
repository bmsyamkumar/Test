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

public class QuoteBasicDetails extends BasePage {	
	public WebDriver driver=ActionsLibrary.driver;
	public ExtentLogs extentLogs = new ExtentLogs();
	Optional<Long> timeoutInSecond = Optional.of(Long.parseLong("5"));

	public QuoteBasicDetails(WebDriver driver) {
		super(driver);		
	}
			
	public void fnQuote_EnterLoanDetails(String LoanAmount, String LoanPurpose, String LoanTerm) throws Throwable
	{		
		try
		{	
			if(actionLib.waitForElementPresent(QuoteBasic.LoanAmount, 15))
			{	
				extentLogs.pass("Loan details","Loan details section displayed");
				
				if (!LoanAmount.isEmpty())
					actionLib.type(QuoteBasic.LoanAmount, LoanAmount, "Loan Amount");
				if (!LoanPurpose.isEmpty()) 
				{
					actionLib.Click(QuoteBasic.LoanPurposeButton, "Loan purpose Button");
					actionLib.Click(QuoteBasic.LoanPurpose(LoanPurpose), "Loan purpose ");
				}
				
				if (!LoanTerm.isEmpty()) 
				{
					if (LoanTerm.toString().toUpperCase().equals("3 YEARS"))
						actionLib.Click(QuoteBasic.LoanTerm_3Years, "Loan Term 3 Years button");
					if (LoanTerm.toString().toUpperCase().equals("5 YEARS"))
						actionLib.Click(QuoteBasic.LoanTerm_5Years, "Loan Term 5 Years button");
				}
				extentLogs.pass("Loan details","Successfully entered Loan details");					
			}
		}
		catch(Exception e)
		{	
			extentLogs.fail("Loan details","Not able to enter data into Loan details section");
			e.printStackTrace();			
		}
	}
	
	public void fnQuote_EnterPersonalDetails(String Title, String FirstName, String MiddleName, String LastName, String DOB_Day, String  DOB_Month, String DOB_Year, String MaritalStatus, String NoOfDep) throws Throwable
	{		
		try
		{
			if(actionLib.waitForElementPresent(QuoteBasic.Title_Mrs, 15))
			{	
				extentLogs.pass("Personal details","Personal details section displayed");
				
				if (!Title.isEmpty())
				{	
					if ((Title.toUpperCase().equals("MR")) || (Title.toUpperCase().equals("MRS")))
						
						{												
							if (Title.toUpperCase().equals("MRS"))
								actionLib.Click(QuoteBasic.Title_Mrs, "Title Mrs button");
							if (Title.toUpperCase().equals("MR"))
								actionLib.Click(QuoteBasic.Title_Mr, "Title Mr button");
					
						}else
							
						{
							actionLib.Click(QuoteBasic.Title_More, "Title More Button");
							actionLib.Click(QuoteBasic.Title_More_Option(Title), "Title ");
						}
				}
				if (!FirstName.isEmpty())
				actionLib.type(QuoteBasic.FirstName, FirstName, "FirstName");
				if (!MiddleName.isEmpty())
				actionLib.type(QuoteBasic.MiddleName, MiddleName, "MiddleName");
				if (!LastName.isEmpty())
				actionLib.type(QuoteBasic.LastName, LastName, "LastName");
				
				if (!DOB_Day.isEmpty())
				actionLib.Click(QuoteBasic.DayOption(DOB_Day), "DOB Day ");
				if (!DOB_Month.isEmpty())
				actionLib.Click(QuoteBasic.MonthOption(DOB_Month), "DOB Month ");
				if (!DOB_Year.isEmpty())
				actionLib.Click(QuoteBasic.YearOption(DOB_Year), "DOB Year ");
				
				if (!MaritalStatus.isEmpty())
				{
					actionLib.Click(QuoteBasic.MaritalStatus, "MaritalStatus ");
					actionLib.Click(QuoteBasic.MaritalStatusOption(MaritalStatus), "MaritalStatus ");
				}
				if (!NoOfDep.isEmpty())
				actionLib.type(QuoteBasic.FinancialDependents, NoOfDep, "FinancialDependents");
				
				extentLogs.pass("Personal details","Successfully entered Personal details");
			}
		}
		catch(Exception e)
		{	
			extentLogs.fail("Personal details","Not able to enter data into Personal details section");
			e.printStackTrace();			
		}
	}

	public void fnQuote_EnterContactDetails(String EmilAddress, String Mobile) throws Throwable
	{		
		try
		{	
			/*if(actionLib.waitForElementPresent(QuoteBasic.Email, 15))
			{
				extentLogs.pass("Contact details","Contact details section displayed");*/
				
				if (!EmilAddress.isEmpty())
				actionLib.type(QuoteBasic.Email, EmilAddress, "Email");
				if (!Mobile.isEmpty())
				actionLib.type(QuoteBasic.Mobile, Mobile, "Mobile");
				
				extentLogs.pass("Contact details","Successfully entered Contact details");
			//}
		}
		catch(Exception e)
		{	
			extentLogs.fail("Contact details","Not able to enter data into Contact details section");
			e.printStackTrace();			
		}
	}
	
	public void fnQuote_EnterIdentificationDetails(String DriverLicence) throws Throwable
	{		
		try
		{	
			/*if(actionLib.waitForElementPresent(QuoteBasic.DrivingLicence, 15))
			{
				extentLogs.pass("Identification details","Identification details section displayed");*/
				if (!DriverLicence.isEmpty())
				actionLib.type(QuoteBasic.DrivingLicence, DriverLicence, "DrivingLicence");				
				extentLogs.pass("Identification details","Successfully entered Identification details");
			//}
		}
		catch(Exception e)
		{	
			extentLogs.fail("Identification details","Not able to enter data into Identification details section");
			e.printStackTrace();			
		}
	}
	
	public void fnQuote_EnterAddressHistoryDetails_AndClickNext(String HomeAddress, String TimeAtAdd_Years, String TimeAtAdd_Months, String LivingArrangements) throws Throwable
	{
		
		try
		{	
			if(actionLib.waitForElementPresent(QuoteBasic.HomeAddress, 15))
			{
				extentLogs.pass("Address History details","Address History details section displayed");
				
				if (!HomeAddress.isEmpty())
				{
					actionLib.type(QuoteBasic.HomeAddress, HomeAddress, "HomeAddress");
					Thread.sleep(9000);
					actionLib.Click(QuoteBasic.HomeAddressOption(HomeAddress), "HomeAddressOption ");
				}
				if (!TimeAtAdd_Years.isEmpty())
				actionLib.type(QuoteBasic.TimeatAddressYears, TimeAtAdd_Years, "TimeatAddressYears");
				if (!TimeAtAdd_Months.isEmpty())
				actionLib.type(QuoteBasic.TimeatAddressMonths, TimeAtAdd_Months, "TimeatAddressMonths");
				if (!LivingArrangements.isEmpty())
				actionLib.Click(QuoteBasic.LivingArrangements(LivingArrangements), "LivingArrangements ");
				
				extentLogs.pass("Address History details","Successfully entered Address History details");	
				
				actionLib.Click(QuoteBasic.Next, "Next ");
				Thread.sleep(9000);
				
							
			}
		}
		catch(Exception e)
		{	
			extentLogs.fail("Address History details","Not able to enter data into Address History details section");
			e.printStackTrace();			
		}	
	}
	
}




