package com.aspire.selenium.browserlaunch;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\priyanka\\Selenium\\SoftFiles\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		System.out.println(driver.manage().window().getSize());
		driver.get("https://web.whatsapp.com/");
		driver.manage().window().maximize();
		System.out.println(driver.manage().window().getSize());
		
		Dimension d=new Dimension(500,600);
		
		driver.manage().window().setSize(d);
		
        Dimension d1=new Dimension(700,600);
		Thread.sleep(2000);
		driver.manage().window().setSize(d1);
		
        Dimension d2=new Dimension(500,300);
        Thread.sleep(2000);
		driver.manage().window().setSize(d2);
		
        Dimension d3=new Dimension(10,10);
        Thread.sleep(2000);
		driver.manage().window().setSize(d3);
		System.out.println(driver.manage().window().getSize());
		System.out.println(driver.manage().window().getPosition());
		
     Point p = new Point(200,200);
     driver.manage().window().setPosition(p);
     System.out.println(driver.manage().window().getPosition());
     Point p1 = new Point(300,800);
     driver.manage().window().setPosition(p1);
     System.out.println(driver.manage().window().getPosition());
     
     Point p2 = new Point(100,500);
     driver.manage().window().setPosition(p2);
     System.out.println(driver.manage().window().getPosition());
     
     Point p3 = new Point(700,400);
     driver.manage().window().setPosition(p3);
     System.out.println(driver.manage().window().getPosition());




	}

}
