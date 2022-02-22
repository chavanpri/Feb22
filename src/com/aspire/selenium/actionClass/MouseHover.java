package com.aspire.selenium.actionClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseHover 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\priyanka\\Selenium\\SoftFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/");
		Thread.sleep(2000);
		//1 cell
		WebElement fristcell = driver.findElement(By.xpath("(//tr[@class='mouseOut'])[1]//td[1]"));
	      Actions act = new Actions(driver);
	      act.moveToElement(fristcell).perform();
	      
	      //multiple cells
	      
	      List<WebElement> allCell = driver.findElements(By.xpath("//tr[@class='mouseOut']//td[1]"));
	      Actions act1 = new Actions(driver);
	      for(WebElement list:allCell)
	      {
	    	  act1.moveToElement(list).perform();
	      }
	      Thread.sleep(2000);

	      
	      
	      
	      
	      driver.close();
	}

}
