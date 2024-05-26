package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class Homepage extends TestBase {
	
	ProductInfo productinfo;
	
	@FindBy(xpath="//button[@type='button']//span[text()='New']")
	WebElement Newbtn;
	
	@FindBy(xpath="//button[@type='button']//span[text()='Import']")
	WebElement Importbtn;
	

	public void Homepage() {
		PageFactory.initElements(driver,this);
	}
	
	

	public ProductInfo clickNewbtn() {
		
		Newbtn.click();
		
		return new ProductInfo();
	}
}
