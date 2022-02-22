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

public class writtenInExcel 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		String[] s1= {"Priyanka","Advika","Pratik","Tanvi","Rutu"};
		FileInputStream file = new FileInputStream("E:\\priyanka\\Selenium\\SoftFiles\\TestData\\test1.xlsx");
		Workbook wbf = WorkbookFactory.create(file);
		Sheet s = wbf.getSheet("Sheet4");
		Row row = s.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("Hi");
		for(int i=0;i<s1.length;i++)
		{
			s.createRow(i+1).createCell(1).setCellValue(s1[i]);
		}
		FileOutputStream file1 = new FileOutputStream("E:\\priyanka\\Selenium\\SoftFiles\\TestData\\test1.xlsx");
		wbf.write(file1);
	}

}
