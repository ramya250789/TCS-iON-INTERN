package com.tcs.testcases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.TCS.base.adminbase;
import com.TCS.constants.automationconstants;
import com.TCS.pages.adminPage;
import com.TCS.pages.adminloginpage;
import com.TCS.utilities.excelUtility;

public class adminlogintest extends adminbase{
	JavascriptExecutor js;
	adminloginpage  objLogin;
  @Test(priority=1)
  public void verifyadminlogin() throws IOException,InterruptedException {
		String expectedTitle = automationconstants.ADMINLOGINPAGETITLE;
		String actualTitle = driver.getTitle();
		System.out.println("expectedTitle:"+""+expectedTitle+"\n"+"actualTitle:"+""+actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle);
		objLogin = new adminloginpage(driver);
		String email = excelUtility.getCellData(0, 4);
		System.out.println(email);
		String pass=excelUtility.getCellData(0, 5);
		System.out.println(pass);
		objLogin.setEmail(email);
		objLogin.setPassword(pass);
		objLogin.checkremeberme();
		objLogin.clicklogin();
		Thread.sleep(3000);
		String expectedTitle1 = automationconstants.ADMINDASHBPOARDPAGETITLE;
		String actualTitle1= driver.getCurrentUrl();
		System.out.println("expectedTitle:"+""+expectedTitle1+"\n"+"actualTitle:"+""+actualTitle1);
		Assert.assertEquals(expectedTitle1, actualTitle1);
  }/*
  @Test(priority=3)
  public void verify_Website() throws InterruptedException
  {
	  objLogin = new adminloginpage(driver);
	  Thread.sleep(3000);
	  objLogin.clickwebsite();
	  Thread.sleep(3000);
	  String expectedTitle1 = automationconstants.HOMEPAGEURL;
		String actualTitle1= driver.getCurrentUrl();
		System.out.println("expectedTitle:"+""+expectedTitle1+"\n"+"actualTitle:"+""+actualTitle1);
		Assert.assertEquals(expectedTitle1, actualTitle1);
		objLogin.closetab();
  }*/
@Test(priority=2)
public void verify_Bookings() throws InterruptedException
{
	  objLogin = new adminloginpage(driver);
	  objLogin.clickbooking();
	  Thread.sleep(3000);
	  String expectedTitle1 = automationconstants.ADMINBOOKINGPAGE;
		String actualTitle1= driver.getCurrentUrl();
	System.out.println("expectedTitle:"+""+expectedTitle1+"\n"+"actualTitle:"+""+actualTitle1);
		Assert.assertEquals(expectedTitle1, actualTitle1);
		objLogin.clickpaid();
		 String expectedTitle = automationconstants.PAIDPAGE;
			String actualTitle= driver.getCurrentUrl();
		System.out.println("expectedTitle:"+""+expectedTitle+"\n"+"actualTitle:"+""+actualTitle);
			Assert.assertEquals(expectedTitle1, actualTitle1);
		/*List <WebElement> col=driver.findElements(By.xpath("//*[@id=\"data\"]/tbody/tr"));
		System.out.println("No of Coloumns in table="+col.size());*/
		List <WebElement> row= driver.findElements(By.xpath("//td[contains(@class,\"xcrud-current xcrud-num sorting_1\")]"));
		System.out.println("No of Coloumns in table="+row.size());
		if(row.size()==0)
		{
			System.out.println("No Document found");
		}
		else
		{
		/*for(int i=1;i<=row.size();i++)
		{*/
			WebElement invoice=driver.findElement(By.xpath("//*[@id=\"data\"]/tbody/tr[1]/td[14]/a"));
			js = (JavascriptExecutor) driver;
			 js.executeScript("arguments[0].scrollIntoView();", invoice);
			invoice.click();
			//System.out.println("Invoice"+i+"is displayed");
			Thread.sleep(9000);
			objLogin.closetab();
			
		//}
	    }
		
}
     @Test(priority=3) 
		public void verify_pending()throws InterruptedException
		{
    	 objLogin = new adminloginpage(driver);
			objLogin.clickPending();
			Thread.sleep(3000);
			String expectedTitle2 = automationconstants.PENDINGPAGE;
			String actualTitle2= driver.getCurrentUrl();
		    System.out.println("expectedTitle:"+""+expectedTitle2+"\n"+"actualTitle:"+""+actualTitle2);
			Assert.assertEquals(expectedTitle2, actualTitle2);
			Select select = new Select(driver.findElement(By.xpath("//*[@id=\"booking_status\"]")));
			select.selectByVisibleText("Confirmed");
			Thread.sleep(6000);
			objLogin.clickcancel();
			Thread.sleep(3000);
			String expectedTitle3 = automationconstants.CANCELPAGE;
			String actualTitle3= driver.getCurrentUrl();
		    System.out.println("expectedTitle:"+""+expectedTitle3+"\n"+"actualTitle:"+""+actualTitle3);
			Assert.assertEquals(expectedTitle3, actualTitle3);
			objLogin.clickdelete();
			if(driver.switchTo().alert() != null)
			{
				   driver.switchTo().alert().accept();
			}
		}

  
  
}
