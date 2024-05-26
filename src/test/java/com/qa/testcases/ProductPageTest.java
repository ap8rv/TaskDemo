package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.CustomerInfo;
import com.qa.pages.Homepage;
import com.qa.pages.Loginpage;
import com.qa.pages.ProductInfo;

public class ProductPageTest extends TestBase {
	
	Loginpage loginpage;
	Homepage homepage;
	ProductInfo productinfo;
	CustomerInfo cinfo;
	
	
	
	public ProductPageTest() {
		super();
	}
	
//	@BeforeMethod
//	public void setup() {
//		initialization();
//	}
	
	@Test (priority=1)
	public void productval() {
		
		productinfo.country();
		productinfo.countryname();
		productinfo.product();
		productinfo.productname();
		productinfo.tddown();
		productinfo.tarrifvalue();
		productinfo.categorydrop();
		productinfo.category();
		productinfo.perioddown();
		productinfo.periodvalue();
		productinfo.paymentddown();
		productinfo.paymentvalue();
		productinfo.classddown();
		productinfo.classvalue();
		productinfo.serialno("SER-111111");
		
	}
	
	@Test(priority=2)
	public CustomerInfo nextbtn() {
		
		cinfo  = productinfo.nextbtn();
		
		return new CustomerInfo();
	}
	
	
	
}
