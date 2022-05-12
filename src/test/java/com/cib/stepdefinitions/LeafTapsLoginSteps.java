package com.cib.stepdefinitions;

import com.cib.framework.TestData;
import com.cib.helper.LeafTapsLoginHelper;

import com.cib.objects.LeafTapsLoginPageObjects;

import io.cucumber.java8.En;

public class LeafTapsLoginSteps implements En {

	public LeafTapsLoginSteps() {

		TestData data = new TestData();
		final LeafTapsLoginHelper leaf = new LeafTapsLoginHelper();

		Given("Login into Leaftaps application with userName and passWord for {string}",
				(String testCaseNumber) -> {

					data.assignTestcaseNumber(testCaseNumber);
				//	leaf.login();

				});
		
		Given("Launch the application for testcase {string}", (String testCaseNumber)-> {
			data.assignTestcaseNumber(testCaseNumber);
			
		});
		
		When("Verify user able to enter the userName", ()->{
			leaf.enterUserName();
			
		});
		And("verify user able to enter the password", ()->{
			leaf.enterPassword();
		});
		And("verify user able to click on the login button",()->{
			
			leaf.clickLogin();
		});
	
	}

	

	}

