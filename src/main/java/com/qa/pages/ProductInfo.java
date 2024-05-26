package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class ProductInfo extends TestBase{
	
	public void ProductInfo() {
		PageFactory.initElements(driver,this);
	}
	
	String country = "//div[@id='menu-country-select']";
	public void country() {
	
	   WebElement countryddown = driver.findElement(By.xpath(country));
	   countryddown.click();
		
	}
	
	public void countryname() {
		WebElement countryname = driver.findElement(By.xpath("//div[@id='menu-country-select']/div/ul/li[@data-value='DE']"));
		countryname.click();
		
	}
	
	public void product() {
		
		WebElement productddown = driver.findElement(By.xpath("//div[@id='product-name-select']"));
		productddown.click();
		
	}
	
	public void productname() {
		WebElement productname = driver.findElement(By.xpath("//li[@data-value='Nokia_v1Allianz_global']"));
		productname.click();
	}
	
	public void tddown() {
		
		WebElement tarrifddown = driver.findElement(By.xpath("//div[@id='tariff-name-select']"));
		tarrifddown.click();
	}

	public void tarrifvalue() {
		
		WebElement tvalue = driver.findElement(By.xpath("//li[text()='1-34-Nokia_v1Allianz_global-D-EUR-v1-Accidental_damage']"));
		tvalue.click();
	}
	
	public void categorydrop() {
		
		WebElement categoryddown = driver.findElement(By.xpath("//div[@id='category-name-select']"));
		categoryddown.click();
	}
	
	public void category() {
		
		WebElement category = driver.findElement(By.xpath("//li[@data-value='CATEGORY_SMARTPHONE']"));
		category.click();
		
	}

	public void perioddown() {
		
		WebElement periodddown = driver.findElement(By.xpath("//div[@id='duration-select']"));
		periodddown.click();
	}
	
	
	public void periodvalue() {
		
		WebElement periodvalue = driver.findElement(By.xpath("//li[@data-value='12 month(s)']"));
		periodvalue.click();
	}
	
	public void paymentddown() {
		WebElement paymentddown = driver.findElement(By.xpath("//div[@id='frequency-select'"));
		paymentddown.click();
	}
	
	public void paymentvalue() {
		
		WebElement paymentvalue = driver.findElement(By.xpath("//span[text()='One-time']"));
		paymentvalue.click();
		
	}

	public void classddown() {
		
		WebElement classddown = driver.findElement(By.xpath("//div[@id='class-name-select']"));
		classddown.click();
	}
	
	public void classvalue() {
		
		WebElement classvalue = driver.findElement(By.xpath("//ul[@id=':r1c:']/li[1]"));
		classvalue.click();
	}
	
	public void serialno(String number) {
		
		WebElement serialno = driver.findElement(By.xpath("//input[@name='serialNumber']"));
		serialno.sendKeys(number);
		
	}
	
	public CustomerInfo nextbtn() {
		
		WebElement nextbtn = driver.findElement(By.xpath("//button[@type='button']//span[text()='Next']"));
		nextbtn.click();
		
		return new CustomerInfo();
	}
	
	

	
}
