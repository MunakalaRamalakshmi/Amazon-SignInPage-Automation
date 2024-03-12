package com.AmazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonHomePage {

	WebDriver driver;
	By logo=By.xpath("//a[@id='nav-logo-sprites']");
	By header= By.xpath("//header[@id='navbar-main']");
	By searchDropdownBox=By.xpath("//select[@id='searchDropdownBox']");
	By searchField=By.xpath("//div[@class='nav-search-field ']");
	By accountListLink=By.xpath("//a[@id='nav-link-accountList']");
	By returnsAndOrdersLink=By.xpath("//a[@id='nav-orders']");
	By cartLink=By.xpath("(//a[@id='nav-cart'])[1]");
	
	
	public AmazonHomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void logo() {
		String amazonLogo=driver.findElement(logo).getText();
		System.out.println("Logo is present "+amazonLogo);
					
	}
	
	public void searchDropdownBox() {
		driver.findElement(searchDropdownBox).click();
	}
	
	public void header() {
		String amazonHeader=driver.findElement(header).getText();
		System.out.println("The Header contained elements are"+amazonHeader);
	}
	
	public void searchField(String args) {
	driver.findElement(searchField).sendKeys(args);
	
	
		
	}
	
	public void clickaccountListLink() {
		driver.findElement(accountListLink).click();
	}
	
	public void clickReturnsAndOrdersLink() {
		driver.findElement(accountListLink).click();
		
	}
	
	public void clickonCartLink() {
		driver.findElement(cartLink).click();
		
	}
	
}









