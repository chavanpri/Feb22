package com.aspire.selenium.multibrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multi 
{
	static WebDriver driver;
	static String s="Firefox";
	public static void main(String[] args) throws InterruptedException 
	{
		if(s.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "E:\\priyanka\\Selenium\\SoftFiles\\chromedriver.exe");
		 driver = new ChromeDriver();
		}
		else if(s.equals("Firefox"))
		{
         System.setProperty("webdriver.gecko.driver", "E:\\priyanka\\Selenium\\SoftFiles\\geckodriver.exe");
         Thread.sleep(2000);
		 driver = new FirefoxDriver();
		}
		
		
		driver.get("https://www.amazon.in/");
		driver.close();
	}

}
