package com.aspire.selenium.webpage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locator 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\priyanka\\Selenium\\SoftFiles\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("priya");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("chavan");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("pri@123");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("1wer45");
		
		
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		
	     Select s=new Select(day);
	     s.selectByIndex(6);
	     
	     WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	     Select s1=new Select(month);
	     s1.selectByValue("6");
	     
	     List<WebElement> all = s1.getOptions();
	     for(WebElement options:all)
	     {
	    	 System.out.println(options.getText());
	     }
	     
	     WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	     Select s2=new Select(year);
	     s2.selectByVisibleText("1994");
	    WebElement tr = s2.getFirstSelectedOption();
	    System.out.println(tr.getText());
	     driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
	     
	}

}
