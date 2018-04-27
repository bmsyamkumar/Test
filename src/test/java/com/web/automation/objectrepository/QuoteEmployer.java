package com.web.automation.objectrepository;

import org.openqa.selenium.By;
public class QuoteEmployer{
		
	public static By EmploymentStatus = By.id("btnCurrentEmpStatus");
	public static By EmploymentStatusOption(String EmploymentStatusOption)
	{
		return By.xpath("(//ul/li/a[contains(text(),'" + EmploymentStatusOption + "')])[1]");
	}
	public static By TimeatEmployerYears = By.xpath("//input[@ng-model='quote.CurrentEmployment.TimeAtYears']");
	public static By TimeatEmployerMonths = By.xpath("//input[@ng-model='quote.CurrentEmployment.TimeAtMonths']");
	public static By YearlyIncomeBeforeTax=By.xpath("(//currency[@data='quote.Income']//input)[1]");
	public static By RentPayments=By.xpath("(//currency[@data='quote.RentPayment']//input)[1]");
	public static By MortgagePayments=By.xpath("(//currency[@data='quote.MortgagePayment']//input)[1]");
	
	public static By RentFrequencyWeekly=By.xpath("//button[contains(@ng-click,'quote.RentFrequency') and contains(text(),'Weekly')]");
	public static By RentFrequencyMonthly=By.xpath("//button[contains(@ng-click,'quote.RentFrequency') and contains(text(),'Monthly')]");
	public static By RentFrequencyYearly=By.xpath("//button[contains(@ng-click,'quote.RentFrequency') and contains(text(),'Yearly')]");
	public static By MortgageFrequencyWeekly=By.xpath("//button[contains(@ng-click,'quote.MortgageFrequency') and contains(text(),'Weekly')]");
	public static By MortgageFrequencyMonthly=By.xpath("//button[contains(@ng-click,'quote.MortgageFrequency') and contains(text(),'Monthly')]");
	public static By MortgageFrequencyYearly=By.xpath("//button[contains(@ng-click,'quote.MortgageFrequency') and contains(text(),'Yearly')]");
	
	public static By PropertyValue=By.xpath("(//currency[@data='quote.EstimatedHomeValue']//input)[1]");
	public static By OutstandingMortgageAmount=By.xpath("(//currency[@data='quote.OutstandingMortgageAmount']//input)[1]");
	
	public static By HavePersonalLoans_Yes=By.xpath("//button[contains(@ng-click,'quote.HasOtherLoan') and contains(text(),'Yes')]");
	public static By HavePersonalLoans_No=By.xpath("//button[contains(@ng-click,'quote.HasOtherLoan') and contains(text(),'No')]");
	public static By AmountPayingForPersonalLoans=By.xpath("(//currency[@data='quote.LoanPayment']//input)[1]");
	public static By PersonalLoanFrequencyWeekly=By.xpath("//button[contains(@ng-click,'quote.LoanPaymentFrequency') and contains(text(),'Weekly')]");
	public static By PersonalLoanFrequencyMonthly=By.xpath("//button[contains(@ng-click,'quote.LoanPaymentFrequency') and contains(text(),'Monthly')]");
	public static By PersonalLoanFrequencyYearly=By.xpath("//button[contains(@ng-click,'quote.LoanPaymentFrequency') and contains(text(),'Yearly')]");
		
	public static By HaveCreditCards_Yes=By.xpath("//button[contains(@ng-click,'quote.HasCreditCards') and contains(text(),'Yes')]");
	public static By HaveCreditCards_No=By.xpath("//button[contains(@ng-click,'quote.HasCreditCards') and contains(text(),'No')]");
	public static By NoOfCreditCards=By.xpath("//input[@ng-model='quote.CreditCards']");
	public static By TotalCombinedCardLimit=By.xpath("(//currency[@data='quote.CombinedCreditCardLimit']//input)[1]");
	
	public static By TnC_PrivacyConsent=By.xpath("//i[contains(@ng-click,'quote.PrivacyConsent')]");
	public static By TnC_Consent=By.xpath("//i[contains(@ng-click,'quote.Consent')]");
	public static By TnC_Authorise=By.xpath("//i[contains(@ng-click,'quote.Authorize')]");
	public static By GetEstimate=By.xpath("//button[contains(text(),'Get Estimate')]");
	//
	
	//mobile
	public static By mLoanAmount=By.xpath("//android.widget.EditText[@text='Text input with dropdown button' and @index='1']");
	public static By mLoanPurposeButton=By.id("btnLoanPurpose");
	
	
	
	
	
			
			

}
	
