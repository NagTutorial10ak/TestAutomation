package com.cib.stepdefinitions;

import com.cib.framework.TestData;
import com.cib.helper.FaceBookHelper;

import io.cucumber.java8.En;

public class FaceBookSignUpSteps implements En {
	
	public FaceBookSignUpSteps()
	{
	TestData data = new TestData();
	FaceBookHelper helper = new FaceBookHelper();
	
//	Given("Launch the application for testcase {string}", (String testCaseNumber)-> {
//		data.assignTestcaseNumber(testCaseNumber);
//		
//	});
	
	
	When("Click on the Create New Account", ()-> {
		//data.assignTestcaseNumber();
		helper.clickOnCreateNewAccount();
		
	});
	
	And("Enter the firstName as {string}", (String firstName)-> {
		//data.assignTestcaseNumber();
		helper.enterFirstName(firstName);
		
	});
	And("Enter the surName", ()-> {
		helper.enterSurName();
		
	});
	
	}
}
