package com.seleniumm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByTagEg {public static void main(String[] args) throws Exception {
	//set chrome driver path
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver-win32\\chromedriver.exe");
	
	//create an instance of chrome driver
	WebDriver driver = new ChromeDriver();
	
	//load webpage under test
	driver.get("file:///C:\\Users\\Administrator\\eclipse-workspace\\com.seleniumm_30102024\\src\\main\\resources\\LocateByNameEg.html");
	Thread.sleep(2000);
	
	//locate element by name
	WebElement element=driver.findElement(By.tagName("input"));

	element.sendKeys("some text");
	Thread.sleep(2000);
	System.out.println(element.getAttribute("name"));
	driver.quit();
	
}

}
