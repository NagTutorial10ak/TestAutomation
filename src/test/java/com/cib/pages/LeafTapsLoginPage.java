package com.cib.pages;

import org.openqa.selenium.By;

import com.cib.framework.CommonDef;
import com.cib.framework.DriverFactory;
import com.cib.framework.TestData;
import com.cib.framework.TestReport;
import com.cib.objects.LeafTapsLoginPageObjects;

import com.relevantcodes.extentreports.LogStatus;

public class LeafTapsLoginPage {
	LeafTapsLoginPageObjects loginObj = new LeafTapsLoginPageObjects(DriverFactory.getCurrentDriver());
	

	public LeafTapsLoginPage enterUserName()
	{
		
		try {
			
			CommonDef.sendKeys(loginObj.webUserName, TestData.get("userName"));
			TestReport.log(LogStatus.PASS, "Successfully entered userName");
			
		} catch (Exception e) {
			TestReport.log(LogStatus.FAIL, "FAILED TO ENTER USERNAME"+e.getMessage());
			
		}
		return this;
	}

	
	public LeafTapsLoginPage enterPassword()
	{
		try {
			
			CommonDef.sendKeys(loginObj.webPassWord,TestData.get("password"));
			
			

			TestReport.log(LogStatus.PASS, "successfully entered password");
		
		} catch (Exception e) {
			TestReport.log(LogStatus.FAIL, "failed to enter password " + e.getMessage());
		}
		return this;
	}
	
	public void clickOnLogin()
	{
		try {
			
			CommonDef.click(loginObj.webClick);
			
			

			TestReport.log(LogStatus.PASS, "Successfully clicked on the Inbound material i");
			
		} catch (Exception e) {
			TestReport.log(LogStatus.FAIL, "Unable  clicked on the Inbound material  " + e.getMessage());
		}
	
		
	}
}
