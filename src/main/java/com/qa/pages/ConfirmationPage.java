package com.qa.pages;

import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class ConfirmationPage extends TestBase {
	
	public void ConfirmationPage() {
		PageFactory.initElements(driver,this);
	}
	

	public void checkboxes() {
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement check : checkboxes){
			
			check.click();
		}
		
		
	}
	
	public PaymentPage clicknext() {
		
		WebElement insurancebtn = driver.findElement(By.xpath("//span[text()='Create insurance']"));
		insurancebtn.click();
		
		return new PaymentPage();
	}
	
	

}
