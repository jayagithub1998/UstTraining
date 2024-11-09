package com.seleniumm;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertConfirmPromptEg {
	public static void main(String[] args) throws Exception {
		//chrome driver path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver-win32\\chromedriver.exe");
		
		//create an instance of chrome driver
		WebDriver driver = new ChromeDriver();
		
		//to locate local file -file:///->right click html file inside resources folder->click on properties->copy the complete path and paste it after file:///
		driver.get("file:///C:\\Users\\Administrator\\eclipse-workspace\\com.seleniumm_30102024\\src\\main\\resources\\AlertConfirmPromptEg.html");
		
		Thread.sleep(2000);
		
		//-------------Alert------------------
		testAlert(driver);
		
		//-------------Confirm------------------
		testConfirm(driver);
		
		//-------------Prompt------------------
		testPrompt(driver);
		
		driver.quit();
	}
	
	private static void testAlert(WebDriver driver) throws Exception {
		WebElement alertButton =driver.findElement(By.xpath("//button[text()='Show Alert']"));
		alertButton.click();
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(2000);
	}
	
	private static void testConfirm(WebDriver driver) throws Exception {
		WebElement confirmButton =driver.findElement(By.xpath("//button[text()='Show Confirm']"));
		confirmButton.click();
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(2000);
	}
	
	private static void testPrompt(WebDriver driver) throws Exception {
		WebElement promptButton =driver.findElement(By.id("prompt"));
		promptButton.click();
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("abcd");
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
	}
	
	
}
