package com.aspire.selenium.multipleElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\priyanka\\Selenium\\SoftFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("vivo");
		Thread.sleep(2000);
		
		List<WebElement> allOptions = driver.findElements(By.xpath("(//div[@class='OBMEnb'])[1]//li/div/div[2]"));
		System.out.println("size of all options "+allOptions.size());
		for(WebElement all:allOptions)
		{
			System.out.println(all.getText());
		
		
		}
		String exp="vivo y21";
		for(WebElement temp:allOptions)
		{
			String actual = temp.getText();
			
			if(exp.equals(actual))
			{
				System.out.println("yes expected string is present");
				temp.click();
				break;
			}
		}
		
	}
}


