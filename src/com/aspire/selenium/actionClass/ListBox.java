package com.aspire.selenium.actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ListBox 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\priyanka\\Selenium\\SoftFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Mobile");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).perform();

		
	}
}
