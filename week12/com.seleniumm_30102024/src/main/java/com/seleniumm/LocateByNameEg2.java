package com.seleniumm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByNameEg2 {
	public static void main(String[] args) throws Exception {
		//set chrome driver path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver-win32\\chromedriver.exe");
		
		//create an instance of chrome driver
		WebDriver driver = new ChromeDriver();
		
		//load webpage under test
		driver.get("file:///C:\\Users\\Administrator\\eclipse-workspace\\com.seleniumm_30102024\\src\\main\\resources\\LocateByNameEg2.html");
		//-----wait until webpage loaded successfully
		
		//locate username
		//enter text in username field
		
		//locate age
		//enter age
		
		//locate button
		//click button
		//---wait for message to be visible
		
		//get updated message text
		
		driver.quit();
	}
}
