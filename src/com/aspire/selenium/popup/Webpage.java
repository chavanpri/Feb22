package com.aspire.selenium.popup;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Webpage
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\priyanka\\Selenium\\SoftFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
		Thread.sleep(2000);
		List<WebElement> c = driver.findElements(By.xpath("(//div[@class='row'])[1]//div[3]/input"));
		
		for(WebElement c1:c)
		{
			c1.click();
		}
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		Thread.sleep(2000);
		
		WebElement lan = driver.findElement(By.xpath("//select[@id='programming-languages']"));
		Select s=new Select(lan);
		s.selectByValue("JavaScript");
		Thread.sleep(2000);
		
		WebElement selenium = driver.findElement(By.xpath("//select[@id='selenium_suite']"));
		Select s1=new Select(selenium);
		s1.selectByVisibleText("Selenium Grid");
		Thread.sleep(2000);
		driver.findElement(By.id("alertBox")).click();
		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(al.getText());
		Thread.sleep(2000);
		al.accept();
	
		driver.findElement(By.id("confirmBox")).click();
		Thread.sleep(2000);
		Alert al1 = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(al1.getText());
		al1.dismiss();
		Thread.sleep(2000);
		driver.findElement(By.id("promptBox")).click();
		Alert al2 = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(al2.getText());
		al2.accept();
		
		driver.findElement(By.id("win1")).click();
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//h1[text()='Selenium WebDriver Practice']")).getText();
		System.out.println(text);
		Set<String> ids = driver.getWindowHandles();
		for(String id:ids)
		{
			System.out.println(id);
		}
		
		ArrayList<String> alist = new ArrayList<String>(ids);
		
		driver.switchTo().window(alist.get(1));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("redmi");
		//driver.findElement(By.xpath("(//span[text()='redmi'])[3]")).click();
		driver.switchTo().window(alist.get(0));
		String home = driver.findElement(By.xpath("//label[text()='Drag and drop the elements in the below list']")).getText();
		System.out.println(home);
		//driver.quit();
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
