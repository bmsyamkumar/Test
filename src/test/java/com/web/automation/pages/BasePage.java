package com.web.automation.pages;

import org.openqa.selenium.WebDriver;
import com.google.common.base.Optional;
import com.mobile.automation.accelerators.MobileLibrary;
//import com.mobile.automation.objectRepository.BasePage_OR;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.logs.ExtentLogs;
import com.web.automation.utilities.CommonVariables;
import com.web.automation.utilities.ConfigManager;

public class BasePage extends MobileLibrary
{
	//public WebDriver driver;
	public ActionsLibrary actionLib;
	public MobileLibrary MobileActionLib;
	
	public ExtentLogs extentLogs=new ExtentLogs();
	Optional<Long> timeoutInSecond = Optional.of(Long.parseLong("5"));
	
	public BasePage(WebDriver driver)
	{
		if(CommonVariables.getDriver()==null){
			CommonVariables.setDriver(driver);
		}
		
		actionLib = CommonVariables.getActionLib();
		MobileActionLib = CommonVariables.getMobileActionLib();
		
		try {
			if(!ConfigManager.ArePropertiesSet.get()){
				ConfigManager.setProperties();
				ConfigManager.UpdateProperties();
			}
		} 
		catch (Exception e) {
			System.out.println("Failed to load Properties file");
		}
	}

	public Optional<Long> timeout(Integer time)
	{
		return Optional.of(Long.parseLong(String.valueOf(time)));
	}

}