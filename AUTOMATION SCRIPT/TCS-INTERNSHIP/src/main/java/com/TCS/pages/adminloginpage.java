package com.TCS.pages;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.TCS.base.Base;
import com.TCS.base.adminbase;
import com.TCS.constants.automationconstants;
import com.TCS.utilities.excelUtility;


public class adminloginpage extends adminbase{
	Actions action;
	JavascriptExecutor js;
	public adminloginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="email")
	WebElement username ;
	@FindBy(name="password")
	WebElement password;
	@FindBy(xpath="//*[@id=\"layoutAuthentication_content\"]/main/div/div/div/div[1]/div/form/div[4]/button/span[1]")
	WebElement LoginButton;
	@FindBy(xpath="//*[@id=\"layoutAuthentication_content\"]/main/div/div/div/div[1]/div/form/div[3]/div/label/div/ins")
	WebElement remeberme;
	@FindBy(xpath="//*[@id=\"link-forgot\"]")
	WebElement forgot;
	@FindBy(xpath="//*[@id=\"layoutDrawer_content\"]/main/div/div[1]/div[1]/div")
	WebElement sales;
	@FindBy(xpath="//*[@id=\"layoutDrawer_content\"]/main/div/div[3]/div[1]/div/div[1]/div/div/h2")
	WebElement revenue;
	@FindBy(xpath="//div//ul//li//a[contains(text(),\"Bookings\")]")
	WebElement bookings;
	@FindBy(xpath="//div//ul//li//a[contains(text(),\"Website\")]")
	WebElement website;
	@FindBy(xpath="//*[@id=\"layoutDrawer_content\"]/main/div/div[1]/div[4]/a/div/div/div/div[1]/div[2]")
	WebElement paid;
	@FindBy(xpath="//*[@id=\"data\"]/tbody/tr[1]/td[14]/a")
	WebElement invoice;
	@FindBy(xpath="//*[@id=\"layoutDrawer_content\"]/main/div/div[1]/div[2]/a/div/div/div/div[1]/div[2]")
	WebElement pending;
	@FindBy(xpath="//*[@id=\"layoutDrawer_content\"]/main/div/div[1]/div[3]/a/div/div/div/div[1]/div[2]")
	WebElement cancel;
	@FindBy(xpath="//*[@id=\"data\"]/tbody/tr/td[15]/button/i")
	WebElement delete;
	public void setEmail(String strUserName) {
		username.sendKeys(strUserName);
	}
	public void clickPending()
	{
		js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();", pending);
		pending.click();
	}	
	public void clickdelete()
	{
		delete.click();
	}	
	public void clickcancel()
	{
		js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();", cancel);
		cancel.click();
	}	
	public void setPassword(String strUserName) {
		password.sendKeys(strUserName);
	}
	public void clicklogin()
	{
		LoginButton.click();
	}	
	public void clickbooking()
	{
		bookings.click();
	}	
	public void clickwebsite()
	{
		website.click();
	}
	public void checkremeberme()
	{
		remeberme.click();
	}	
	public void clickpaid()
	{
		paid.click();
	}	
	public void clickFrogot()
	{
		forgot.click();
	}	
	public String getsales()
	{
	 return sales.getText().toString();
	}
	public String getRevenue()
	{
	 return revenue.getText().toString();
	}
	 public void closetab()
	 {
		 ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs2.get(1));
		    driver.close();
		    driver.switchTo().window(tabs2.get(0));
	 }
}


