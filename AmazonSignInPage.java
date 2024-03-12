package com.AmazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonSignInPage {
	WebDriver driver;
	By accountListLink=By.xpath("//a[@id='nav-link-accountList']");
	By emailOrMobileTextField=By.xpath("//input[@id='ap_email']");
	By continueButton=By.xpath("//input[@id='continue']");
	By createYourAmazonAccountButton=By.xpath("//a[@id='createAccountSubmit']");
	
	
	public AmazonSignInPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickaccountListLink() {
		driver.findElement(accountListLink).click();
		
	}
	
	public void enterEmailOrMobileTextField() {
		driver.findElement(emailOrMobileTextField).sendKeys();
	}
	public void clickContinueButton() {
		driver.findElement(continueButton).click();
	}
	
	public void clickCreateYourAmazonAccountButton() {
		driver.findElement(createYourAmazonAccountButton).click();
	}
	
	
}
