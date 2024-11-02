package com.seleniumm;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByNameEg {
	public static void main(String[] args) throws Exception {
		//set chrome driver path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver-win32\\chromedriver.exe");
		
		//create an instance of chrome driver
		WebDriver driver = new ChromeDriver();
		
		//load webpage under test
		driver.get("file:///C:\\Users\\Administrator\\eclipse-workspace\\com.seleniumm_30102024\\src\\main\\resources\\LocateByNameEg.html");
		Thread.sleep(2000);
		
		//locate element by name
		WebElement usernameField=driver.findElement(By.name("username"));
		Thread.sleep(2000);
		
		//set some text to above element
		usernameField.sendKeys("myusername");
		Thread.sleep(1000);
		
		//locate element by name
		WebElement passwordField=driver.findElement(By.name("password"));
		Thread.sleep(1000);
		
		//set some text to above element
		passwordField.sendKeys("mypassword");
		Thread.sleep(1000);
		
		WebElement loginButton=driver.findElement(By.name("loginBtn"));
		loginButton.click();
		Thread.sleep(1000);
		
		driver.quit();
	}

}
