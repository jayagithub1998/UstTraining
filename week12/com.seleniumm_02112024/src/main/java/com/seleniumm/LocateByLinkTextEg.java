package com.seleniumm;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocateByLinkTextEg {
	public static void main(String[] args) throws Exception {
		//set chrome driver path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver-win32\\chromedriver.exe");
		
		//create an instance of chrome driver
		WebDriver driver = new ChromeDriver();
		
		//load webpage under test
		driver.get("file:///C:\\Users\\Administrator\\eclipse-workspace\\com.seleniumm_30102024\\src\\main\\resources\\LocateByLinkTextEg.html");
		
		//-----wait until webpage loaded successfully
		//create WebDriverWait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		File screenshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshot, new File("./screenshot1.png"));
		
		//locate username, only after it appeared in 
		//WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		WebElement link1=driver.findElement(By.linkText("Visit Example"));
		link1.click();
		
		Thread.sleep(1000);
		File screenshot2 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshot2, new File("./screenshot2.png"));
		
		System.out.println("Title : "+driver.getTitle());
		
		//Partial link
		WebElement infoLink=driver.findElement(By.partialLinkText("information"));
		infoLink.click();
		
		Thread.sleep(1000);
		File screenshot3 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshot3, new File("./screenshot3.png"));
		
		System.out.println("Info page Title : "+driver.getTitle());
		
		
		
		Thread.sleep(1000);
		driver.quit();
	}
}
