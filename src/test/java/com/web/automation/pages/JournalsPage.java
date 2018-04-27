package com.web.automation.pages;


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

import com.web.automation.objectrepository.SignIn;
import com.web.automation.objectrepository.Home;
import com.web.automation.objectrepository.Journals;
import com.web.automation.objectrepository.QuoteBasic;


public class JournalsPage extends BasePage {	
	public WebDriver driver=ActionsLibrary.driver;
	public ExtentLogs extentLogs = new ExtentLogs();
	Optional<Long> timeoutInSecond = Optional.of(Long.parseLong("5"));

	public JournalsPage(WebDriver driver) {
		super(driver);		
	}
	
	
	//public void fnCreateJournal(String BatchName, String BatchDescription, String JournalName, String JournalDescription, String Category, String Company1, String BussLine1, String AccountNo1, String Future1, String Debit, String DebitDesc, String Company2, String BussLine2, String AccountNo2, String Future2, String Credit, String CreditDesc) throws Throwable
	public void fnCreateJournal(String BatchName, String BatchDescription, String JournalName, String JournalDescription) throws Throwable
	{		
		try
		{	
			if(actionLib.waitForElementPresent(Journals.Tasks, 15))
			{	
				extentLogs.pass("Journals page","Journals page displayed");
				
				actionLib.Click(Journals.Tasks, "Tasks");
				Thread.sleep(3000);
				actionLib.Click(Journals.CreateJournal, "CreateJournal");
				Thread.sleep(3000);
				
				
				if (!BatchName.isEmpty())
					actionLib.type(Journals.BatchName, BatchName, "BatchName");
				if (!BatchDescription.isEmpty())
					actionLib.type(Journals.BatchDescription, BatchDescription, "BatchDescription");
				
				if (!JournalName.isEmpty())
					actionLib.type(Journals.JournalName, BatchName, "JournalName");
				if (!JournalDescription.isEmpty())
					actionLib.type(Journals.JournalDescription, JournalDescription, "JournalDescription");
				
				
				
				extentLogs.pass("Create Journal","Create Journal Successfull");					
			}
		}
		catch(Exception e)
		{	
			extentLogs.fail("Create Journal","Not able to Create Journal");
			e.printStackTrace();			
		}
	}
		
}




