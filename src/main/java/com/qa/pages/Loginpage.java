package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class Loginpage extends TestBase {
	
	@FindBy(xpath="//input[@name='_username']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='login_password']")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement nextbtn;
	
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement remembermebtn;
	
	public void Loginpage() {
		PageFactory.initElements(driver,this);
	}
	public Homepage login(String user, String pwd) {
		
		username.sendKeys(user);
		password.sendKeys(pwd);
		nextbtn.click();
		
		return new Homepage();
	}
	
		
}


