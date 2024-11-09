package com.seleniumm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsEg {
	public static void main(String[] args) throws Exception {
		//chrome driver path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver-win32\\chromedriver.exe");
		
		//create an instance of chrome driver
		WebDriver driver = new ChromeDriver();
		
		//to locate local file -file:///->right click html file inside resources folder->click on properties->copy the complete path and paste it after file:///
		driver.get("file:///C:\\Users\\Administrator\\eclipse-workspace\\com.seleniumm_30102024\\src\\main\\resources\\MouseActionsEg.html");
		
		Actions actions = new Actions(driver);
		
		//perform click
		WebElement clickButton = driver.findElement(By.id("clickButton"));
		actions.click(clickButton).perform();
		//clickButton.click();
		Thread.sleep(2000);
		
		//on mouse over
		WebElement hoverDiv = driver.findElement(By.id("hoverDiv"));
		actions.moveToElement(hoverDiv).perform();
		Thread.sleep(2000);
		
		//perform double click
		WebElement doubleClickBtton = driver.findElement(By.id("doubleClickButton"));
		actions.doubleClick(doubleClickBtton).perform();
		Thread.sleep(2000);
		
		//right click -- contextClick -->anywhere in webpage
		actions.contextClick(clickButton).perform();
		Thread.sleep(2000);
		
		//drag and drop
		WebElement dragDiv = driver.findElement(By.id("dragDiv"));
		WebElement dropArea = driver.findElement(By.id("dropArea"));
		//actions.dragAndDrop(dragDiv, dropArea).perform();
		actions.clickAndHold(dragDiv)
		.moveToElement(dropArea)
		.release()
		.perform();
		Thread.sleep(2000);
		
		
		driver.quit();
	}
}
