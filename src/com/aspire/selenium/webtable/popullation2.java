package com.aspire.selenium.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popullation2
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\priyanka\\Selenium\\SoftFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.findeasy.in/top-indian-states-by-population/");
		List<WebElement> row = driver.findElements(By.xpath("(//div[@class='table-responsive wprt_style_display'])[1]//tr/td[2]"));
//		for(WebElement Rowoftable:row)
//		{
//			System.out.println(Rowoftable.getText());
//		}
		System.out.println("total size of rows is="+row.size());
		
		
		List<WebElement> coloum = driver.findElements(By.xpath("(//div[@class='table-responsive wprt_style_display'])[1]//tr[1]/td"));
//		for(WebElement ColoumOfTable:coloum)
//		{
//			System.out.print(ColoumOfTable.getText()+" ");
//		}
		System.out.println();
		System.out.println("total size of rows is="+coloum.size());
		for(int i=1;i<=row.size();i++)
		{
			for(int j=1;j<=coloum.size();j++)
			{
				String body = driver.findElement(By.xpath("(//div[@class='table-responsive wprt_style_display'])[1]//tr["+i+"]/td["+j+"]")).getText();
				System.out.print(body+"||");
			}
			System.out.println();
		}
		
		driver.close();
		
	}

}
