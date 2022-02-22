package com.aspire.selenium.Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\priyanka\\Selenium\\SoftFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		Thread.sleep(2000);
		//switch using index
		driver.switchTo().frame(0);
		String fr = driver.findElement(By.xpath("//b[@id='topic']")).getText();
		System.out.println(fr);
		Thread.sleep(2000);
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='frame3']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//input[@id='a']")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		String home = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
		System.out.println(home);
		
		//switch to next i frame by nameorid
		driver.switchTo().frame("frame2");
		String ani = driver.findElement(By.xpath("//b[text()='Animals :']")).getText();
		System.out.println(ani);
		driver.close();
		
	}

}
