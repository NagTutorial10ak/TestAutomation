package com.cib.helper;

import com.cib.pages.FaceBookSignUpPage;


public class FaceBookHelper {
	public void clickOnCreateNewAccount() {
		new FaceBookSignUpPage().clickOnCreateNewAccount();
	}
	
	public void enterFirstName(String firstName)
	{
		new FaceBookSignUpPage().enterTheFirstName(firstName);
	}
	
	public void enterSurName()
	{
		new FaceBookSignUpPage().enterSurName();
	}
}
