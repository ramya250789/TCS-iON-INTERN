package com.tcs.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.TCS.base.Base;
import com.TCS.pages.adminPage;
import com.TCS.pages.homepage;
import com.TCS.constants.automationconstants;



import com.TCS.utilities.excelUtility;

public class LoginPage extends Base{
	
	adminPage objLogin;
	homepage hp;
	TestLinking tl;
	TestagentLinking tal;
	adminlogintest al;
     @Test(priority = 2)
	public void verifyLoginPage() throws IOException, InterruptedException {
		
	    objLogin = new adminPage(driver);
		String email = excelUtility.getCellData(0, 0);
		System.out.println(email);
		String pass=excelUtility.getCellData(0, 1);
		System.out.println(pass);
		objLogin.setEmail(email);
		objLogin.setPassword(pass);
		objLogin.clicklogin();
		Thread.sleep(3000);
		tl=new TestLinking();
		tl.verifyAddfund();
		tl.verifyMyprofile();
		tl.verifyBooking();
		Thread.sleep(3000);
		tl.verifyLogout();
	}
	@Test(priority = 1)
	public void verifyHomePage() throws IOException, InterruptedException {
		
		String expectedTitle = automationconstants.HOMEPAGEURL;
		String actualTitle = driver.getCurrentUrl();
		System.out.println("expectedTitle:"+""+expectedTitle+"\n"+"actualTitle:"+""+actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle);
		hp = new homepage(driver);
		hp.clickLanguage();
		hp.clickCustomer();
		
	}
@Test(priority = 3)
	public void verifyagentLoginPage() throws IOException, InterruptedException {
		
		String expectedTitle = automationconstants.AGENTLOGINPAGETITLE;
		String actualTitle = driver.getTitle();
		System.out.println("expectedTitle:"+""+expectedTitle+"\n"+"actualTitle:"+""+actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle);
		objLogin = new adminPage(driver);
		String email = excelUtility.getCellData(0, 2);
		System.out.println(email);
		String pass=excelUtility.getCellData(0, 3);
		System.out.println(pass);
		objLogin.setEmail(email);
		objLogin.setPassword(pass);
		objLogin.clicklogin();
		
		Thread.sleep(3000);
		tal=new TestagentLinking();
		tal.verifyAddfund();
		Thread.sleep(3000);
		tal.verifyMyprofile();
		Thread.sleep(3000);
		tal.verifyBooking();
		Thread.sleep(3000);
		tal.verifyhotel();
		Thread.sleep(3000);
		tal.verifyflights();
		Thread.sleep(3000);
		tal.verifytours();
		Thread.sleep(3000);
		tal.verifyvisa();
		Thread.sleep(3000);
		tal.verifyblog();
		Thread.sleep(3000);
		tal.verifyfoffers();
		tal.verifyback();
		tal.updateCurrency();
		tal.verifyLogout();
			
	}
		
	@Test(priority = 4)
	public void verifyLoginWithBlankEmailAndBlankPassword() throws IOException, InterruptedException {		

		String expectedTitle = automationconstants.LOGINPAGETITLE;
		String actualTitle = driver.getTitle();
		System.out.println("expectedTitle:"+""+expectedTitle+"\n"+"actualTitle:"+""+actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle);
		objLogin = new adminPage(driver);
		objLogin.clicklogin();
		Thread.sleep(3000);
		//objLogin.clickSigninButton();
		String expectedTitle1 = automationconstants.LOGINPAGETITLE;
		String actualTitle1 = driver.getTitle();
		System.out.println("expectedTitle:"+""+expectedTitle1+"\n"+"actualTitle:"+""+actualTitle1);
		Assert.assertEquals(expectedTitle1, actualTitle1);
	}
	@Test(priority = 5)
	public void verifyLoginWithValidEmailAndBlankPassword() throws IOException, InterruptedException {
		objLogin = new adminPage(driver);
		String email = excelUtility.getCellData(0, 0);
		System.out.println(email);
		objLogin.setEmail(email);
		objLogin.clicklogin();
		Thread.sleep(3000);
		//objLogin.clickSigninButton();
		String expectedTitle1 = automationconstants.LOGINPAGETITLE;
		String actualTitle1 = driver.getTitle();
		System.out.println("expectedTitle:"+""+expectedTitle1+"\n"+"actualTitle:"+""+actualTitle1);
		Assert.assertEquals(expectedTitle1, actualTitle1);
	}
	@Test(priority = 6)
	public void verifyLoginWithBlankEmailAndvalidPassword() throws IOException, InterruptedException {
		objLogin = new adminPage(driver);
		objLogin.clearField();
		String pass=excelUtility.getCellData(0, 1);
		System.out.println(pass);
		objLogin.setPassword(pass);		
		objLogin.clicklogin();
		Thread.sleep(3000);
		//objLogin.clickSigninButton();
		String expectedTitle1 = automationconstants.LOGINPAGETITLE;
		String actualTitle1 = driver.getTitle();
		System.out.println("expectedTitle:"+""+expectedTitle1+"\n"+"actualTitle:"+""+actualTitle1);
		Assert.assertEquals(expectedTitle1, actualTitle1);
	}
	@Test(priority = 7)
	public void verifyLoginWithValidEmailAndInvalidPassword() throws IOException, InterruptedException {
		objLogin = new adminPage(driver);
		objLogin.clearField();
		String email = excelUtility.getCellData(0, 0);
		System.out.println(email);
		objLogin.setEmail(email);
		String pass=excelUtility.getCellData(2, 1);
		System.out.println(pass);
		objLogin.setPassword(pass);	
		objLogin.clicklogin();
		Thread.sleep(3000);
		//objLogin.clickSigninButton();
		String expectedTitle1 = automationconstants.LOGINPAGETITLE;
		String actualTitle1 = driver.getTitle();
		System.out.println("expectedTitle:"+""+expectedTitle1+"\n"+"actualTitle:"+""+actualTitle1);
		Assert.assertEquals(expectedTitle1, actualTitle1);
	}
	@Test(priority = 8)
	public void verifyLoginWithInValidEmailAndvalidPassword() throws IOException, InterruptedException {
		objLogin = new adminPage(driver);
		objLogin.clearField();
		String email = excelUtility.getCellData(1, 0);
		System.out.println(email);
		objLogin.setEmail(email);
		String pass=excelUtility.getCellData(0, 1);
		System.out.println(pass);
		objLogin.setPassword(pass);	
		objLogin.clicklogin();
		Thread.sleep(3000);
		//objLogin.clickSigninButton();
		String expectedTitle1 = automationconstants.LOGINPAGETITLE;
		String actualTitle1 = driver.getTitle();
		System.out.println("expectedTitle:"+""+expectedTitle1+"\n"+"actualTitle:"+""+actualTitle1);
		Assert.assertEquals(expectedTitle1, actualTitle1);
	}
	
	
	
}
