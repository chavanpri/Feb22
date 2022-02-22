package com.aspire.selenium.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable2 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\priyanka\\Selenium\\SoftFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
		Thread.sleep(2000);
		
		//table=header row+ header body
		
		
		int rowCount = driver.findElements(By.xpath("//table[@id='BooksAuthorsTable']//tr/td[1]")).size();
		int coloumCount = driver.findElements(By.xpath("//table[@id='BooksAuthorsTable']//tr[2]/td")).size();
		List<WebElement> header = driver.findElements(By.xpath("//table[@id='BooksAuthorsTable']//tr/th"));
		for(WebElement ele:header)
		{
			System.out.println(ele.getText());
		}
		System.out.println();
		for(int i=1;i<=rowCount;i++)
		{
			for(int j=1;j<=coloumCount;j++)
			{
				String bodyele = driver.findElement(By.xpath("//table[@id='BooksAuthorsTable']//tr["+(i+1)+ "]/td["+j+"]")).getText();
				System.out.print(bodyele+"   ");
				
				
			}
			System.out.println();
		}
		Thread.sleep(2000);
		driver.close();
	}

}
