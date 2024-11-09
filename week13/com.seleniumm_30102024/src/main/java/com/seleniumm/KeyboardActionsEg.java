package com.seleniumm;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardActionsEg {
	public static void main(String[] args) throws Exception {
		//chrome driver path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver-win32\\chromedriver.exe");
		
		//create an instance of chrome driver
		WebDriver driver = new ChromeDriver();
		
		//to locate local file -file:///->right click html file inside resources folder->click on properties->copy the complete path and paste it after file:///
		driver.get("file:///C:\\Users\\Administrator\\eclipse-workspace\\com.seleniumm_30102024\\src\\main\\resources\\KeyboardActionsEg.html");
				
		WebElement inputField = driver.findElement(By.id("inputField"));
		inputField.sendKeys("Some text Here!");
		Thread.sleep(2000);
		//----Backspace
		//inputField.sendKeys(Keys.BACK_SPACE);
		//inputField.sendKeys(Keys.BACK_SPACE+""+Keys.BACK_SPACE);
		inputField.sendKeys(Keys.CONTROL+"A");
		inputField.sendKeys(Keys.TAB);
		System.out.println(inputField.getAttribute("value"));
		
		driver.findElement(By.id("submitButton")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.id("output")).getText());
		
		Thread.sleep(2000);
		driver.quit();
	}
}
