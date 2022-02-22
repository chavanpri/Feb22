package com.aspire.selenium.popup;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartMultiplePage 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\priyanka\\Selenium\\SoftFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("samsung");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		for(WebElement items:list)
		{
			items.click();
			System.out.println(items.getText());
			Thread.sleep(2000);
		}
		Set<String> ids = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<String>(ids);
//		driver.switchTo().window(al.get(0));
//		String home = driver.findElement(By.xpath("(//div[@class='xtXmba'])[4]")).getText();
//		System.out.println(home);
		driver.switchTo().window(al.get(0));
		Thread.sleep(2000);
		String rating = driver.findElement(By.xpath("//span[@class='_2_R_DZ']//span/span[1]")).getText();
		System.out.println("0th index="+rating);
		
		Thread.sleep(2000);

         driver.switchTo().window(al.get(1));
         Thread.sleep(2000);
		String rating1 = driver.findElement(By.xpath("//span[@class='_2_R_DZ']//span/span[1]")).getText();
		System.out.println("frist index="+rating1);
		Thread.sleep(2000);

       driver.switchTo().window(al.get(2));
        Thread.sleep(2000);
		String rating2 = driver.findElement(By.xpath("//span[@class='_2_R_DZ']//span/span[1]")).getText();
		System.out.println("2nd index="+rating2);
				
		
		driver.quit();
		
	}

}
