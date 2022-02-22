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

public class Sam 
{
	
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "E:\\priyanka\\Selenium\\SoftFiles\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();	
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]")).sendKeys("Priya");
	driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]")).sendKeys("Awate");
	driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("abc@123");
	driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("priya@134");
	WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	Select s=new Select(day);
	WebElement frist = s.getFirstSelectedOption();
	System.out.println(frist.getText());
	List<WebElement> all = s.getOptions();
	for(WebElement a:all)
	{
		System.out.println(a.getText());
	}
	s.selectByIndex(6 );
	WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
	Select s1=new Select(month);
	WebElement frist1 = s1.getFirstSelectedOption();
	System.out.println(frist1.getText());
	List<WebElement> monthlist = s1.getOptions();
	for(WebElement ab:monthlist)
	{
		System.out.println(ab.getText());
	}
	s1.selectByValue("7");
	
	
	TreeSet tr = new TreeSet();
	System.out.println("sorting");
	for( WebElement mon:monthlist)
	{
		tr.add(mon.getText());
	}
	for(Object b:tr)
	{
		System.out.println(b);
	}
	
	driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
}
}
