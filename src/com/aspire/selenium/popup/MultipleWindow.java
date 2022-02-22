package com.aspire.selenium.popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\priyanka\\Selenium\\SoftFiles\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
	String id = driver.getWindowHandle();
	System.out.println("parent id="+id);
	driver.findElement(By.xpath("//button[contains(@id,'win1')]")).click();
	Set<String> ids = driver.getWindowHandles();
	
	
	for(String id1:ids) 
	{
	    System.out.println(id1);
	}
	 ArrayList<String> al = new ArrayList<String>(ids);
	 
	 driver.switchTo().window(al.get(1));
	 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("realme");
	 
	
	 driver.switchTo().window(al.get(0));
	 String text = driver.findElement(By.xpath("//h1[contains(text(),'Selenium WebDriver')]")).getText();
	 System.out.println("parent frame text "+text);
		//driver.close();
		driver.quit();
	}

}
