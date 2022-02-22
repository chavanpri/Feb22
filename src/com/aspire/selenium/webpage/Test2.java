package com.aspire.selenium.webpage;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2
{
	public static void main(String[] args) throws InterruptedException 
	{
//Browser launching		
		System.setProperty("webdriver.chrome.driver", "E:\\priyanka\\Selenium\\SoftFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//Website load in browser		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
//isDisplayed
		boolean logodisplayresult = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
		System.out.println("Logo displayed ="+logodisplayresult);
		if(logodisplayresult=true)
		{
			System.out.println("Facebook logo is displayed");
		}
		else
		{
			System.out.println("Facebook logo is not dispalyed");
		}
		
//isEnabled
		boolean emailTextbox = driver.findElement(By.xpath("//input[@id='email']")).isEnabled();
		System.out.println("Email Id Text box is enabled="+emailTextbox);
//isSelected
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Priyanka");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Chavan");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("xyz@123");
		driver.findElement(By.xpath("(//input[@class='_8esa'])[1]")).click();
		boolean FemaleSelection = driver.findElement(By.xpath("(//input[@class='_8esa'])[1]")).isSelected();
		boolean MaleSelection = driver.findElement(By.xpath("(//input[@class='_8esa'])[2]")).isSelected();
		System.out.println("Radio button of female selected="+FemaleSelection);
		System.out.println("Radio button of male selected="+MaleSelection);

		boolean fe = driver.findElement(By.xpath("(//input[@class='_8esa'])[1]")).isSelected();
		System.out.println(fe);
		
	}
}



