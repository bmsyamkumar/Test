package com.web.automation.objectrepository;

import org.openqa.selenium.By;
public class QuoteResult{
		
	//QuoteErrorResult
	public static By SorrySomethingWentWrong=By.xpath("//h1[contains(text(),'Sorry , something went wrong')]");
	public static By ToFollowUpOnYourApplication=By.xpath("//span[contains(text(),'To follow up on your application please leave us a note at')]");
	public static By Contact_ErrorResult=By.xpath("//span[contains(text(),'To follow up on your application please leave us a note at')]/a[contains(text(),'contact@wisr.com.au')]");
	public static By PleaseQuoteYourEmailAddress=By.xpath("//span[contains(text(),'Please quote your email address and phone number when contacting us')]");
	
	//QuoteIDMatrixRecordNotFound -- same for QuoteVedaRecordNotFound and QuoteThankYouResult
	public static By ThankYou=By.xpath("(//h1[contains(text(),'Thank you ')])[2]");
	public static By YourCreditScoreHasNotImpacted=By.xpath("(//span[contains(text(),'Your credit score has not been impacted with this enquiry')])[1]");
	public static By UnfortunatelyAtThisTimeWeCannotFindProduct=By.xpath("//span[contains(text(),'Unfortunately at this time we cannot find a product that suits your specific situation')]");
	public static By YouCanLeaveUsANote=By.xpath("(//span[contains(text(),'You can leave us a note at')])[1]");
	public static By Contact=By.xpath("(//span[contains(text(),'You can leave us a note at')])[1]/a[contains(text(),'contact@wisr.com.au')]");
	
	//QuoteVedaRecordNotFound
		
	//QuoteAcceptResult
	public static By WeHaveGotSomeGreatNews=By.xpath("//h1/b[contains(text(),' got some great news')]");
	public static By BasedOnTheInformation=By.xpath("//span[contains(text(),'Based on the information you’ve shared with us so far, you might be eligible for a personalised')]");
	public static By LoanOf=By.xpath("//span[contains(text(),'loan of')]");
	public static By WhatIsTheNextStep=By.xpath("//h1[contains(text(),'s the next step?')]");
	public static By SelectTheRateAndRepaymentOption=By.xpath("//span[contains(text(),'which best suits your needs and then click')]/b[contains(text(),'Select the rate and repayment option')]");
	public static By WhichBestSuitesYourNeeds=By.xpath("//span[contains(text(),'which best suits your needs and then click')]");
	public static By NextStep=By.xpath("//button[contains(text(),'Next Step')]");
		
	//QuoteReferHomeBuyerResult
	public static By ThankYou_ReferHomeBuyerResult=By.xpath("(//h1[contains(text(),'Thank you ')])[4]");
	public static By YourCreditScoreHasNotImpacted_ReferHomeBuyerResult=By.xpath("(//span[contains(text(),'Your credit score has not been impacted with this enquiry')])[3]");
	public static By WeMayNeedToGetSomeMoreInfoAboutYou=By.xpath("(//span[contains(text(),'We may need to get some more information about you.')])[2]");
	public static By OneOfOurCustomerRepresentativesWillContactYouSoon=By.xpath("(//span[contains(text(),'One of our customer representatives will contact you soon by phone or email.')])[2]");
	public static By HoweverIfNoOneContactsYou=By.xpath("(//span[contains(text(),'However if no-one contacts you in a day or two, you can leave us a note at')])[2]");
	public static By Contact_ReferHomeBuyerResult=By.xpath("(//span[contains(text(),'However if no-one contacts you in a day or two, you can leave us a note at')])[2]/a[contains(text(),'contact@wisr.com.au')]");
		
	//QuoteFSAReferResult
	public static By ThankYou_FSARefer=By.xpath("(//h1[contains(text(),'Thank you ')])[3]");
	public static By YourCreditScoreHasNotImpacted_FSARefer=By.xpath("(//span[contains(text(),'Your credit score has not been impacted with this enquiry')])[2]");
	public static By UnfortunatelyWeCannotOfferYouALoanAtThisTime=By.xpath("//span[contains(text(),'Unfortunately we cannot offer you a loan product at this time')]");
	public static By TheGoodNews=By.xpath("//span[contains(text(),'The')]/b[text()='Good News']");
	public static By WhoMayBeAbleToAssistYouWithTheirWiderRangeOfFinancialServices=By.xpath("//span[contains(text(),'who may be able to assist you with their wider range of financial services.')]");
	public static By WeHavePassedOnYourNameEmailAndContactnumber=By.xpath("//span[contains(text(),'We have passed on your name, email and contact number, and your assigned')]");
	public static By WillReachOutToYouWithinTheNextCoupleOfBusinessHours=By.xpath("//span[contains(text(),'will reach out to you within the next couple of business hours.')]");
	
	
	//QuoteReferBizCoverResult
	public static By ThankYou_ReferBizCoverResult=By.xpath("(//h1[contains(text(),'Thank you ')])[4]");
	public static By YourCreditScoreHasNotImpacted_ReferBizCoverResult=By.xpath("(//span[contains(text(),'Your credit score has not been impacted with this enquiry')])[4]");
	public static By UnfortunatelyAtThisTimeWeCannotOfferYouALoanProduct=By.xpath("//span[contains(text(),'Unfortunately at this time we cannot offer you a loan product.')]");
	public static By YouCanLeaveUsANote_ReferBizCoverResult=By.xpath("(//span[contains(text(),'You can leave us a note at')])[2]");
	public static By Contact_BizCoverResult=By.xpath("(//span[contains(text(),'You can leave us a note at')])[2]/a[contains(text(),'contact@wisr.com.au')]");

	public static By BizCoverPage=By.xpath("//h3[contains(text(),'Biz Cover Page : Step No 10')]");
	public static By IsYourBusinessProtected=By.xpath("//h2[contains(text(),'Is your business protected?')]");
	public static By BizCoverIsProudToHavePartneredWithWisr=By.xpath("//td[contains(text(),'BizCover is proud to have partnered with Wisr to offer you the quickest, easiest and most cost effective way to buy your business insurance. We’ve eliminated the lengthy paperwork, and there’s no waiting around for brokers to get back to you')]");
	public static By CompareQuotesFromLeadingAustralianInsurers=By.xpath("//ul/li[contains(text(),'Compare Quotes from Leading Australian Insurers')]");
	public static By InstantOnlineCover=By.xpath("//ul/li[contains(text(),'Instant Online Cover')]");
	public static By FlexiblePaymentOptions=By.xpath("//ul/li[contains(text(),'Flexible Payment Options')]");
	public static By GetInstantQuotes=By.xpath("//td/a[contains(text(),'Get Instant Quotes')]");
		
	//QuoteThankYouResult
	
}
	
