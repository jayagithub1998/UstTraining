package com.seleniumm;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HTMLFormEg {
	public static void main(String[] args) throws Exception {
		//chrome driver path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver-win32\\chromedriver.exe");
		
		//create an instance of chrome driver
		WebDriver driver = new ChromeDriver();
		
		//to locate local file -file:///->right click html file inside resources folder->click on properties->copy the complete path and paste it after file:///
		driver.get("file:///C:\\Users\\Administrator\\eclipse-workspace\\com.seleniumm_30102024\\src\\main\\resources\\HtmlFormEg.html");
		WebElement usernameField = driver.findElement(By.id("username"));
		WebElement maleRadio = driver.findElement(By.id("male"));
		WebElement femaleRadio = driver.findElement(By.id("female"));
		WebElement subCheckbox = driver.findElement(By.id("subscribe"));
		WebElement dropdown = driver.findElement(By.id("dropdown"));
		WebElement submitButton = driver.findElement(By.id("submitBtn"));
		WebElement message = driver.findElement(By.id("message"));

		usernameField.sendKeys("someusername");
		System.out.println("Username entered : "+usernameField.getAttribute("value"));
		
		maleRadio.click();
		String str =maleRadio.isSelected()? "Male" : "Female";
		System.out.println("Radio Selected : "+str);
		
		subCheckbox.click();
		System.out.println("Subscribed :"+subCheckbox.isSelected());
		
		Select dropdownSelect = new Select(dropdown);
		dropdownSelect.selectByVisibleText("Option 2");
		System.out.println("Dropdown selected : "+dropdownSelect.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		
		submitButton.sendKeys(Keys.ENTER);
		System.out.println("Clicked Submit button");
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		driver.quit();
	}
	
}
