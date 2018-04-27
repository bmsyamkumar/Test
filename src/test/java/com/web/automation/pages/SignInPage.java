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


public class SignInPage extends BasePage {	
	public WebDriver driver=ActionsLibrary.driver;
	public ExtentLogs extentLogs = new ExtentLogs();
	Optional<Long> timeoutInSecond = Optional.of(Long.parseLong("5"));

	public SignInPage(WebDriver driver) {
		super(driver);		
	}
	
	
	public void fnSignIn(String UserID, String Password) throws Throwable
	{		
		try
		{	
			if(actionLib.waitForElementPresent(SignIn.UserID, 15))
			{	
				extentLogs.pass("SignIn page","SignIn page displayed");
				
				if (!UserID.isEmpty())
					actionLib.type(SignIn.UserID, UserID, "User ID");
				if (!Password.isEmpty())
					actionLib.type(SignIn.Password, Password, "Password");
				actionLib.Click(SignIn.SignIn, "SiginIn Button");
				Thread.sleep(5000);
				extentLogs.pass("Sign","SignIn Successfull");					
			}
		}
		catch(Exception e)
		{	
			extentLogs.fail("Sign","Not able to Signin");
			e.printStackTrace();			
		}
	}
		
}




