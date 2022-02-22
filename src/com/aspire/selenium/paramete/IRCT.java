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

public class IRCT 
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\priyanka\\Selenium\\SoftFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/profile/user-registration");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Address']")).click();
		FileInputStream file = new FileInputStream("E:\\priyanka\\Selenium\\SoftFiles\\TestData\\test1.xlsx");
		Workbook wbf = WorkbookFactory.create(file);
		String flatno = wbf.getSheet("Sheet1").getRow(2).getCell(3).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='resAddress1']")).sendKeys(flatno);
	}
	

}
