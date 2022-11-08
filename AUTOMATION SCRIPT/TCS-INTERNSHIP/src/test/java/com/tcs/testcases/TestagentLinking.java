package com.tcs.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.TCS.base.Base;
import com.TCS.constants.automationconstants;
import com.TCS.pages.LinkTest;
import com.TCS.utilities.excelUtility;

public class TestagentLinking extends Base {
	LinkTest lt;
  @Test
  public void verifyBooking() throws InterruptedException {
	  lt = new LinkTest(driver);
	  lt.clickBooking();
	  String expectedTitle = automationconstants.BOOKINGPAGE;
	  String actualTitle = driver.getCurrentUrl();
	  System.out.println("expectedTitle:"+""+expectedTitle+"\n"+"actualTitle:"+""+actualTitle);
	  Assert.assertEquals(expectedTitle, actualTitle);
	 
  }
  @Test
  public void verifyAddfund() throws InterruptedException {
	  lt = new LinkTest(driver);
	  lt.clickAddFund();
	  String expectedTitle = automationconstants.ADDFUND;
	  String actualTitle = driver.getCurrentUrl();
	  System.out.println("expectedTitle:"+""+expectedTitle+"\n"+"actualTitle:"+""+actualTitle);
	  Assert.assertEquals(expectedTitle, actualTitle);
	
  }
  public void verifyMyprofile() throws IOException, InterruptedException {
	  lt = new LinkTest(driver);
	  lt.clickProfile();
	  String expectedTitle = automationconstants.MYPROFILE;
	  String actualTitle = driver.getCurrentUrl();
	  System.out.println("expectedTitle:"+""+expectedTitle+"\n"+"actualTitle:"+""+actualTitle);
	  Assert.assertEquals(expectedTitle, actualTitle);
	   }
  public void verifyLogout() {
	  lt = new LinkTest(driver);
	  lt.clickLogout();
	  String expectedTitle = automationconstants.LOGOUT;
	  String actualTitle = driver.getCurrentUrl();
	  System.out.println("expectedTitle:"+""+expectedTitle+"\n"+"actualTitle:"+""+actualTitle);
	  Assert.assertEquals(expectedTitle, actualTitle);
  }
  public void verifyhotel() throws InterruptedException {
	  lt = new LinkTest(driver);
	  lt.clickhotel();
	  Thread.sleep(3000);
	  String expectedTitle = automationconstants.HOTELURL;
	  String actualTitle = driver.getCurrentUrl();
	  System.out.println("expectedTitle:"+""+expectedTitle+"\n"+"actualTitle:"+""+actualTitle);
	  Assert.assertEquals(expectedTitle, actualTitle);
  }
  public void verifyflights() throws InterruptedException {
	  lt = new LinkTest(driver);
	  lt.clickflights();
	  Thread.sleep(3000);
	  String expectedTitle = automationconstants.FLIGHTURL;
	  String actualTitle = driver.getCurrentUrl();
	  System.out.println("expectedTitle:"+""+expectedTitle+"\n"+"actualTitle:"+""+actualTitle);
	  Assert.assertEquals(expectedTitle, actualTitle);
  }
  public void verifytours() throws InterruptedException {
	  lt = new LinkTest(driver);
	  lt.clicktours();
	  Thread.sleep(3000);
	  String expectedTitle = automationconstants.TOURSURL;
	  String actualTitle = driver.getCurrentUrl();
	  System.out.println("expectedTitle:"+""+expectedTitle+"\n"+"actualTitle:"+""+actualTitle);
	  Assert.assertEquals(expectedTitle, actualTitle);
  }
  public void verifyvisa() throws InterruptedException {
	  lt = new LinkTest(driver);
	  lt.clickvisa();
	  Thread.sleep(3000);
	  String expectedTitle = automationconstants.VISAURL;
	  String actualTitle = driver.getCurrentUrl();
	  System.out.println("expectedTitle:"+""+expectedTitle+"\n"+"actualTitle:"+""+actualTitle);
	  Assert.assertEquals(expectedTitle, actualTitle);
  }
  public void verifyblog() throws InterruptedException {
	  lt = new LinkTest(driver);
	  lt.clickblog();
	  Thread.sleep(3000);
	  String expectedTitle = automationconstants.BLOGURL;
	  String actualTitle = driver.getCurrentUrl();
	  System.out.println("expectedTitle:"+""+expectedTitle+"\n"+"actualTitle:"+""+actualTitle);
	  Assert.assertEquals(expectedTitle, actualTitle);
  }
  public void verifyfoffers() throws InterruptedException {
	  lt = new LinkTest(driver);
	  lt.clickoffers();
	  Thread.sleep(3000);
	  String expectedTitle = automationconstants.OFFERSURL;
	  String actualTitle = driver.getCurrentUrl();
	  System.out.println("expectedTitle:"+""+expectedTitle+"\n"+"actualTitle:"+""+actualTitle);
	  Assert.assertEquals(expectedTitle, actualTitle);
  }
  public void verifyback() throws InterruptedException
  {
	  lt = new LinkTest(driver);
	  lt.clickhome();
	  Thread.sleep(3000);
  }
  public void updateCurrency() throws InterruptedException {
	  lt = new LinkTest(driver);
	  lt.clickcurrency();
	  Thread.sleep(3000);
	  
  }
}
