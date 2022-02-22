package com.aspire.selenium.multipleElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sam 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\priyanka\\Selenium\\SoftFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("hotstar");
//		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//div[@id='scroll-container']//iron-selector/yt-chip-cloud-chip-renderer/yt-formatted-string"));
		for(WebElement alllist:list)
		{
			System.out.println(alllist.getText());
			Thread.sleep(2000);
		}
		System.out.println(list.size());
		driver.close();
		
		
	}

}
