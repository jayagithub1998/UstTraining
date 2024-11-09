package com.seleniumm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByTagMultipleEg {
	public static void main(String[] args) throws Exception {
	//set chrome driver path
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver-win32\\chromedriver.exe");
	
	//create an instance of chrome driver
	WebDriver driver = new ChromeDriver();
	
	//load webpage under test
	driver.get("file:///C:\\Users\\Administrator\\eclipse-workspace\\com.seleniumm_30102024\\src\\main\\resources\\LocateByNameEg.html");
	Thread.sleep(2000);
	
	//locate element by name
	List<WebElement> elements=driver.findElements(By.tagName("input"));
	for(WebElement e :elements){
		e.sendKeys("some text");
		System.out.println(e.getAttribute("name"));
		
	}

	Thread.sleep(2000);
	driver.quit();
	
}

}
