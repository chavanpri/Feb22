package com.aspire.selenium.Iframe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframe 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\priyanka\\Selenium\\SoftFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		WebElement frame1 = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame1);
		String topic = driver.findElement(By.id("topic")).getText();
		System.out.println(topic);
		WebElement innerFrame = driver.findElement(By.xpath("//iframe[@id='frame3']"));
		driver.switchTo().frame(innerFrame);
		driver.findElement(By.xpath("//input[@id='a']")).click();
		String frame2 = driver.findElement(By.xpath("//b[@style='color:green']")).getText();
		System.out.println(frame2);
		
	      driver.switchTo().parentFrame();
		String topic1 = driver.findElement(By.id("topic")).getText();
		System.out.println(topic1);
		
		driver.switchTo().defaultContent();
		String home = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
		System.out.println(home);
		
		WebElement frame3 = driver.findElement(By.id("frame2"));
		driver.switchTo().frame(frame3);
		 WebElement list = driver.findElement(By.id("animals"));
		 Select s=new Select(list);
		 s.selectByIndex(2);
		 System.out.println("List of all web elements");
		 List<WebElement> options = s.getOptions();
		 for(WebElement a:options)
		 {
			 System.out.println(a.getText());
		 }
		 driver.switchTo().defaultContent();
		String home2 = driver.findElement(By.xpath("//label[@style='font-size:40px']")).getText();
		System.out.println(home2);
	}

}
