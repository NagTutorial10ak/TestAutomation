package com.cib.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookSignUpPageObjects {
	
	WebDriver driver;
	public FaceBookSignUpPageObjects(WebDriver driver)
	{	this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[@data-testid='open-registration-form-button']")
	public WebElement webCreateNewAccount;
	
	@FindBy(name = "firstname")
	public WebElement webFirstName;
	
	
	@FindBy(name = "lastname")
	public WebElement webLastName;

}
