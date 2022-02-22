package com.aspire.selenium.multipleElement;

import java.util.List;

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
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("(//div[@class='nav-sprite'])[1]//a"));
		for(WebElement all:list)
		{
			System.out.println(all.getText());
			
		}
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("redmi");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		List<WebElement> mobileList = driver.findElements(By.xpath("(//div[@class='sg-col-inner'])[3]//span//div/h2"));
		for(WebElement allList:mobileList)
		{
			System.out.println(allList.getText());
		}
	}
}
