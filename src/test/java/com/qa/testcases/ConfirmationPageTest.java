package com.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.ConfirmationPage;
import com.qa.pages.CustomerInfo;
import com.qa.pages.Homepage;
import com.qa.pages.Loginpage;
import com.qa.pages.PaymentPage;
import com.qa.pages.ProductInfo;

public class ConfirmationPageTest extends TestBase {
	
	Loginpage loginpage;
	Homepage homepage;
	ProductInfo productinfo;
	CustomerInfo cinfo;
	ConfirmationPage confirm;
	PaymentPage payment;
	
	public ConfirmationPageTest() {
		super();
	}
	
//	@BeforeMethod
//	public void setup() {
//		initialization();
//	}
	
	@Test(priority=1)
	public void checboxes() {
		
		confirm.checkboxes();	
	}
	
	@Test(priority=2)
	
	public PaymentPage insurancebtn() {
		
		payment = confirm.clicknext();
		
		return new PaymentPage();
		
	}
	

}
