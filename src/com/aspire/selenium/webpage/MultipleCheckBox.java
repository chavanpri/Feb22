package com.aspire.selenium.webpage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleCheckBox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\priyanka\\Selenium\\SoftFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		WebElement products = driver.findElement(By.xpath("(//select[@class='col-lg-3'])[1]"));
		Select s=new Select(products);
		 s.selectByValue("Apple");
		 
		 boolean selection = driver.findElement(By.xpath("//option[@value='Apple']")).isSelected();
		 System.out.println("is selected="+selection);
		 boolean animal = driver.findElement(By.xpath("(//select[@class='col-lg-3'])[2]")).isEnabled();
		 System.out.println("is enable="+animal);
		WebElement ani = driver.findElement(By.xpath("(//select[@class='col-lg-3'])[2]"));
		Select s1=new Select(ani);
		 s1.selectByIndex(2);
		 
		 boolean animal1 = driver.findElement(By.xpath("(//select[@class='col-lg-3'])[2]")).isDisplayed();
		 System.out.println("is displayed="+animal1);

		 System.out.println("animal is multiple "+s1.isMultiple());
		 
		WebElement food = driver.findElement(By.xpath("(//select[@class='col-lg-3'])[3]"));
		Select s2=new Select(food);
		s2.selectByIndex(1);
		s2.selectByValue("burger");
		Thread.sleep(2000);
		System.out.println("food is multiple="+s2.isMultiple());
		s2.deselectByIndex(1);
		System.out.println("food is multiple="+s2.isMultiple());
		WebElement frist = s2.getFirstSelectedOption();
		System.out.println("frist="+frist.getText());
		System.out.println("list");
		List<WebElement> all = s2.getOptions();
		for(WebElement a:all)
		{
			System.out.println(a.getText());
		}
		List<WebElement> sele = s2.getAllSelectedOptions();
		System.out.println("selected");
		for(WebElement se:sele)
		{
			System.out.println(se.getText());
		}


		 
		 
		 
		 
		 
		 
			}

}
