package com.aspire.selenium.actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleRightClick 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\priyanka\\Selenium\\SoftFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		Actions act=new Actions(driver);
		//contex click
		WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'right')]"));
		
//		act.moveToElement(ele).perform();
//		act.contextClick().perform();
		
		act.moveToElement(ele).contextClick(ele).build().perform();
		
		
		//double click
		
		WebElement ele1 = driver.findElement(By.xpath("//button[contains(text(),'See ')]"));
		act.moveToElement(ele1).doubleClick(ele1).build().perform();
		
		
	}

}
