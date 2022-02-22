package com.aspire.selenium.paramete;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class XL 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream F1 = new FileInputStream("E:\\priyanka\\Selenium\\SoftFiles\\TestData\\test1.xlsx");
		Workbook wbf = WorkbookFactory.create(F1);
		Sheet s = wbf.getSheet("Sheet5");
		
		String a[]= {"101","SHREE","SAMARTH","HERITEZ","SHIV" ,"SHAMBO"," COLONY"," ADARSHNAR"};
		for(int i=0;i<a.length;i++)
		{
			s.createRow(i).createCell(1).setCellValue(a[i]);
		}
		FileOutputStream f2 = new FileOutputStream("E:\\priyanka\\Selenium\\SoftFiles\\TestData\\test1.xlsx");
		wbf.write(f2);
	}

}
