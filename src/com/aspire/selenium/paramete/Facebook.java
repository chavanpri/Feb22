package com.aspire.selenium.paramete;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook 
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\priyanka\\Selenium\\SoftFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		FileInputStream f1 = new FileInputStream("E:\\priyanka\\Selenium\\SoftFiles\\TestData\\test1.xlsx");
	    Workbook wbf = WorkbookFactory.create(f1);
	    
	   String frist = wbf.getSheet("Sheet2").getRow(0).getCell(2).getStringCellValue();
	   driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(frist);
	   
	   String last = wbf.getSheet("Sheet2").getRow(2).getCell(2).getStringCellValue();
	   driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(last);
	   
	  String email = wbf.getSheet("Sheet2").getRow(4).getCell(2).getStringCellValue();
	  driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(email);
	  
	  String password = wbf.getSheet("Sheet2").getRow(6).getCell(2).getStringCellValue();
	  driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(password);
		
	}

}
