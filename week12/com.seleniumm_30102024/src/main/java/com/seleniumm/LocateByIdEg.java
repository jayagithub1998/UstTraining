package com.seleniumm;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByIdEg {
	public static void main(String[] args) throws Exception {
		//chrome driver path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver-win32\\chromedriver.exe");
		
		//create an instance of chrome driver
		WebDriver driver = new ChromeDriver();
		
		//to locate local file -file:///->right click html file inside resources folder->click on properties->copy the complete path and paste it after file:///
		driver.get("file:///C:\\Users\\Administrator\\eclipse-workspace\\com.seleniumm_30102024\\src\\main\\resources\\LocateByIdEg.html");
		
		Thread.sleep(2000);
		
		WebElement usernameField =driver.findElement(By.id("username"));
		usernameField.sendKeys("myusername");
		
		Thread.sleep(5000);
		
		driver.quit();
	}
}

