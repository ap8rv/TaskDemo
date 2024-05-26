package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class PaymentPage extends TestBase {
	
	public void PaymentPage() {
		PageFactory.initElements(driver,this);
	}
	
	public void creditcard() {
		
		WebElement cc = driver.findElement(By.xpath("//input[@value='STRIPE.CARD']"));
		cc.click();
	}
	
	public void email() {
		
		WebElement mail = driver.findElement(By.name("email"));
		mail.sendKeys("test@test.com");
	}
	
	public void acholder() {
		
		WebElement aholder = driver.findElement(By.name("accountHolder"));
		aholder.sendKeys("Tester");
	}
	
	public void debitcard() {
		
		WebElement dc = driver.findElement(By.xpath("//input[@value='STRIPE.DIRECT_DEBIT']"));
		dc.click();
	}
	
	public void dccbox() {
		WebElement dccbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		dccbox.click();
	}
	
	public void dcno() {
		
		WebElement dcno = driver.findElement(By.xpath("//input[@name='iban']"));
		dcno.sendKeys("DE89370400440532013000");
	}

	public void contbtn() {
		
		WebElement btn = driver.findElement(By.xpath("//font[text()='Continue to payment']"));
		
		btn.click();
		
	}
	
	public void ccno() {
		
		WebElement ccno = driver.findElement(By.xpath("//input[@name='cardnumber']"));
		ccno.sendKeys("4242424242424242");
	}
	
	public void expirydate() {
		
		WebElement expdate = driver.findElement(By.xpath("//input[@name='exp-date']"));
		expdate.sendKeys("05 25");
				
	}
	
	public void expiryyear() {
		
		WebElement exyear = driver.findElement(By.xpath("//input[@name='cvc']"));
		exyear.sendKeys("2028");
	}
	
	public void orderbtn() {
		
		WebElement ordbtn = driver.findElement(By.xpath("//font[text()='Order for a fee']"));
		ordbtn.click();
	}
}
