package com.aspire.selenium.actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CustomiseListBox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\priyanka\\Selenium\\SoftFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Actions act=new Actions(driver);
		act.moveToElement(month).perform();
		Thread.sleep(4000);
		act.click(month).perform();
		Thread.sleep(4000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(4000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(4000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(4000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(4000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		
		
	}

}
