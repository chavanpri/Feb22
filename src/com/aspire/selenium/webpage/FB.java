package com.aspire.selenium.webpage;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\priyanka\\Selenium\\SoftFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Priyanka");
		//driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Priyanka");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Chavan");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("abc@1234");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Cha.1234");
		
		 WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		
		Select s=new Select(day);
		WebElement dy = s.getFirstSelectedOption();
		System.out.println(dy.getText());
		s.selectByIndex(8);
		
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		
		Select s1=new Select(month);
		WebElement mo = s1.getFirstSelectedOption();
		
		System.out.println(mo.getText());
		
		s1.selectByValue("4");
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		List<WebElement> all = s1.getOptions();
		
		for(WebElement mon:all)
		{
			System.out.println("all month "+mon.getText());
		}
		TreeSet tr = new TreeSet();
		System.out.println("month sorted");
		for(WebElement mon:all)
		{
			tr.add(mon.getText());
		}
		for(Object sort:tr)
		{
			System.out.println(sort);
		}
		
		
		Select s2=new Select(year);
		WebElement yr = s2.getFirstSelectedOption();
		System.out.println(yr.getText());
		s2.selectByVisibleText("1994");
		
		driver.findElement(By.xpath("(//label[@class='_58mt'])[1]")).click();
		
		//driver.close();
		
	}

}
