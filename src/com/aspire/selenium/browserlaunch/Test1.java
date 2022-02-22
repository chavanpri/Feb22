package com.aspire.selenium.browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\priyanka\\Selenium\\SoftFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hotstar.com/in");
		Thread.sleep(2000);
		driver.navigate().to("https://www.netflix.com/in/");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.get("https://www.hotstar.com/in/tv/thipkyanchi-rangoli/1260070470");
		
		Thread.sleep(2000);
		driver.get("https://www.hotstar.com/in/tv/thipkyanchi-rangoli/1260070470/shashank-assures-apurva/1000270665");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.close();
		
	}

}
