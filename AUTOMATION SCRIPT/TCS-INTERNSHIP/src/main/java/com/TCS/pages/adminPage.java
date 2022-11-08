package com.TCS.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TCS.base.Base;

public class adminPage extends Base {
	Actions action;
	JavascriptExecutor js;
	public adminPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="email")
	WebElement username ;
	/*@FindBy(xpath="//*[@id=\"fadein\"]/div[4]/div/div[2]/div[2]/div/form/div[1]/div/input")
	WebElement agentusername ;*/
	@FindBy(name="password")
	WebElement password;
	@FindBy(xpath="//*[@id=\"fadein\"]/div[4]/div/div[2]/div[2]/div/form/div[3]/button/span[1]")
	WebElement LoginButton;
	@FindBy(xpath="//*[@id=\"fadein\"]/div[4]/div/div[2]/div[2]/div/form/div[3]/div/div/a")
	WebElement signup;
	@FindBy(xpath="//div//ul//li//a[contains(text(),' English')]")
	WebElement english;
	@FindBy(id="languages")
	WebElement language ;
	
	public void setEmail(String strUserName) {
		username.sendKeys(strUserName);
	}
	/*public void setagentEmail(String strUserName) {
		agentusername.sendKeys(strUserName);
	}*/
	public void setPassword(String strUserName) {
		password.sendKeys(strUserName);
	}
	public void clicklogin()
	{
		LoginButton.click();
	}	
	public void clicklsignup()
	{
		signup.click();
	}
	public void clickLanguage()
	{
		language.click();
	     js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();", english);
		english.click();
	}
	public void clearField()
	{
		username.clear();
		password.clear();
	}
	
}
