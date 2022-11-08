package com.TCS.pages;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.TCS.base.Base;

public class LinkTest extends Base {
	Actions action;
	JavascriptExecutor js;
	public LinkTest(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"fadein\"]/div[4]/div/div[3]/ul/li[2]/a")
	WebElement Mybooking;
	@FindBy(xpath="//*[@id=\"fadein\"]/div[4]/div/div[3]/ul/li[3]/a")
	WebElement addfund;
	@FindBy(xpath="//*[@id=\"fadein\"]/div[4]/div/div[3]/ul/li[4]/a")
	WebElement myprofile;
	@FindBy(xpath="//div//button[contains(@class,\"btn btn-primary dropdown-toggle waves-effect\")]")
	WebElement account;
	@FindBy(xpath="//*[@id=\"fadein\"]/header/div/div/div/div/div/div[2]/div/div[2]/div[3]/div/ul/li[5]/a")
	WebElement Logout;
	@FindBy(name="address1")
	WebElement address;
	@FindBy(xpath="//div[@class=\"btn-box mt-4\"]//button")
	WebElement update;
	@FindBy(xpath="//div[@class=\"alert alert-success\"]//i")
	WebElement alertmsg;
	@FindBy(xpath="//*[@id=\"cookie_stop\"]")
	WebElement gotit;
	@FindBy(xpath="//*[@id=\"fadein\"]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/div/table/tbody/tr[1]/td[4]/div/a")
	WebElement voucher;
	@FindBy(xpath="//div[contains(@class,\"infobox infobox-warning\")]//strong")
	WebElement msg;
	@FindBy(xpath="//div/table/tbody/tr[1]/td[3]")
	WebElement status;
	@FindBy(xpath="//input[@id=\"gateway_paypal\"]")
	WebElement paypal;
	@FindBy(xpath="//input[@name=\"price\"]")
	WebElement pay;
	@FindBy(xpath="//*[@id=\"fadein\"]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div/div[2]/div/button")
	WebElement paynow;
	@FindBy(xpath="/html/body/div/div[2]/div[2]/")
	WebElement back;
	@FindBy(xpath="/html/body/div/div[2]/div[1]/a")
	WebElement yes;
	@FindBy(xpath="//*[@id=\"fadein\"]/header/div/div/div/div/div/div[2]/div/div[1]/nav/ul/li[1]/a")
	WebElement hotel;
	@FindBy(xpath="//*[@id=\"fadein\"]/header/div/div/div/div/div/div[2]/div/div[1]/nav/ul/li[2]/a")
	WebElement flights;
	@FindBy(xpath="//*[@id=\"fadein\"]/header/div/div/div/div/div/div[2]/div/div[1]/nav/ul/li[3]/a")
	WebElement tours;
	@FindBy(xpath="//*[@id=\"fadein\"]/header/div/div/div/div/div/div[2]/div/div[1]/nav/ul/li[4]/a")
	WebElement transfers;
	@FindBy(xpath="//*[@id=\"fadein\"]/header/div/div/div/div/div/div[2]/div/div[1]/nav/ul/li[5]/a")
	WebElement visa;
	@FindBy(xpath="//*[@id=\"fadein\"]/header/div/div/div/div/div/div[2]/div/div[1]/nav/ul/li[6]/a")
	WebElement blog;
	@FindBy(xpath="//*[@id=\"fadein\"]/header/div/div/div/div/div/div[2]/div/div[1]/nav/ul/li[7]/a")
	WebElement offers;
	@FindBy(xpath="//*[@id=\"currency\"]")
	WebElement currency;
	@FindBy(xpath="//*[@id=\"fadein\"]/header/div/div/div/div/div/div[2]/div/div[2]/div[2]/div/ul/li[7]/a")
	WebElement inr;
	@FindBy(xpath="//*[@id=\"fadein\"]/header/div/div/div/div/div/div[1]/a/img")
	WebElement home;		
	public void clickhotel()
	{
		hotel.click();
		
	}	
	public void clickflights()
	{
		flights.click();
		
	}	
	public void clickvisa()
	{
		visa.click();
		
	}	
	public void clickhome()
	{
		home.click();
		
	}	
	public void clicktours()
	{
		tours.click();
		
	}
	public void clickblog()
	{
		blog.click();
		
	}
	public void clickoffers()
	{
		offers.click();
		
	}	
	public void clickBooking()
	{
		Mybooking.click();
	}	
	public void clickAddFund()
	{
		addfund.click();
	}	
	public void clickProfile()
	{
		myprofile.click();
	}	
	public void clickLogout()
	{
		action=new Actions(driver);
		account.click();
		js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();", Logout);
		
		Logout.click();
	}	
	public void clickBack()
	{
		driver.navigate().back();
	}
	public void clickpaynow()
	{
		
		paynow.click();
	}	
	public String checkstatus()
	{
		return status.getText();
	}
	public void CheckMsg(String sts)
	{
		System.out.println("message="+msg.getText());
		if(msg.getText().equals(sts))
			{
			 System.out.println(msg.getText());
			}
		else
		{
			System.out.println("error occurs in Confirmation Message ");
		}
	}	
	public void setAddress(String strUserName) {
		address.sendKeys(strUserName);
	}
	public void clickUpdate()
	{
		action=new Actions(driver);
		 js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();", update);
		update.submit();
		 
	}	
	public void clickcurrency()
	{
		action=new Actions(driver);
		currency.click();
		js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();", inr);
		inr.click();
		 
	}	
	public void clearField()
	{
	 address.clear();	
	}
	public void clickpaypal()
	{
	 paypal.click();	
	}
	public void setpay()
	{
		pay.clear();
		pay.sendKeys("50");
	}
	public void clickgotit()
	{
		action=new Actions(driver);
		 js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();", gotit);
		gotit.click();
	}
	public void clickvoucher()
	{
		voucher.click();
	}
	 public int alertms()
	{
		if(alertmsg.getText().equals("Profile updated successfully."))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	 public void closetab()
	 {
		 ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs2.get(1));
		    driver.close();
		    driver.switchTo().window(tabs2.get(0));
	 }
}
