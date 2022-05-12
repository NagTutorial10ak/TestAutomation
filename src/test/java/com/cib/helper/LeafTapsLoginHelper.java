package com.cib.helper;


import com.cib.pages.LeafTapsLoginPage;

public class LeafTapsLoginHelper {

	public void enterUserName() {
		new LeafTapsLoginPage().enterUserName();
	}
	
	public void enterPassword()
	{
		new LeafTapsLoginPage().enterPassword();
	}
	
	public void clickLogin()
	{
		new LeafTapsLoginPage().clickOnLogin();
	}
}
