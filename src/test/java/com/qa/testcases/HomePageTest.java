package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.Homepage;
import com.qa.pages.Loginpage;
import com.qa.pages.ProductInfo;

public class HomePageTest extends TestBase {

	Loginpage loginpage;
	Homepage homepage;
	ProductInfo productinfo;
	
	
	public HomePageTest() {
		super();
		
	}
		
	@Test
       public ProductInfo clickNewbtn() {
		
		productinfo = homepage.clickNewbtn();
		
		return new ProductInfo();
	}
	
	
	
	
	
	
	
	
}
