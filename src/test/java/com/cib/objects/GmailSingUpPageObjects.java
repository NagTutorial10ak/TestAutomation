package com.cib.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailSingUpPageObjects {
	
	WebDriver driver;
	
	public GmailSingUpPageObjects(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id = "firstName")
	public WebElement webFirstName;
	
	@FindBy(id = "lastName")
	public WebElement webLastName;
	
	@FindBy(id = "username")
	public WebElement webUserMail;
	
	@FindBy(name = "Passwd")
	public WebElement webPassword;
	
	@FindBy(name = "ConfirmPasswd")
	public WebElement webConformPassword;
	
	
	

}
