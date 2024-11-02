package com.seleniumm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocateByNameEg3 {
	public static void main(String[] args) throws Exception {
		//set chrome driver path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver-win32\\chromedriver.exe");
		
		//create an instance of chrome driver
		WebDriver driver = new ChromeDriver();
		
		//load webpage under test
		driver.get("file:///C:\\Users\\Administrator\\eclipse-workspace\\com.seleniumm_30102024\\src\\main\\resources\\LocateByNameEg3.html");
		
		//-----wait until webpage loaded successfully
		//create WebDriverWait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		//locate username, only after it appeared in 
		WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		
		//enter text in username field
		usernameField.sendKeys("someuser");
		
		//locate age
		WebElement ageField=driver.findElement(By.name("age"));
		//enter age
		ageField.sendKeys(String.valueOf(20));
		
		//locate email
		WebElement emailField=driver.findElement(By.name("email"));
		//enter age
		emailField.sendKeys("abc@gmail.com");
		
		
		//set country
		WebElement countryDropdown=driver.findElement(By.name("country"));
		countryDropdown.sendKeys("Canada");
		
		
		//locate button
		WebElement submitButton = driver.findElement(By.id("submitButton"));
		//click button
		submitButton.click();
		
	//	Thread.sleep(2000);
	//	WebElement message = driver.findElement(By.id("message"));
	
		//---wait for message to be visible
		WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
		String msg = message.getText();
		System.out.println("Message is "+msg);
		
		//get updated message text
		Thread.sleep(1000);
		driver.quit();
	}
}
