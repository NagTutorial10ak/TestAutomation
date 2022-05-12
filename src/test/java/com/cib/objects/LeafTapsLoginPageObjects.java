package com.cib.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeafTapsLoginPageObjects {
	
	WebDriver driver;

	public LeafTapsLoginPageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	public WebElement webUserName;
	
	@FindBy(id = "password")
	public WebElement webPassWord;
	
	@FindBy(xpath ="//input[@type='submit']")
	public WebElement webClick;

}
