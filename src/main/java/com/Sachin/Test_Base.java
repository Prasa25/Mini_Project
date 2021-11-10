package com.Sachin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Test_Base {

public static WebDriver driver;
	
	public static WebDriver getBrowser(String web) {
		if (web.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Driver//chromedriver.exe");
			 driver = new ChromeDriver();
			
		} else if (web.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//Driver//geckodriver.exe");
			driver = new FirefoxDriver();
		
		}
		driver.manage().window().maximize();
		
		return driver;
	}
		

	public static void getUrl(String Url) {
		driver.get(Url);
	}

	public static void clickOnElement(WebElement element) {
		
		element.click();
	
	}
	public static void sendKeys(WebElement element,String value) {
		
		element.sendKeys(value);

	}
	
	public static void sleep(int seconds) throws InterruptedException {
		Thread.sleep(seconds);

	}
	
	public static void actionClass(String name , WebElement element) {
	
		Actions ac = new Actions(driver);
		
	      if (name.equalsIgnoreCase("move")) {
			ac.moveToElement(element).build().perform();
		}else if (name.equalsIgnoreCase("movement")) {
			ac.moveToElement(element).build().perform();
			
		}else if (name.equalsIgnoreCase("click")) {
			ac.contextClick(element).build().perform();
			
		}

	}
		

	}

