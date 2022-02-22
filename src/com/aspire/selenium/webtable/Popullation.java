package com.aspire.selenium.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popullation 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\priyanka\\Selenium\\SoftFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/List_of_states_and_union_territories_of_India_by_population");
		Thread.sleep(2000);
		
		List<WebElement> coloum = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']//tr/td[2]/a"));
		for(WebElement coloumSize:coloum)
		{
			System.out.println(coloumSize.getText());
		}
		System.out.println("numbers of rows="+coloum.size());
		
		System.out.println();
		List<WebElement> row = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']//tr[2]/td"));
		System.out.println("numbers of coloums="+row.size());
		for(WebElement rowSize:row)
		{
			System.out.println(rowSize.getText()+" ");
		}
		System.out.println();
		String cell = driver.findElement(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']//tr[20]/td[10]")).getText();
		System.out.println("area of jammu and  kashmir state="+cell);
		driver.close();
	}

}
