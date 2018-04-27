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


public class HomePage extends BasePage {	
	public WebDriver driver=ActionsLibrary.driver;
	public ExtentLogs extentLogs = new ExtentLogs();
	Optional<Long> timeoutInSecond = Optional.of(Long.parseLong("5"));

	public HomePage(WebDriver driver) {
		super(driver);		
	}
	
	
	public void fnNavigateToJournal() throws Throwable
	{		
		try
		{	
			//if(actionLib.waitForElementPresent(Home.Navigator, 15))
			{	
				extentLogs.pass("Home page","Home page displayed");
				
				actionLib.Click(Home.Navigator, "Navigator");
				actionLib.Click(Home.Journals, "Journals");
				
				extentLogs.pass("Journal Page","Navigated to Journal page");					
			}
		}
		catch(Exception e)
		{	
			extentLogs.fail("Journal Page","Not able to navigate to Journal page");
			e.printStackTrace();			
		}
	}

	public void fnNavigateToBilling() throws Throwable
	{		
		try
		{	
			if(actionLib.waitForElementPresent(Home.Navigator, 15))
			{	
				extentLogs.pass("Home page","Home page displayed");
				
				actionLib.Click(Home.Navigator, "Navigator");
				actionLib.Click(Home.Billing, "Billing");
				
				extentLogs.pass("Billing Page","Navigated to Billing page");					
			}
		}
		catch(Exception e)
		{	
			extentLogs.fail("Billing Page","Not able to navigate to Billing page");
			e.printStackTrace();			
		}
	}
}




