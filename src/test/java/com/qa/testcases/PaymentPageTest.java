package com.qa.testcases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.ConfirmationPage;
import com.qa.pages.CustomerInfo;
import com.qa.pages.Homepage;
import com.qa.pages.Loginpage;
import com.qa.pages.PaymentPage;
import com.qa.pages.ProductInfo;

public class PaymentPageTest extends TestBase {
	
	Loginpage loginpage;
	Homepage homepage;
	ProductInfo productinfo;
	CustomerInfo cinfo;
	ConfirmationPage confirm;
	PaymentPage payment;
	
	public PaymentPageTest() {
		super();
	}
	
//	@BeforeMethod
//	public void setup() {
//		initialization();
//	}
	
	@Test
	public void debit() {
		
		payment.dcno();
		payment.dccbox();
		payment.acholder();
		payment.email();
	    payment.orderbtn();
	    
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	
	

}
