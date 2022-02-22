package com.aspire.selenium.screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Prog3 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		for(int i=1;i<=5;i++)
		{
		System.setProperty("webdriver.chrome.driver","E:\\priyanka\\Selenium\\SoftFiles\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		File desti=new File("E:\\priyanka\\Selenium\\ScreenShot\\flipkart"+i+".jpg");
		FileHandler.copy(source, desti);
		driver.close();
		}
		
	}

}
