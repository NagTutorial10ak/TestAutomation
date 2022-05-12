package com.cib.stepdefinitions;

import com.cib.framework.TestData;
import com.cib.helper.GmailSignUpPageHelper;

import io.cucumber.java8.En;

public class GmailSignUpPageStepDefinitions implements En{
	
	TestData data = new TestData();
	GmailSignUpPageHelper helper = new GmailSignUpPageHelper();

	public GmailSignUpPageStepDefinitions()
	{
	
		
		
Given("Launch the browser and application for the testcase {string}",
			(String testCaseNumber) -> {

				data.assignTestcaseNumber(testCaseNumber);
			

			});
	
When("Enter the FirstName", () ->{
		
		helper.enterFirstName();
		
	});
	
And("Enter the LastName", () ->{
		
		helper.enterLastName();
		
	});

And("Enter the mail id", ( ) ->{
	
	helper.enterGmailId();
	
});

And("Enter the password", ( ) ->{
	
	helper.enterPassword();
	
});

And("Enter the confirm password", () ->{
	
	helper.enterPassword();
	
});
	}
}
