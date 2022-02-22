package com.aspire.selenium.webpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdmissionForm 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","E:\\priyanka\\Selenium\\SoftFiles\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://dypatil.edu/application/");
    driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Priyanka");

	driver.findElement(By.xpath("//input[@name='middle_name']")).sendKeys("Abhishek");
	driver.findElement(By.xpath("//input[@placeholder='Surname']")).sendKeys("Chavan");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='father_name']")).sendKeys("Anil Awate");
	driver.findElement(By.xpath("//input[@name='mother_name']")).sendKeys("Vijaya Awate");
	driver.findElement(By.xpath("//input[@name='mother_tongue']")).sendKeys("marathi");
	
	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/form/div[2]/div[2]/div[1]/div/label[3]")).click();
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='dob']")).sendKeys("07/01/1994");
	driver.findElement(By.xpath("//input[@name='nationality']")).sendKeys("Indian");
	driver.findElement(By.xpath("//input[@name='religion']")).sendKeys("Hindu-maratha");
	
	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/form/div[2]/div[3]/div[2]/label[2]")).click();
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='blood_group']")).sendKeys("A Positive");
	driver.findElement(By.xpath("//input[@name='address_line_one']")).sendKeys("101 Shree Samarth Heritez");
	driver.findElement(By.xpath("//input[@name='address_line_two']")).sendKeys("Ravet");
	driver.findElement(By.xpath("//input[@name='address_city']")).sendKeys("Pimpari-Chichwad");
	driver.findElement(By.xpath("//input[@name='address_state']")).sendKeys("Maharastra ");
	driver.findElement(By.xpath("//input[@name='address_district']")).sendKeys("Pune");
	driver.findElement(By.xpath("//input[@name='address_pincode']")).sendKeys("412101");
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/form/div[2]/div[4]/div[2]/div[4]/label[2]")).click();
	
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("awatepriyanka94@gmail.com");
	driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys("234 5678");
	driver.findElement(By.xpath("//input[@name='fax']")).sendKeys("(212)-345 4526");
	driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9876543210");
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='father_mobile']")).sendKeys("9089786756");
	driver.findElement(By.xpath("//input[@name='mother_mobile']")).sendKeys("9796756437");
	WebElement admission = driver.findElement(By.xpath("//select[@class='form-control']"));
	
	Thread.sleep(2000);
	
	  Select s = new Select(admission);
	s.selectByValue("School of Ayurveda");
	WebElement level = driver.findElement(By.xpath("//select[@name='level']"));
	  Select s1 = new Select(level);
		s1.selectByValue("After Graduation");
		
		
//		WebElement course = driver.findElement(By.xpath("//select[@name='course_namel]"));
//	    Select s2 = new Select(course);
//		s2.selectByValue("Masters in Ayurveda");
//	
	
	
	
}



}
