package com.TCS.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class adminbase{
	
		public static WebDriver driver;
		public static Properties properties;
		@BeforeSuite
		public void setup() {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			properties =new Properties();
			File file=new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\TCS\\config\\config.properties");
			try
			{
				 FileInputStream inputstream=new FileInputStream(file);
				 properties.load(new InputStreamReader(inputstream,Charset.forName("UTF-8")));
			}catch(FileNotFoundException fie)
			{
				fie.printStackTrace();
				
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			driver.get(properties.getProperty("adminurl"));
			driver.manage().window().maximize();
		}	
		

	}



