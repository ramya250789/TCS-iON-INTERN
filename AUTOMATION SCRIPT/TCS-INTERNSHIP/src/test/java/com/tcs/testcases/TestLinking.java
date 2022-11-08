package com.tcs.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.TCS.base.Base;
import com.TCS.constants.automationconstants;
import com.TCS.pages.LinkTest;
import com.TCS.pages.adminPage;
import com.TCS.utilities.excelUtility;

public class TestLinking extends Base {
	LinkTest lt;
  @Test
  public void verifyBooking() throws InterruptedException {
	  lt = new LinkTest(driver);
	  lt.clickBooking();
	  String expectedTitle = automationconstants.BOOKINGPAGE;
	  String actualTitle = driver.getCurrentUrl();
	  System.out.println("expectedTitle:"+""+expectedTitle+"\n"+"actualTitle:"+""+actualTitle);
	  Assert.assertEquals(expectedTitle, actualTitle);
	  lt.clickvoucher();
	  String status=lt.checkstatus();
	  Thread.sleep(3000);
	  lt.closetab();
	  //lt.CheckMsg(status);
  }
  @Test
  public void verifyAddfund() throws InterruptedException {
	  lt = new LinkTest(driver);
	  lt.clickAddFund();
	  String expectedTitle = automationconstants.ADDFUND;
	  String actualTitle = driver.getCurrentUrl();
	  System.out.println("expectedTitle:"+""+expectedTitle+"\n"+"actualTitle:"+""+actualTitle);
	  Assert.assertEquals(expectedTitle, actualTitle);
	  lt.clickpaypal();
	  lt.setpay();
	  lt.clickpaynow();
	  Thread.sleep(3000);
	  String expectedTitle1 = automationconstants.FUNDPAGE;
	  String actualTitle1 = driver.getCurrentUrl();
	  System.out.println("expectedTitle:"+""+expectedTitle1+"\n"+"actualTitle:"+""+actualTitle1);
	  Assert.assertEquals(expectedTitle1, actualTitle1);
	  lt.clickBack();
	  lt.clickBack();
  }
  public void verifyMyprofile() throws IOException, InterruptedException {
	  lt = new LinkTest(driver);
	  lt.clickProfile();
	  String expectedTitle = automationconstants.MYPROFILE;
	  String actualTitle = driver.getCurrentUrl();
	  System.out.println("expectedTitle:"+""+expectedTitle+"\n"+"actualTitle:"+""+actualTitle);
	  Assert.assertEquals(expectedTitle, actualTitle);
	  lt.clearField();
	  String address = excelUtility.getCellData(3, 0);
	  System.out.println(address);
	  lt.setAddress(address);
	  lt.clickgotit();
	  lt.clickUpdate();
	  Thread.sleep(3000);
	  if(lt.alertms()==1)
	  {
		  System.out.println("Profile updated successfully");
	  }
	  else
	  {
		  System.out.println("Not Updated.");
	  }
  }
  public void verifyLogout() {
	  lt = new LinkTest(driver);
	  lt.clickLogout();
	  String expectedTitle = automationconstants.LOGOUT;
	  String actualTitle = driver.getCurrentUrl();
	  System.out.println("expectedTitle:"+""+expectedTitle+"\n"+"actualTitle:"+""+actualTitle);
	  Assert.assertEquals(expectedTitle, actualTitle);
  }
}
