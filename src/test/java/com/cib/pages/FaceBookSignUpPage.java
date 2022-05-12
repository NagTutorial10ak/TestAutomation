package com.cib.pages;

import com.cib.framework.CommonDef;
import com.cib.framework.DriverFactory;
import com.cib.framework.TestData;
import com.cib.framework.TestReport;
import com.cib.objects.FaceBookSignUpPageObjects;
import com.mongodb.diagnostics.logging.Logger;
import com.relevantcodes.extentreports.LogStatus;

public class FaceBookSignUpPage {
	
	FaceBookSignUpPageObjects pageObj = new FaceBookSignUpPageObjects(DriverFactory.getCurrentDriver());
	
	public FaceBookSignUpPage clickOnCreateNewAccount()
	{
		try {
		CommonDef.click(pageObj.webCreateNewAccount);
		TestReport.log(LogStatus.PASS, "User successfully clicked on the Create New Account button");
		}
		catch (Exception e) {
			// TODO: handle exception
			TestReport.log(LogStatus.PASS, "User Not successfully clicked on the Create New Account button");
		}
		
		return this;
	}
	
	public FaceBookSignUpPage enterTheFirstName(String firstName)
	{
		try {
		CommonDef.sendKeys(pageObj.webFirstName,firstName);
		TestReport.log(LogStatus.PASS, "User successfully entered the firstName");
		}
		catch (Exception e) {
			// TODO: handle exception
			TestReport.log(LogStatus.PASS, "User Not successfully entered the firstName");
		}
		return this;
		
	}
	
	public void enterSurName()
	{
		
		
		
	}
	
	public void enterMobileName()
	{
		
		
		
	}

}
