package com.AmazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonRegistrationPageorCreateAccountPage {

	WebDriver driver;
	By accountListLink=By.xpath("//a[@id='nav-link-accountList']");
	By createYourAmazonAccountButton=By.xpath("//a[@id='createAccountSubmit']");
	By yourName=By.xpath("//input[@id='ap_customer_name']");
	By mobileNumberoremail=By.xpath("//input[@id='ap_email']");
	By passwordField=By.xpath("//input[@id='ap_password']");
	By reEnterPasswordField=By.xpath("//input[@id='ap_password_check']");
	By continueButton=By.xpath("//input[@id='continue']");
	
	
	
	public AmazonRegistrationPageorCreateAccountPage(WebDriver driver) {
		this.driver=driver;
	}
	public void clickaccountListLink() {
		driver.findElement(accountListLink).click();
		
	}
	
	public void clickCreateYourAmazonAccountButton() {
		driver.findElement(createYourAmazonAccountButton).click();
		
	}
	
	public void enterYournameField(String arg) {
		driver.findElement(yourName).sendKeys();
	}
	
	public void enterMobileNumberorEmail() {
		driver.findElement(mobileNumberoremail).sendKeys();
	}
	
	public void enterPasswordField() {
		driver.findElement(passwordField).sendKeys();
	}
	
	public void enterReenterPasswordfield() {
		driver.findElement(reEnterPasswordField).sendKeys();
	}
	
	public void clickonContinueButton() {
		driver.findElement(continueButton).click();
	}
	
	
	
}
