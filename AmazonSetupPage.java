package com.AmazonSetUpPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.AmazonCaptcha.AmazonCaptcha;
import com.AmazonPages.AmazonHomePage;
import com.AmazonPages.AmazonRegistrationPageorCreateAccountPage;
import com.AmazonPages.AmazonSignInPage;

public class AmazonSetupPage {

	WebDriver driver;
	AmazonHomePage objAmazonHomePage;
	AmazonSignInPage objAmazonSigninPage;
	AmazonRegistrationPageorCreateAccountPage objRegistrationPage;
	
	@BeforeTest
	public void setUp(){
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		
	}
	
	@Test(priority=1)
	public void test() {
		objAmazonHomePage=new AmazonHomePage(driver);
		objAmazonHomePage.logo();
		objAmazonHomePage.clickaccountListLink();
	}
	
	@Test(priority=2)
	public void testSignIn() {
		objAmazonSigninPage=new AmazonSignInPage(driver);
		objAmazonSigninPage.clickaccountListLink();
		objAmazonSigninPage.enterEmailOrMobileTextField();
		objAmazonSigninPage.clickContinueButton();
		objAmazonSigninPage.clickCreateYourAmazonAccountButton();
	}
	
	@Test(priority=3)
	public void testCreateAccountPage(){
		objRegistrationPage=new AmazonRegistrationPageorCreateAccountPage(driver);
		objRegistrationPage.clickaccountListLink();
		objRegistrationPage.clickCreateYourAmazonAccountButton();
		objRegistrationPage.enterYournameField("name");
		objRegistrationPage.enterMobileNumberorEmail();
		objRegistrationPage.enterPasswordField();
		objRegistrationPage.enterReenterPasswordfield();
		objRegistrationPage.clickonContinueButton();
		
	
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
