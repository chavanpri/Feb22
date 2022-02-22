package com.aspire.selenium.Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NastedFrame 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\priyanka\\Selenium\\SoftFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/nestedframes");
		Thread.sleep(2000);
		//1.id
		//driver.switchTo().frame("frame1");
		
		//2.webelement
		 WebElement parentframe = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		 driver.switchTo().frame(parentframe);
		 
		 //3.index
		// driver.switchTo().frame(1);
		 
		String s = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
		System.out.println(s);
		
		
		//to child frame
		
		WebElement childframe = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(childframe);
		Thread.sleep(2000);
		String c = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
		System.out.println(c);
		//child to parent
		driver.switchTo().parentFrame();
		//child to home page
		driver.switchTo().defaultContent();
		String hometext = driver.findElement(By.xpath("(//div[@id='framesWrapper']/div)[1]")).getText();
		System.out.println(hometext);
	}
	

}
