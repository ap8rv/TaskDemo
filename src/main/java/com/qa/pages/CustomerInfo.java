package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;


public class CustomerInfo extends TestBase {
	
	public void CustomerInfo() {
		PageFactory.initElements(driver,this);
	}
	
	public void checkbox() {
		
		WebElement check = driver.findElement(By.xpath("//input[@value='male']"));
		check.click();
		
	}
	
	public WebElement fname() {
		
		WebElement first = driver.findElement(By.xpath("//input[@name='firstName']"));
		
		return first;
	}
	
	public WebElement lname() {
		
		WebElement last = driver.findElement(By.name("lastName"));
		return last;
	
	}
	
	public WebElement email() {
		
		WebElement mail = driver.findElement(By.name("email"));
		return mail;
		
	}
	
	public WebElement streetname() {
		
		WebElement street = driver.findElement(By.name("streetName"));
		return street;
		
	}
	
	public WebElement housenumber() {
		
		WebElement no = driver.findElement(By.name("streetNumber"));
		return no;
		
	}
	
	public WebElement postalcode() {
		
		WebElement pin = driver.findElement(By.name("zip"));
		return pin;
		
	}
	
	public WebElement city() {
		
		WebElement cname = driver.findElement(By.name("city"));
		return cname;
		
		
	}
	
	public WebElement country() {
		
		WebElement countryname = driver.findElement(By.name("country"));
		return countryname;
		
	}
	
	public ConfirmationPage nxtbtn() {
		
		WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));
		next.click();
		
		return new ConfirmationPage();
	}
	
	public void createNewCustomer( String ftName, String ltName, String email, String streetname, int houseno, int zip, String city, String country  ){
		
		 fname().sendKeys(ftName);
		 lname().sendKeys(ltName);
		 email().sendKeys(email);
		 streetname().sendKeys(streetname);
		 housenumber().sendKeys(""+houseno+"");
		 postalcode().sendKeys(""+zip+"");
		 city().sendKeys(city);
		 country().sendKeys(country);
		 	 	
		
	}
	
}
