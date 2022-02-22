package com.aspire.selenium.popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OtherPopup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\priyanka\\Selenium\\SoftFiles\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		Thread.sleep(2000);
		// 1.alert
		driver.findElement(By.name("alert")).click();
		Alert al = driver.switchTo().alert();
		String text = al.getText();
		System.out.println(text);
		Thread.sleep(2000);
		al.accept();
		
		//2.conformation box
		
		driver.findElement(By.xpath("//input[@name='confirmation']")).click();
		Alert al2 = driver.switchTo().alert();
		System.out.println(al2.getText());
		Thread.sleep(2000);

		al2.dismiss();
		
		//3.promot
		
		driver.findElement(By.name("prompt")).click();
		Alert a13 = driver.switchTo().alert();
		System.out.println(a13.getText());
		Thread.sleep(2000);
		a13.sendKeys("Priyanka");
		Thread.sleep(2000);
		a13.accept();
		
		
	}
	

}
