package com.TCS.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TCS.base.supplierbase;

	public class supplierpage extends supplierbase {
		Actions action;
		JavascriptExecutor js;
		public supplierpage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(name="email")
		WebElement username ;
		@FindBy(name="password")
		WebElement password;
		@FindBy(xpath="//*[@id=\"layoutDrawer_content\"]/main/div/div[1]/div[1]/div")
		WebElement sales;
		@FindBy(xpath="//*[@id=\"layoutDrawer_content\"]/main/div/div[3]/div[1]/div/div[1]/div/div/h2")
		WebElement revenue;
		@FindBy(xpath="//*[@id=\"layoutAuthentication_content\"]/main/div/div/div/div[1]/div/form/div[4]/button")
		WebElement LoginButton;
		@FindBy(xpath="/html/body/nav/div/div/div/div[3]/ul/li[4]/a")
		WebElement logout;
		@FindBy(xpath="//*[@id=\"dropdownMenuProfile\"]")
		WebElement account;
		@FindBy(xpath="//div//ul//li//a[contains(text(),' English')]")
		WebElement english;
		@FindBy(id="languages")
		WebElement language ;
		@FindBy(xpath="//*[@id=\"layoutDrawer_content\"]/main/div/div[2]/div[2]/a/div/div/div/div[1]/div[2]")
		WebElement pending;
		@FindBy(xpath="//*[@id=\"drawerToggle\"]")
		WebElement module;
		public void clickPending()
		{
			js = (JavascriptExecutor) driver;
			 js.executeScript("arguments[0].scrollIntoView();", pending);
			pending.click();
		}	
		
		public void setEmail(String strUserName) {
			username.sendKeys(strUserName);
		}
		public void setPassword(String strUserName) {
			password.sendKeys(strUserName);
		}
		public void clicklogin()
		{
			LoginButton.click();
		}	
		public void clickmodule()
		{
			module.click();
		}	
		public void clickLogout()
		{
			action=new Actions(driver);
			account.click();
			js = (JavascriptExecutor) driver;
			 js.executeScript("arguments[0].scrollIntoView();", logout);
			
			logout.click();
		}	
		public void clickLanguage()
		{
			language.click();
		     js = (JavascriptExecutor) driver;
			 js.executeScript("arguments[0].scrollIntoView();", english);
			english.click();
		}
		public String getsales()
		{
		 return sales.getText().toString();
		}
		public String getRevenue()
		{
		 return revenue.getText().toString();
		}
		public void clearField()
		{
			username.clear();
			password.clear();
		}
		

}
