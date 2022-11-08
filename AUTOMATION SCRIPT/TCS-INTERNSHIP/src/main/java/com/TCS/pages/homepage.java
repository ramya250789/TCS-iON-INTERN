package com.TCS.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TCS.base.Base;

public class homepage extends Base {
	Actions action;
	JavascriptExecutor js;
	public homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div//ul//li//a[contains(text(),' English')]")
	WebElement english;
	@FindBy(id="languages")
	WebElement language ;
	@FindBy(id="ACCOUNT")
	WebElement account ;
	@FindBy(xpath="//div//ul//li//a[contains(text(),'Customer Login')]")
	WebElement customerlogin;
	@FindBy(xpath="//div//ul//li//a[contains(text(),'Agents Login')]")
	WebElement agentlogin;
	public void clickLanguage()
	{
		language.click();
	     js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();", english);
		english.click();
	}
	public void clickCustomer()
	{
		account.click();
	     js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();", customerlogin);
		 customerlogin.click();
	}
	public void clickagent()
	{
		account.click();
	     js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();", customerlogin);
		 agentlogin.click();
		
	}
	
}
