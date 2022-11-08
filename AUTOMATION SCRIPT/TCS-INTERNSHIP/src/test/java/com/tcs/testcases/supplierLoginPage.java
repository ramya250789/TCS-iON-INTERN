package com.tcs.testcases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.TCS.base.Base;
import com.TCS.base.supplierbase;
import com.TCS.constants.automationconstants;
import com.TCS.pages.adminPage;
import com.TCS.pages.adminloginpage;
import com.TCS.pages.homepage;
import com.TCS.pages.supplierpage;
import com.TCS.utilities.excelUtility;

public class supplierLoginPage extends supplierbase  {
	adminPage objLogin;
	adminlogintest at;
	supplierpage sp;
	homepage hp;
	
	JavascriptExecutor js;
    @Test(priority = 1)
	public void verifySuplierLoginPage() throws IOException, InterruptedException {
		
		String expectedTitle = automationconstants.SUPPLIERLOGINPAGETITLE;
		String actualTitle = driver.getTitle();
		System.out.println("expectedTitle:"+""+expectedTitle+"\n"+"actualTitle:"+""+actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle);
		sp = new supplierpage(driver);
		String email = excelUtility.getCellData(0, 6);
		System.out.println(email);
		String pass=excelUtility.getCellData(0, 7);
		System.out.println(pass);
		sp.setEmail(email);
		sp.setPassword(pass);
		sp.clicklogin();
		Thread.sleep(3000);
		String expectedTitle1 = automationconstants.SUPPLIERDASHBOARD;
		String actualTitle1 = driver.getCurrentUrl();
		System.out.println("expectedTitle:"+""+expectedTitle1+"\n"+"actualTitle:"+""+actualTitle1);
		Assert.assertEquals(expectedTitle1, actualTitle1);
		
    }
    @Test(priority=2)
    public void verify_Salesoverview_Revenue()
    {
  	    sp = new supplierpage(driver);
  		String expectedTitle= automationconstants.SALESOVERVIEW;
  		String actualTitle= sp.getsales();
  		System.out.println("expectedTitle:"+""+expectedTitle+"\n"+"actualTitle:"+""+actualTitle);
  		Assert.assertEquals(expectedTitle, actualTitle);
  		String expectedTitle1= automationconstants.REVENUE;
  		String actualTitle1= sp.getRevenue();
  		System.out.println("expectedTitle:"+""+expectedTitle1+"\n"+"actualTitle:"+""+actualTitle1);
  		Assert.assertEquals(expectedTitle1, actualTitle1);
    }
    @Test(priority=4) 
	public void verify_pending()throws InterruptedException
	{
    	sp = new supplierpage(driver);
    	sp.clickPending();
		Thread.sleep(3000);
		String expectedTitle2 = automationconstants.SUPPLIERPENDINGPAGE;
		String actualTitle2= driver.getCurrentUrl();
	    System.out.println("expectedTitle:"+""+expectedTitle2+"\n"+"actualTitle:"+""+actualTitle2);
		Assert.assertEquals(expectedTitle2, actualTitle2);
		List <WebElement> col= driver.findElements(By.xpath("//*[@id=\"data\"]/tbody/tr"));
		System.out.println("No of Coloumns in table="+col.size());
		if(col.size()==1)
		{
			System.out.println("No Document found");
		}
		else
		{
		Select select = new Select(driver.findElement(By.xpath("//*[@id=\"booking_status\"]")));
		select.selectByVisibleText("Confirmed");
		Thread.sleep(6000);
		}
		sp.clickLogout();
	}
    @Test(priority=3) 
	public void verify_modules()throws InterruptedException
	{
    	sp = new supplierpage(driver);
    	sp.clickmodule();
	List <WebElement> col= driver.findElements(By.xpath("//*[@id=\"drawerAccordion\"]/div/div/a"));
		System.out.println("No of modules in dashboard="+(col.size()-3));
		for(int i=4;i<=col.size();i++)
		{
			WebElement module=driver.findElement(By.xpath("//*[@id=\"drawerAccordion\"]/div/div/a["+i+"]"));
			if(module.getText()=="Flight")
			{
				System.out.println("Flight module is present");
			}
			else if(module.getText()=="Visa")
			{
				System.out.println("Visa module is present");
			}
			else if(module.getText()=="Tours")
			{
				System.out.println("Tours module is present");
			}
			else if(module.getText()=="Booking")
			{
				System.out.println("Booking module is present");
			}
			else
			{
				System.out.println("No modules found");
				break;
			}
			
			}
			
			
	
	}
    @Test(priority = 5)
	public void verifyLoginWithBlankEmailAndBlankPassword() throws IOException, InterruptedException {		

    	
    	sp = new supplierpage(driver);
		sp.clicklogin();
		Thread.sleep(3000);
		//objLogin.clickSigninButton();
		String expectedTitle = automationconstants.SUPPLIERLOGINPAGETITLE;
		String actualTitle = driver.getTitle();
		System.out.println("expectedTitle:"+""+expectedTitle+"\n"+"actualTitle:"+""+actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	@Test(priority = 6)
	public void verifyLoginWithValidEmailAndBlankPassword() throws IOException, InterruptedException {
		sp = new supplierpage(driver);
		sp.clearField();
		String email = excelUtility.getCellData(0, 6);
		System.out.println(email);
		sp.setEmail(email);
		sp.clicklogin();
		Thread.sleep(3000);
		//objLogin.clickSigninButton();
		String expectedTitle = automationconstants.SUPPLIERLOGINPAGETITLE;
		String actualTitle = driver.getTitle();
		System.out.println("expectedTitle:"+""+expectedTitle+"\n"+"actualTitle:"+""+actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	@Test(priority = 7)
	public void verifyLoginWithBlankEmailAndvalidPassword() throws IOException, InterruptedException {
		sp = new supplierpage(driver);
		sp.clearField();
		String pass=excelUtility.getCellData(0, 7);
		System.out.println(pass);
		sp.setPassword(pass);
		sp.clicklogin();
		Thread.sleep(3000);
		//objLogin.clickSigninButton();
		String expectedTitle = automationconstants.SUPPLIERLOGINPAGETITLE;
		String actualTitle = driver.getTitle();
		System.out.println("expectedTitle:"+""+expectedTitle+"\n"+"actualTitle:"+""+actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	@Test(priority = 8)
	public void verifyLoginWithValidEmailAndInvalidPassword() throws IOException, InterruptedException {
		sp = new supplierpage(driver);
		sp.clearField();
		String email = excelUtility.getCellData(0, 6);
		System.out.println(email);
		sp.setEmail(email);
		String pass=excelUtility.getCellData(2, 7);
		System.out.println(pass);
		sp.setPassword(pass);	
		sp.clicklogin();
		Thread.sleep(3000);
		//objLogin.clickSigninButton();
		String expectedTitle = automationconstants.SUPPLIERLOGINPAGETITLE;
		String actualTitle = driver.getTitle();
		System.out.println("expectedTitle:"+""+expectedTitle+"\n"+"actualTitle:"+""+actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	@Test(priority = 9)
	public void verifyLoginWithInValidEmailAndvalidPassword() throws IOException, InterruptedException {
		sp = new supplierpage(driver);
		sp.clearField();
		String email = excelUtility.getCellData(1, 6);
		System.out.println(email);
		sp.setEmail(email);
		String pass=excelUtility.getCellData(0, 7);
		System.out.println(pass);
		sp.setPassword(pass);	
		sp.clicklogin();
		Thread.sleep(3000);
		//objLogin.clickSigninButton();
		String expectedTitle = automationconstants.SUPPLIERLOGINPAGETITLE;
		String actualTitle = driver.getTitle();
		System.out.println("expectedTitle:"+""+expectedTitle+"\n"+"actualTitle:"+""+actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	
	

}
