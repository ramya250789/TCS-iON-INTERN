package com.tcs.testcases;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.checkerframework.checker.units.qual.h;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.TCS.constants.automationconstants;
import com.TCS.base.Base;


public class testcase extends Base{

	Actions action;
	LoginPage lp;
@Test(priority=1)
 public void validatePageTitle()
 {
	/* hm=new homepage(driver);
	String actualTitle=driver.getTitle();
	 String expectedTitle =automationconstants.HOMEPAGETITLE;
	 Assert.assertEquals(actualTitle,expectedTitle);*/
 }
/*
@Test(priority=2)
 public void validateAboutus() throws Exception
 {
	 hm=new homepage(driver);
	 hm.clickAboutButton();
	 Thread.sleep(3000);
	WebElement about=driver.findElement(By.xpath("//div//h1[contains(text(),'ABOUT US')]"));
	 String actualTitle=about.getText();
	 String expectedTitle =automationconstants.ABOUTPAGETITLE;
	 Assert.assertEquals(actualTitle,expectedTitle);
	 WebElement home=driver.findElement(By.xpath("//div//a[contains(@href,'/')]"));
	 home.click();
 }

@Test(priority=3)
public void validateMeanCourses() throws IOException, InterruptedException
{
	 hm=new homepage(driver);
	 Thread.sleep(3000);
	 hm.clickFullstackButton();
	 Thread.sleep(3000);
	 WebElement mean=driver.findElement(By.xpath("//div//h2[contains(text(),'CERTIFIED SPECIALIST IN FULL STACK DEVELOPMENT using MEAN')]"));
	 String actualTitle=mean.getText();
	 String expectedTitle =automationconstants.MEANCOURSETITLE;
	 Assert.assertEquals(actualTitle,expectedTitle);
	 ft=new TS_002_fullStackCourse();
	 ft.verifyApplynowButton();
	 ft.verifySkipAllFieldRegisteration();
	 ft.verifyCourseAmount();
	 ft.verifyCourseTitle();
	 ft.verifySuccessfullRegisteration();
}
@Test(priority=4)
public void validateDataCourses() throws IOException, InterruptedException
{
	 hm=new homepage(driver);
	 Thread.sleep(3000);
	 hm.clickDatascienceButton();
	 Thread.sleep(3000);
	 WebElement data=driver.findElement(By.xpath("//div//h2[contains(text(),'CERTIFIED SPECIALIST IN DATA SCIENCE AND ANALYTICS')]"));
	 String actualTitle=data.getText();
	 String expectedTitle =automationconstants.DATACOURSETITLE;
	 Assert.assertEquals(actualTitle,expectedTitle);
	 dsc=new TS_002_dataScienceCourse();
	 dsc.verifyClosedButton();
	 
}
@Test(priority=5)
public void validateTestCourses() throws IOException, InterruptedException
{
	 hm=new homepage(driver);
	 Thread.sleep(3000);
	 hm.clickTestingButton();
	 Thread.sleep(3000);
	 WebElement test=driver.findElement(By.xpath("//div//h2[contains(text(),'CERTIFIED SPECIALIST IN SOFTWARE TESTING')]"));
	 String actualTitle=test.getText();
	 String expectedTitle =automationconstants.TESTINGCOURSETITLE;
	 Assert.assertEquals(actualTitle,expectedTitle);
	 st=new TS_002_softwareTestingCourse();
	 st.verifyApplynowButton();
	 st.verifySkipAllFieldRegisteration();
	 st.verifyCourseAmount();
	 st.verifyCourseTitle();
	 st.verifySuccessfullRegisteration();
}
@Test(priority=6)
public void validatedigitalCourses() throws InterruptedException
{
	 hm=new homepage(driver);
	 Thread.sleep(3000);
	 hm.clickMarketingButton();
	 Thread.sleep(3000);
	 WebElement digital=driver.findElement(By.xpath("//div//h2[contains(text(),'CERTIFIED SPECIALIST IN DIGITAL MARKETING')]"));
	 String actualTitle=digital.getText();
	 String expectedTitle =automationconstants.DIGITALCOURSETITLE;
	 Assert.assertEquals(actualTitle,expectedTitle);
	 WebElement home=driver.findElement(By.xpath("//div//a[contains(@href,'/')]"));
	 home.click();
}
@Test(priority=7)
public void validateacademicMembership() throws InterruptedException
{
	 hm=new homepage(driver); 
	 Thread.sleep(3000);
	 hm.clickacademicmemebership();
	 Thread.sleep(3000);
	 	 WebElement academic=driver.findElement(By.xpath("//div//h1[contains(text(),'ACADEMIC MEMBERSHIP')]"));
	 String actualTitle=academic.getText();
	 String expectedTitle =automationconstants.ACADEMICMBTITLE;
	 Assert.assertEquals(actualTitle,expectedTitle);
	 am=new AcademicMembershipTest();
	 am.AcademicTest();
	 WebElement home=driver.findElement(By.xpath("//div//a[contains(@href,'/')]"));
	 home.click();
}
@Test(priority=8)
public void validatecorparateMembership() throws InterruptedException
{
	 hm=new homepage(driver);
	 hm.clickacorparatemembership();
	 //Thread.sleep(3000);
	 WebElement corparate=driver.findElement(By.xpath("//div//h1[contains(text(),'CORPORATE MEMBERSHIP')]"));
	 String actualTitle=corparate.getText();
	 String expectedTitle =automationconstants.CORPARATEMBTITLE;
	 Assert.assertEquals(actualTitle,expectedTitle);
	 cmr=new CorporateMembershipRegTest();
	 cmr.RegFailureTest();
	 cmr.EmailidTest();
	 cmr.PhoneNumberTest();
	 cmr.RegisterbtnValidation();
	 cmr.RegisterationTest();
	 WebElement home=driver.findElement(By.xpath("//div//a[contains(@href,'/')]"));
	 home.click();
}/*
@Test
public void validatepartnershipMembership()
{
	 hm=new homepage(driver);
	 hm.clickpartnership();
	 WebElement partnership=driver.findElement(By.xpath("//div//h1[contains(text(),'PARTNERSHIP')]"));
	 String actualTitle=partnership.getText();
	 String expectedTitle =automationconstants.PARTNERSHIPTITLE;
	 Assert.assertEquals(actualTitle,expectedTitle);
}
@Test
public void validateSalesforceEvent()
{
	 hm=new homepage(driver);
	 hm.clicksalesforce();
	 WebElement salesforce=driver.findElement(By.xpath("//div//h2[contains(text(),'Salesforce')]"));
	 String actualTitle=salesforce.getText();
	 String expectedTitle =automationconstants.SALESFORSEEVENTTITLE;
	 Assert.assertEquals(actualTitle,expectedTitle);
	 WebElement home=driver.findElement(By.xpath("//div//a[contains(@href,'/')]"));
	 home.click();
}
@Test
public void validateRoboticsEvent()
{
	 hm=new homepage(driver);
	 hm.clickrpa();
	 WebElement robotics=driver.findElement(By.xpath("//div//h2[contains(text(),'Robotic Process Automation')]"));
	 String actualTitle=robotics.getText();
	 String expectedTitle =automationconstants.ROBOTICSEVENTTITLE;
	 Assert.assertEquals(actualTitle,expectedTitle);
	 WebElement home=driver.findElement(By.xpath("//div//a[contains(@href,'/')]"));
	 home.click();
}
@Test
public void validateMLEvent()
{
	 hm=new homepage(driver);
	 hm.clickml();
	 WebElement ml=driver.findElement(By.xpath("//div//h2[contains(text(),'ML \\ AI')]"));
	 String actualTitle=ml.getText();
	 String expectedTitle =automationconstants.MLEVENTTITLE;
	 Assert.assertEquals(actualTitle,expectedTitle);
	 WebElement home=driver.findElement(By.xpath("//div//a[contains(@href,'/')]"));
	 home.click();
}
@Test
public void validateContactus()
{
	 hm=new homepage(driver);
	 hm.clickcontactusButton();
	 WebElement contactus=driver.findElement(By.xpath("//div//h1[contains(text(),'Your Connection to ICTAK')]"));
	 String actualTitle=contactus.getText();
	 String expectedTitle =automationconstants.CONTACTUSPAGETITLE;
	 Assert.assertEquals(actualTitle,expectedTitle);
	 WebElement home=driver.findElement(By.xpath("//div//a[contains(@href,'/')]"));
	 home.click();
}
@Test(priority=11)
public void validateLogin() throws IOException, InterruptedException, AWTException
{
	 hm=new homepage(driver);
	 hm.clickloginButton();
	 Thread.sleep(3000);
	 WebElement login=driver.findElement(By.xpath("//div//h4[contains(text(),' Welcome ')]"));
	 String actualTitle=login.getText();
	 System.out.println("actual"+actualTitle);
	 String expectedTitle =automationconstants.lOGINPAGETITLE;
	 System.out.println("expected"+expectedTitle);
	 Assert.assertEquals(actualTitle,expectedTitle);
	 l=new TS_001();
	 l.verifySignUpOptionForNewUSersTC010();
	 Thread.sleep(3000);
	 l.verifyPasswordIsMaskedTC009();
	 Thread.sleep(3000);
	 l.verifyLoginWithBlankEmailAndBlankPasswordTC008();
	 Thread.sleep(3000);
	 l.verifyUnsuccessfulLoginWithValidEmailAndBlankPasswordTC004();
	 Thread.sleep(3000);
	 l.verifyLoginButtonInTheHomePageTC001();
	// l.verifyUnsuccessfulLoginWithBlankEmailAndValidPasswordTC005();
	Thread.sleep(3000);
	 l.verifyLoginWithInValidEmailAndInValidPasswordTC003();
	 Thread.sleep(3000);
	 l.verifyLoginWithInValidEmailAndValidPasswordTC006();
	 Thread.sleep(3000);
	 l.verifyLoginWithValidEmailAndInValidPasswordTC007();
	 Thread.sleep(3000);
	 l.verifyLoginButtonInTheHomePageTC001();
	 Thread.sleep(3000);
	 l.verifyLoginWithValidEmailAndValidPasswordTC002();
	 
}
@Test(priority=9)
public void validateGetStartedBuuton() throws IOException, InterruptedException
{
	hm=new homepage(driver);
	hm.clickGetStartedButton();
	Thread.sleep(3000);
	WebElement courseTitle=driver.findElement(By.xpath("//div//h2"));
	String actualTitle=courseTitle.getText();
	 String expectedTitle =automationconstants.COURSEPAGETITLE;
	 Assert.assertEquals(actualTitle,expectedTitle);
	Thread.sleep(3000);
	 ts=new testsearch();
	 ts.SearchCourseTitle();
	 WebElement home=driver.findElement(By.xpath("//div//a[contains(@href,'/')]"));
	 home.click();
	 
}
@Test(priority=10)
public void validateFindoutMoreButton() throws InterruptedException
{
	hm=new homepage(driver);
	hm.clickFindoutMoreButton();
	Thread.sleep(3000);
	WebElement home=driver.findElement(By.xpath("//div//a[contains(@href,'/')]"));
	 home.click();
		
}*/


}

