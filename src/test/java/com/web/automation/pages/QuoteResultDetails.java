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
import com.web.automation.objectrepository.QuoteResult;;

public class QuoteResultDetails extends BasePage {	
	public WebDriver driver=ActionsLibrary.driver;
	public ExtentLogs extentLogs = new ExtentLogs();
	Optional<Long> timeoutInSecond = Optional.of(Long.parseLong("5"));

	public QuoteResultDetails(WebDriver driver) {
		super(driver);		
	}
	
	
	public void fnResult_Validate_Error() throws Throwable
	{		
		try
		{	
			if(actionLib.waitForElementPresent(QuoteResult.SorrySomethingWentWrong, 15))
			{	
				extentLogs.pass("Quote Results page","Error result page displayed");
				
				if(actionLib.waitForElementPresent(QuoteResult.SorrySomethingWentWrong, 15))
					extentLogs.pass("Result validation","Successfully verified 'Sorry , something went wrong' text on result page");
				if(actionLib.waitForElementPresent(QuoteResult.ToFollowUpOnYourApplication, 15))
					extentLogs.pass("Result validation","Successfully verified 'To follow up on your application please leave us a note at' text on result page");
				if(actionLib.waitForElementPresent(QuoteResult.Contact_ErrorResult, 15))
					extentLogs.pass("Result validation","Successfully verified 'To follow up on your application please leave us a note at' text on result page");
				if(actionLib.waitForElementPresent(QuoteResult.PleaseQuoteYourEmailAddress, 15))
					extentLogs.pass("Result validation","Successfully verified 'Please quote your email address and phone number when contacting us' text on result page");
				
				extentLogs.pass("Quote Results validation","Successfully verified Error result page");					
			}
		}
		catch(Exception e)
		{	
			extentLogs.fail("Quote Results validation","Not able to verify Error result page");
			e.printStackTrace();			
		}
	}
	
	public void fnResult_Validate_IDMatrix_Veda_ThankYou() throws Throwable
	{		
		try
		{	
			if(actionLib.waitForElementPresent(QuoteResult.ThankYou, 15))
			{	
				extentLogs.pass("Quote Results page","IDMatrix/Veda/Refer/ThankYou result page displayed");
				if(actionLib.waitForElementPresent(QuoteResult.ThankYou, 15))
					extentLogs.pass("Result validation","Successfully verified 'Thank you ' text on result page");
				if(actionLib.waitForElementPresent(QuoteResult.YourCreditScoreHasNotImpacted, 15))
					extentLogs.pass("Result validation","Successfully verified 'Your credit score has not been impacted with this enquiry' text on result page");
				if(actionLib.waitForElementPresent(QuoteResult.UnfortunatelyAtThisTimeWeCannotFindProduct, 15))
					extentLogs.pass("Result validation","Successfully verified 'Unfortunately at this time we cannot find a product that suits your specific situation' text on result page");
				if(actionLib.waitForElementPresent(QuoteResult.YouCanLeaveUsANote, 15))
					extentLogs.pass("Result validation","Successfully verified 'You can leave us a note at' text on result page");
				if(actionLib.waitForElementPresent(QuoteResult.Contact, 15))
					extentLogs.pass("Result validation","Successfully verified 'contact@wisr.com.au' text on result page");
				
				extentLogs.pass("Quote IDMatrix/Veda/Refer/ThankYou validation","Successfully verified IDMatrix/Veda/Refer/ThankYou result page");					
			}
		}
		catch(Exception e)
		{	
			extentLogs.fail("Quote IDMatrix/Veda/Refer/ThankYou validation","Not able to verify IDMatrix/Veda/Refer/ThankYou result page");
			e.printStackTrace();			
		}
	}
	
	public void fnResult_Validate_ReferFSA() throws Throwable
	{		
		try
		{	
			//if(actionLib.waitForElementPresent(QuoteResult.ThankYou, 15))
			//{	
				//extentLogs.pass("Quote Results page","IDMatrix/Veda/Refer/ThankYou result page displayed");
				if(actionLib.waitForElementPresent(QuoteResult.ThankYou_FSARefer, 15))
					extentLogs.pass("Result validation","Successfully verified 'Thank you ' text on result page");
				if(actionLib.waitForElementPresent(QuoteResult.YourCreditScoreHasNotImpacted_FSARefer, 15))
					extentLogs.pass("Result validation","Successfully verified 'Your credit score has not been impacted with this enquiry' text on result page");
				if(actionLib.waitForElementPresent(QuoteResult.UnfortunatelyWeCannotOfferYouALoanAtThisTime, 15))
					extentLogs.pass("Result validation","Successfully verified 'Unfortunately we cannot offer you a loan at this time text on result page");
				if(actionLib.waitForElementPresent(QuoteResult.TheGoodNews, 15))
					extentLogs.pass("Result validation","Successfully verified 'The Good News is we are able to setup an opportunity to have a personal representative assigned to you at Fox Symes' text on result page");
				if(actionLib.waitForElementPresent(QuoteResult.WhoMayBeAbleToAssistYouWithTheirWiderRangeOfFinancialServices, 15))
					extentLogs.pass("Result validation","Successfully verified 'who may be able to assist you with their wider range of financial services' text on result page");
				if(actionLib.waitForElementPresent(QuoteResult.WeHavePassedOnYourNameEmailAndContactnumber, 15))
					extentLogs.pass("Result validation","Successfully verified 'We have passed on your name, email and contact number, and your assigned Fox Symes representative' text on result page");
				if(actionLib.waitForElementPresent(QuoteResult.WillReachOutToYouWithinTheNextCoupleOfBusinessHours, 15))
					extentLogs.pass("Result validation","Successfully verified 'will reach out to you within the next couple of business hours' text on result page");
				
				extentLogs.pass("Quote ReferFSA validation","Successfully verified ReferFSA result page");					
			//}
		}
		catch(Exception e)
		{	
			extentLogs.fail("Quote ReferFSA validation","Not able to verify ReferFSA result page");
			e.printStackTrace();			
		}
	}
		
	public void fnResult_Validate_Accept() throws Throwable
	{		
		try
		{	
			if(actionLib.waitForElementPresent(QuoteResult.WeHaveGotSomeGreatNews, 15))
			{	
				extentLogs.pass("Quote Results page","Accept result page displayed");
				if(actionLib.waitForElementPresent(QuoteResult.WeHaveGotSomeGreatNews, 15))
					extentLogs.pass("Result validation","Successfully verified 'We have got some great news' text on result page");
				if(actionLib.waitForElementPresent(QuoteResult.BasedOnTheInformation, 15))
					extentLogs.pass("Result validation","Successfully verified 'Based on the information you have shared with us so far, you might be eligible for a personalised' text on result page");
				if(actionLib.waitForElementPresent(QuoteResult.LoanOf, 15))
					extentLogs.pass("Result validation","Successfully verified 'loan of' text on result page");
				if(actionLib.waitForElementPresent(QuoteResult.WhatIsTheNextStep, 15))
					extentLogs.pass("Result validation","Successfully verified 'What is the next step?' text on result page");
				if(actionLib.waitForElementPresent(QuoteResult.SelectTheRateAndRepaymentOption, 15))
					extentLogs.pass("Result validation","Successfully verified 'Select the rate and repayment option' text on result page");				
				if(actionLib.waitForElementPresent(QuoteResult.WhichBestSuitesYourNeeds, 15))
					extentLogs.pass("Result validation","Successfully verified 'which best suits your needs and then click' text on result page");
				if(actionLib.waitForElementPresent(QuoteResult.NextStep, 15))
					extentLogs.pass("Result validation","Successfully verified 'Next Step' button on result page");	
				
				extentLogs.pass("Quote Results validation","Successfully verified Accept result page");					
			}
		}
		catch(Exception e)
		{	
			extentLogs.fail("Quote Results validation","Not able to verify Accept result page");
			e.printStackTrace();			
		}
	}
	
	public void fnResult_Validate_ReferHomeBuyer() throws Throwable
	{		
		try
		{	
			if(actionLib.waitForElementPresent(QuoteResult.ThankYou_ReferHomeBuyerResult, 15))
			{	
				extentLogs.pass("Quote Results page","Refer Home Buyer result page displayed");
				
				if(actionLib.waitForElementPresent(QuoteResult.ThankYou_ReferHomeBuyerResult, 15))
					extentLogs.pass("Result validation","Successfully verified 'Thank you ' text on result page");
				if(actionLib.waitForElementPresent(QuoteResult.YourCreditScoreHasNotImpacted_ReferHomeBuyerResult, 15))
					extentLogs.pass("Result validation","Successfully verified 'Your credit score has not been impacted with this enquiry' text on result page");
				if(actionLib.waitForElementPresent(QuoteResult.WeMayNeedToGetSomeMoreInfoAboutYou, 15))
					extentLogs.pass("Result validation","Successfully verified 'We may need to get some more information about you' text on result page");
				if(actionLib.waitForElementPresent(QuoteResult.OneOfOurCustomerRepresentativesWillContactYouSoon, 15))
					extentLogs.pass("Result validation","Successfully verified 'One of our customer representatives will contact you soon by phone or email' text on result page");
				if(actionLib.waitForElementPresent(QuoteResult.HoweverIfNoOneContactsYou, 15))
					extentLogs.pass("Result validation","Successfully verified 'However if no-one contacts you in a day or two, you can leave us a note at' text on result page");
				if(actionLib.waitForElementPresent(QuoteResult.Contact_ReferHomeBuyerResult, 15))
					extentLogs.pass("Result validation","Successfully verified 'contact@wisr.com.au' text on result page");
				
				extentLogs.pass("Quote Results validation","Successfully verified Refer Home Buyer result page");					
			}
		}
		catch(Exception e)
		{	
			extentLogs.fail("Quote Results validation","Not able to verify Refer Home Buyer result page");
			e.printStackTrace();			
		}
	}
	
	public void fnResult_Validate_ReferBizCover() throws Throwable
	{		
		try
		{	
			if(actionLib.waitForElementPresent(QuoteResult.ThankYou_ReferBizCoverResult, 15))
			{	
				extentLogs.pass("Quote Results page","Refer BizCover result page displayed");
				
				if(actionLib.waitForElementPresent(QuoteResult.ThankYou_ReferBizCoverResult, 15))
					extentLogs.pass("Result validation","Successfully verified 'Thank you ' text on result page");
				if(actionLib.waitForElementPresent(QuoteResult.YourCreditScoreHasNotImpacted_ReferBizCoverResult, 15))
					extentLogs.pass("Result validation","Successfully verified 'Your credit score has not been impacted with this enquiry' text on result page");
				if(actionLib.waitForElementPresent(QuoteResult.UnfortunatelyAtThisTimeWeCannotOfferYouALoanProduct, 15))
					extentLogs.pass("Result validation","Successfully verified 'Unfortunately at this time we cannot offer you a loan product' text on result page");
				if(actionLib.waitForElementPresent(QuoteResult.YouCanLeaveUsANote_ReferBizCoverResult, 15))
					extentLogs.pass("Result validation","Successfully verified 'You can leave us a note at' text on result page");
				if(actionLib.waitForElementPresent(QuoteResult.Contact_BizCoverResult, 15))
					extentLogs.pass("Result validation","Successfully verified 'contact@wisr.com.au' text on result page");
				if(actionLib.waitForElementPresent(QuoteResult.BizCoverPage, 15))
					extentLogs.pass("Result validation","Successfully verified 'Biz Cover Page : Step No 10' text on result page");
				
				extentLogs.pass("Quote Results validation","Successfully verified Refer BizCover result page");					
			}
		}
		catch(Exception e)
		{	
			extentLogs.fail("Quote Results validation","Not able to verify Refer BizCover result page");
			e.printStackTrace();			
		}
	}
	
}




