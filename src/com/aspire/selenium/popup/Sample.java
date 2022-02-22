package com.aspire.selenium.popup;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.RandomString;

public class Sample 
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\priyanka\\Selenium\\SoftFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("tv");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		List<WebElement> kurti = driver.findElements(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']//a/div[2]/div[1]/div[1]"));
		for(WebElement allKurti:kurti)
		{
			allKurti.click();
			Thread.sleep(2000);
		}
		Set<String> ids = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<String>(ids);
		driver.switchTo().window(al.get(1));
		String list = driver.findElement(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']//a/div[2]/div[2]/div[1]/div[1]")).getText();
		System.out.println(list);
		
		driver.switchTo().window(al.get(0));
		String list1 = driver.findElement(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']//a/div[2]/div[2]/div[1]/div[1]")).getText();
		System.out.println(list1);
		
		
		
		
			}

}
