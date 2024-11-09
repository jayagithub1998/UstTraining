package com.seleniumm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByCSSEg {
	public static void main(String[] args) throws Exception {
		//set chrome driver path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver-win32\\chromedriver.exe");
		
		//create an instance of chrome driver
		WebDriver driver = new ChromeDriver();
		
		//load webpage under test
		driver.get("file:///C:\\Users\\Administrator\\eclipse-workspace\\com.seleniumm_30102024\\src\\main\\resources\\LocateByCSSEg.html");
		Thread.sleep(2000);
		
		//---------------cssSelector using class name - prefix it with dot(.)
/*		WebElement element=driver.findElement(By.cssSelector(".input-field"));
		element.sendKeys("some text");
		Thread.sleep(2000);
		System.out.println(element.getAttribute("value"));
	*/	
		//---------------cssSelector using id - prefix it with #
	/*	WebElement element=driver.findElement(By.cssSelector("#some-id"));
	//	WebElement element=driver.findElement(By.cssSelector("input#some-id"));
		element.sendKeys("some text");
		Thread.sleep(2000);
		System.out.println(element.getAttribute("value"));
	*/
		
		//----------------css selector using attribute
	/*	WebElement element=driver.findElement(By.cssSelector("input[type='password']"));
		element.sendKeys("some text");
		Thread.sleep(2000);
		System.out.println(element.getAttribute("value"));
		*/
		
		//-----------------css selector using parent child elements
		WebElement element=driver.findElement(By.cssSelector("form input"));
		element.sendKeys("some text");
		Thread.sleep(2000);
		System.out.println(element.getAttribute("value"));
		
		//--------using multiple css selectors - OR Condition(,)
		List<WebElement> elements = driver.findElements(By.cssSelector("input#some-id, .input-field"));
	//	elements.stream().forEach((e)->{System.out.println("-->"+e.getAttribute("type"));});
		elements.forEach((e)->{System.out.println("-->"+e.getAttribute("type"));});
		
		//using multiple css selectors - AND condition
		WebElement elementa =driver.findElement(By.cssSelector("input#some-id.input-field"));
		System.out.println(elementa.getTagName()+"--"+elementa.getAttribute("type"));
		
		
		
		driver.quit();
	}
}
