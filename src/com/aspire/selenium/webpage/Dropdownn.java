package com.aspire.selenium.webpage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Dropdownn 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "E:\\priyanka\\Selenium\\SoftFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");

		 WebElement product = driver.findElement(By.xpath("(//select[@class='col-lg-3'])[1]"));
		Select s=new Select(product);
		s.selectByValue("Apple");
		WebElement animal = driver.findElement(By.xpath("(//select[@class='col-lg-3'])[2]"));
		Select s1=new Select(animal);
		s1.selectByIndex(1);
		
		WebElement food = driver.findElement(By.xpath("(//select[@class='col-lg-3'])[3]"));
		Select s2=new Select(food);
		s2.selectByIndex(1);
		s2.selectByVisibleText("Burger");
		s2.deselectAll();
		System.out.println(s2.isMultiple());
		
	       List<WebElement> alloption = s2.getOptions();
	       for(WebElement option:alloption)
	       {
	    	   System.out.println(option.getText());
	       }
	       System.out.println("selected options");
	       
	       List<WebElement> selected = s2.getAllSelectedOptions();
	       
	       for(WebElement a:selected)
	       {
	    	   System.out.println(a.getText());
	       }
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
		
		
}
}
