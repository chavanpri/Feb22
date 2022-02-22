package com.aspire.selenium.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\priyanka\\Selenium\\SoftFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
		Thread.sleep(2000);
		//cell
		String bodyCell = driver.findElement(By.xpath("//td[text()='Angels & Demons']")).getText();
		System.out.println(bodyCell);
		
		//row
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='BooksAuthorsTable']//tr[1]"));
		System.out.println("total coloum numbers="+row.size());
		for(WebElement element:row)
		{
			System.out.println(element.getText());
		}
		
		//coloum
		List<WebElement> coloum = driver.findElements(By.xpath("//table[@id='BooksAuthorsTable']//td[1]"));
		System.out.println("total number of row="+coloum.size());
		for(WebElement ele:coloum)
		{
			System.out.println(ele.getText());
		}
		
		
		driver.close();
		
	}

}
