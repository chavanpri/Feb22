package com.aspire.selenium.actionClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;
import org.openqa.selenium.interactions.Actions;

public class FLIPKART 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "E:\\priyanka\\Selenium\\SoftFiles\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	Actions act= new Actions(driver);
	WebElement fashion = driver.findElement(By.xpath("(//div[@class='xtXmba'])[4]"));

	act.moveToElement(fashion).perform();
	
	List<WebElement> Fashionlist = driver.findElements(By.xpath("//div[@class='ZEl_b_ _3joddx _2ogGYG _23xUYh _3pAV4E']"));
	
	for(WebElement list:Fashionlist)
	{
		System.out.println(list.getText());
	}
	driver.close();
}
}
