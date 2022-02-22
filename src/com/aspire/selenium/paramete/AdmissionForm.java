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

public class AdmissionForm 
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\priyanka\\Selenium\\SoftFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admissions.dypvp.edu.in/");
		Thread.sleep(2000);
		FileInputStream file = new FileInputStream("E:\\priyanka\\Selenium\\SoftFiles\\TestData\\test1.xlsx");
		Workbook wbf = WorkbookFactory.create(file);
		
		String name = wbf.getSheet("Sheet3").getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='txtName']")).sendKeys(name);
		
		String email = wbf.getSheet("Sheet3").getRow(1).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys(email);
		
		String mobile = wbf.getSheet("Sheet3").getRow(2).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='txtCellNo']")).sendKeys(mobile);
		
		String password = wbf.getSheet("Sheet3").getRow(3).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='txtFirstPassword']")).sendKeys(password);
		
		String finalPassword = wbf.getSheet("Sheet3").getRow(4).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='txtSecondPassword']")).sendKeys(finalPassword);
		
		
	}

}
