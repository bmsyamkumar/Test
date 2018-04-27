package com.web.automation.objectrepository;

import org.openqa.selenium.By;

public class QuoteBasic{
	
	//Loan Details
	public static By LoanAmount=By.xpath("(//currency[@data='quote.LoanAmount']//input)[1]");
	public static By LoanPurposeButton=By.id("btnLoanPurpose");
	public static By LoanPurpose(String LoanPur)
	{
		return By.xpath("//ul/li/a[contains(text(),'" + LoanPur + "')]");
	}
	public static By LoanTerm_3Years = By.xpath("(//button[contains(text(),'3 Years')])[1]");
	public static By LoanTerm_5Years = By.xpath("(//button[contains(text(),'5 Years')])[1]");
	
	//Personal Details
	public static By Title_Mr = By.xpath("//button[text()='Mr']");
	public static By Title_Mrs = By.xpath("//button[text()='Mrs']");
	public static By Title_More = By.id("btnCusTitle");
	public static By Title_More_Option(String TitleOption)
	{
		return By.xpath("//ul/li/a[contains(text(),'" + TitleOption + "')]");
	}
	public static By FirstName = By.id("txtFirstName");
	public static By MiddleName = By.id("txtMiddleName");
	public static By LastName = By.id("txtLastName");
	public static By DayOption(String DayOption)
	{
		return By.xpath("//select[@name='dateFields.day']/option[@label='" + DayOption + "']");
	}
	public static By MonthOption(String MonthOption)
	{
		return By.xpath("//select[@name='dateFields.month']/option[@label='" + MonthOption + "']");
	}
	public static By YearOption(String YearOption)
	{
		return By.xpath("//select[@name='dateFields.year']/option[@label='" + YearOption + "']");
	}
	public static By MaritalStatus = By.id("btnMaritalStatus");
	public static By MaritalStatusOption(String MaritalStatusOption)
	{
		return By.xpath("//ul/li/a[contains(text(),'" + MaritalStatusOption + "')]");
	}
	public static By FinancialDependents = By.xpath("//input[@ng-model='quote.Dependents']");
	
	//Contact Details
	public static By Email = By.id("txtEmail");
	public static By Mobile = By.id("txtMobile");
	
	//Identification Details
	public static By DrivingLicence = By.xpath("//input[@ng-model='quote.DrivingLicence']");
	
	//Address History
	public static By HomeAddress = By.xpath("//div[@id='address']/div/input");
	/*public static By HomeAddressOption(String HomeAddressOption)
	{
		return By.xpath("//div[@id='address']//ul/li/a[contains(text(),'" + HomeAddressOption.toUpperCase() + "')]");
	}*/
	public static By HomeAddressOption(String HomeAddressOption)
	{
		return By.xpath("//div[@id='address']//ul/li/a[contains(text(),'1 MARTIN PL, SYDNEY NSW 2000')]");
	}
	public static By TimeatAddressYears = By.xpath("//input[@ng-model='quote.CurrentAddress.TimeAtYears']");
	public static By TimeatAddressMonths = By.xpath("//input[@ng-model='quote.CurrentAddress.TimeAtMonths']");
	public static By LivingArrangements(String LivingArrangemetOption)
	{
		return By.xpath("//select[@ng-model='quote.CurrentAddress.LivingArrangements']/option[contains(text(),'" + LivingArrangemetOption + "')]");
	}
	
	//Errors	
	public static By LoanAmountMandatoryError = By.xpath("//span[contains(text(),'Please correct the following:')]//ul/li[text()='Loan amount is required']");
	public static By LoanAmountRangeError = By.xpath("//span[contains(text(),'Please correct the following:')]//ul/li[text()='Loan amount must be between $5000 and $35000']");
	public static By LoanPurposeMandatoryError = By.xpath("//span[contains(text(),'Please correct the following:')]//ul/li[text()='Please specify the loan purpose']");
	public static By LoanTermMandatoryError = By.xpath("//span[contains(text(),'Please correct the following:')]//ul/li[text()='Valid Loan term required (3 years or 5 years)']");
	public static By TitleMandatoryError = By.xpath("//span[contains(text(),'Please correct the following:')]//ul/li[text()='Please select a valid title']");
	public static By FirstNameMandatoryError = By.xpath("//span[contains(text(),'Please correct the following:')]//ul/li[text()='First name is required']");
	public static By LastNameMandatoryError = By.xpath("//span[contains(text(),'Please correct the following:')]//ul/li[text()='Last name is required']");
	public static By AgeLimitError = By.xpath("//span[contains(text(),'Please correct the following:')]//ul/li[text()='Applicant must be at least 18 years of age']");
	public static By MaritalStatusMandatoryError = By.xpath("//span[contains(text(),'Please correct the following:')]//ul/li[text()='Marital status required']");
	public static By ValidEmailError = By.xpath("//span[contains(text(),'Please correct the following:')]//ul/li[text()='Valid Email is required']");
	public static By DrivingLicenceMandatoryError = By.xpath("//span[contains(text(),'Please correct the following:')]//ul/li[text()='Driving licence required']");
	public static By CompleteAddressError = By.xpath("//span[contains(text(),'Please correct the following:')]//ul/li[text()='Please provide complete current address']");
	
	public static By Next = By.xpath("(//button[contains(text(),'Next')])[1]");		

}
	
