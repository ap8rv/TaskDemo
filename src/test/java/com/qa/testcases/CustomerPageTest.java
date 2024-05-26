package com.qa.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.pages.ConfirmationPage;
import com.qa.pages.CustomerInfo;
import com.qa.util.TestUtil;

public class CustomerPageTest {
	
	CustomerInfo customerinfo;
	ConfirmationPage confirm;
	String sheetName = "testdata";
	public CustomerPageTest() {
		super();
	}
	
	@DataProvider
	public Object[][] TestData(){
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(dataProvider="TestData", priority=1)
	public void customerdetails(String ftName, String ltName, String email, String streetname, int houseno, int zip, String city, String country) {
		
		customerinfo.createNewCustomer(ftName, ltName, email, streetname, houseno, zip, city, country);		
	}
	
	@Test(priority=2)
	public PaymentPageTest next() {
		
		confirm = customerinfo.nxtbtn();
		
		return new PaymentPageTest();
		
		
	}
	

}
