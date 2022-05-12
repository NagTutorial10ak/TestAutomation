package com.cib.pages;

import com.cib.framework.CommonDef;
import com.cib.framework.DriverFactory;
import com.cib.framework.TestData;
import com.cib.framework.TestReport;
import com.cib.objects.GmailSingUpPageObjects;
import com.relevantcodes.extentreports.LogStatus;

public class GmailSignUpPage {

	GmailSingUpPageObjects pageObjects = new GmailSingUpPageObjects(DriverFactory.getCurrentDriver());
	
	
	public GmailSignUpPage enterFirstName( )
	{
		try {
		CommonDef.sendKeys(pageObjects.webFirstName,TestData.get("firstName") );
		TestReport.log(LogStatus.PASS, "Successfully entered FirstName");
		
		}
		catch (Exception e) {
			TestReport.log(LogStatus.FAIL, "Not successfully entered FirstName");
		}
		return this;
	}
	
	public GmailSignUpPage enterLastName( )
	{
		try {
			CommonDef.sendKeys(pageObjects.webLastName,TestData.get("lastName") );
			TestReport.log(LogStatus.PASS, "Successfully entered LastName");
			
		} catch (Exception e) {
			// TODO: handle exception
			TestReport.log(LogStatus.FAIL, "Not successfully entered LastName");
		}
		
		return this;
	}
	public GmailSignUpPage enterGmailId( )
	{
		
		try {
			CommonDef.sendKeys(pageObjects.webUserMail,TestData.get("userMail")  );
			TestReport.log(LogStatus.PASS, "Successfully entered user Mail");
			
		} catch (Exception e) {
			// TODO: handle exception
			TestReport.log(LogStatus.FAIL, "Not successfully entered user mail");
		}
		
		return this;
	}
	
	public GmailSignUpPage enterPassword( )
	{
		try {
			CommonDef.sendKeys(pageObjects.webPassword,TestData.get("password") );
			TestReport.log(LogStatus.PASS, "Successfully entered Password");
			
		} catch (Exception e) {
			// TODO: handle exception
			TestReport.log(LogStatus.FAIL, "Not successfully entered Password");
		}
		
		return this;
	}
	
	public GmailSignUpPage enterConfrimPassword()
	{
		try {
			CommonDef.sendKeys(pageObjects.webConformPassword,TestData.get("confirmPassword") );
			TestReport.log(LogStatus.PASS, "Successfully entered ConfrimPassword");
			
		} catch (Exception e) {
			// TODO: handle exception
			TestReport.log(LogStatus.FAIL, "Not successfully entered ConfrimPassword");
		}
		
		return this;
	}
	
	public void clickOnNextButton()
	{
		
	}
	
}
