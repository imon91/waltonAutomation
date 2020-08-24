package Automation;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Basic {
	@Test
	public void test(){
	String path = System.getProperty("user.dir");
	System.out.println(path); 
	System.setProperty("webdriver.chrome.driver",path+"\\Resources\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	 driver.manage().window().maximize();
	driver.findElement(By.name("q")).sendKeys("dsp.eskimi.com");
	WebDriverWait wait1 = new WebDriverWait(driver, 25);
	
	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.name("btnK")));
	driver.findElement(By.name("btnK")).click();
	driver.get("https://dsp.eskimi.com/");
	 driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("demo");
	driver.findElement(By.id("password")).sendKeys("demo123");
	driver.findElement(By.xpath("//input[@name='']")).click();
	String url1 = driver.getCurrentUrl();
	System.out.println(url1);
	
	driver.findElement(By.linkText("Eskimi DSP demo campaign 2")).click();
	driver.navigate().back();
	String url2 = driver.getCurrentUrl();
	System.out.println(url2);
	Assert.assertEquals(url1, url2);
	System.out.println("url's are same");
	
	
	
	
	
	
	}

	
	
	
}
