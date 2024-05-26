package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.Homepage;
import com.qa.pages.Loginpage;

public class LoginPageTest extends TestBase{
	Loginpage loginpage;
	Homepage homepage;
	
	
	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		loginpage = new Loginpage();
	}
	
	@Test
	public void logintest() {
		homepage = loginpage.login(prop.getProperty("Username"),prop.getProperty("Password"));
		
	}
	

}
