package com.aspire.selenium.browserlaunch;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "E:\\priyanka\\Selenium\\SoftFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@data-type='text'])[1]")).sendKeys("Priyanka");
		driver.findElement(By.xpath("(//input[@data-type='text'])[2]")).sendKeys("Chavan");
		driver.findElement(By.xpath("(//input[@data-type='text'])[3]")).sendKeys("987654320");
		driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("abc@123");
		driver.findElement(By.xpath("(//span[@class='_5k_2 _5dba'])[1]")).click();
		
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select s = new Select(day);
		s.selectByIndex(6);
		WebElement dayselection = s.getFirstSelectedOption();
		System.out.println(dayselection.getText());
		
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select s1 = new Select(month);
		s1.selectByValue("2");
		
		Thread.sleep(2000);
		s1.selectByValue("10");
		Thread.sleep(2000);
		s1.selectByIndex(5);
		//s1.deselectByIndex(5);
		s1.selectByIndex(4);
		
		List<WebElement> monthlist = s1.getOptions();
		
		
		for(WebElement m:monthlist)
		{
			System.out.println(m.getText());
		}
		
		System.out.println("total month count="+monthlist.size());
		System.out.println(s1.isMultiple());
		System.out.println("sorted month");
		TreeSet tr = new TreeSet();
		for(WebElement mo:monthlist)
		{
			tr.add(mo.getText());
		}
		
		for(Object sort:tr)
		{
			System.out.println(sort);
		}
		
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select s2=new Select(year);
		s2.selectByVisibleText("1994");


		//driver.navigate().back();
		//Thread.sleep(2000);
		//driver.navigate().forward();
		//driver.navigate().refresh();
		
//		System.out.println(driver.manage().window().getSize());
//		System.out.println(driver.manage().window().getPosition());
//		
//		Dimension d=new Dimension(200,300);
//		driver.manage().window().setSize(d);
//		
//		Point p=new Point(30,50);
//		driver.manage().window().setPosition(p);
//		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getTitle());
//		
driver.close();	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
