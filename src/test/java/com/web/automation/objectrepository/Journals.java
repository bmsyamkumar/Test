package com.web.automation.objectrepository;

import org.openqa.selenium.By;

public class Journals{
	
	
	public static By Tasks = By.xpath("//img[@title='Tasks']");
	public static By CreateJournal = By.xpath("//li/a[text()='Create Journal']");
		
	public static By BatchName = By.xpath("//input[contains(@name,'BatchName')]");
	public static By BatchDescription = By.xpath("//textarea[contains(@name,'BatchDescription')]");
	
	public static By JournalName = By.xpath("//input[contains(@name,'JournalName')]");
	public static By JournalDescription = By.xpath("//textarea[contains(@name,'JournalDescription')]");
	
	public static By Category = By.xpath("//input[contains(@name,'userJeCategoryNameId1')]");
	public static By SelectAccount = By.xpath("//a[@title='Select: Account']");
	public static By JournalLinesTable = By.xpath("//table[@summary='Journal Lines']");
	
	public static By AccountNumberJournalLine1= By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:0:accountCS::content");
	
	public static By AccountSearchCompany= By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:0:accountSPOP_query:value00::content");
	public static By AccountSearchBusinessLine= By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:0:accountSPOP_query:value10::content");
	public static By AccountSearchAccount= By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:0:accountSPOP_query:value20::content");
	public static By AccountSearchFuture= By.id("");
	public static By AccountSearch= By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:0:accountQRBT");
	public static By AccountOK= By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:0:accountSEl");
	
	public static By Line1Debit= By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:0:EnteredDr::content");
	public static By Line1Credit= By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:0:EnteredCr::content");
	public static By Line1Description= By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:0:it4::content");
	
	public static By AccountNumberJournalLine2= By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:1:accountCS::content");
	
	public static By Line2Debit= By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:1:EnteredDr::content");
	public static By Line2Credit= By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:1:EnteredCr::content");
	public static By Line2Description= By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:1:it4::content");
	
	public static By Save = By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:saveBatch']/table/tbody/tr/td[1]/a/span");
	public static By Complete = By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:completeButton']/table/tbody/tr/td[1]/a/span");
	public static By Post = By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:postBatch']/table/tbody/tr/td[1]/a/span");
	public static By SaveAndClose = By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:cmi4']/td[2]");
	
	
	//200.0000.600060.0000
	
	
	
}
	
