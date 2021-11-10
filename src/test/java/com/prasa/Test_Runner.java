package com.prasa;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.Sachin.Test_Base;

public class Test_Runner extends Test_Base {
		public static WebDriver driver;

		public static void main(String[] args) throws InterruptedException, AWTException ,IOException{
			
			driver = getBrowser("chrome");
			
			getUrl("http://automationpractice.com/index.php");
			
			
			WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
			clickOnElement(signin);
			sleep(2000);

			
			WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
			sendKeys(email, "navanikasmilepls@gmail.com");
			
			WebElement passwd = driver.findElement(By.xpath("//input[@id='passwd']"));
			sendKeys(passwd, "Ambi@456");
			
			WebElement sign = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
			clickOnElement(sign);
			
			
			WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
			actionClass("move", women);
			
			WebElement tShirt = driver.findElement(By.xpath("//a[@title='T-shirts']"));
			clickOnElement(tShirt);
			
			sleep(2000);
			

			WebElement img = driver.findElement(By.xpath("//a[@title='Faded Short Sleeve T-shirts']"));
			actionClass("movement", img);
		
			WebElement cart = driver.findElement(By.xpath("//a[@title='Add to cart']"));
			actionClass("click", cart);
			
			 Robot b = new Robot();
			   b.keyPress(KeyEvent.VK_DOWN);
			   b.keyRelease(KeyEvent.VK_DOWN);
			   b.keyPress(KeyEvent.VK_DOWN);
			   b.keyRelease(KeyEvent.VK_DOWN);
			   b.keyPress(KeyEvent.VK_ENTER);
			  b.keyRelease(KeyEvent.VK_ENTER);
			  
			  sleep(2000);
			  
			  TakesScreenshot ss= (TakesScreenshot)driver;
			  File screenshotAs = ss.getScreenshotAs(OutputType.FILE);
			  File Destination=new File("C:\\Users\\ELCOT\\eclipse-workspace\\TRAINING\\Screenshot\\snap4.png");
			  FileUtils.copyFile(screenshotAs, Destination);
			  
		
		
	}
	}

