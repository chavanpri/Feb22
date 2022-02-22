package com.aspire.selenium.actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\priyanka\\Selenium\\SoftFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable/");
		Thread.sleep(2000);
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
		Actions act = new Actions(driver);
//		//approch 1
//		act.clickAndHold(drag).release(drop).build().perform();
//		Thread.sleep(2000);
//		
		//approch 2
		
//		act.moveToElement(drag).clickAndHold().release(drop).build().perform();
//		Thread.sleep(2000);
//		
		//approch 3
		
//		act.moveToElement(drag).clickAndHold().moveToElement(drop).release().build().perform();
//		Thread.sleep(2000);
//		
//		//approch 4
//		
		act.dragAndDrop(drag, drop).perform();
		Thread.sleep(2000);
		driver.close();
	}

}
