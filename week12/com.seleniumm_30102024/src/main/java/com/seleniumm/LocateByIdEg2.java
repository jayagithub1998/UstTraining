package com.seleniumm;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByIdEg2 {
	public static void main(String[] args) throws Exception {
		//set chrome driver path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver-win32\\chromedriver.exe");
		
		//create an instance of chrome driver
		WebDriver driver = new ChromeDriver();
		
		//load webpage under test
		driver.get("file:///C:\\Users\\Administrator\\eclipse-workspace\\com.seleniumm_30102024\\src\\main\\resources\\LocateByIdEg2.html");
		Thread.sleep(2000);
		
		//locate message element
		WebElement messageField = driver.findElement(By.id("message"));
		
		//get text in the message element
		String cMessage=messageField.getText();
		
		//locate button element by id
		WebElement tbuttonField = driver.findElement(By.id("testButton"));
		
		//click above button element
		tbuttonField.click();
		Thread.sleep(2000);
		
		//locate message element
		WebElement umessageField = driver.findElement(By.id("message"));
		
		//get text in the message element
		String uMessage=umessageField.getText();
		
		//display above text
		System.out.println("Message before clicking button : "+cMessage);
		System.out.println("Message after clicking button : "+uMessage);
		
		Thread.sleep(2000);
		driver.quit();
	}
}
