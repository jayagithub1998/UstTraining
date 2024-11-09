package com.seleniumm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByXPathEg {
	public static void main(String[] args) throws Exception {
		//chrome driver path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver-win32\\chromedriver.exe");
		
		//create an instance of chrome driver
		WebDriver driver = new ChromeDriver();
		
		//to locate local file -file:///->right click html file inside resources folder->click on properties->copy the complete path and paste it after file:///
		driver.get("file:///C:\\Users\\Administrator\\eclipse-workspace\\com.seleniumm_30102024\\src\\main\\resources\\LocateByIdEg3.html");
		
		Thread.sleep(2000);
		
		//xpath starts with double slash
		WebElement element =driver.findElement(By.xpath("//input[@id='username']"));
		element.sendKeys("myusername");
		WebElement element2 =driver.findElement(By.xpath("//input[@id='password']"));
		element2.sendKeys("mypassword");
		Thread.sleep(2000);
		System.out.println(element.getAttribute("value"));
		
		//WebElement elementb =driver.findElement(By.xpath("//button[text()='Login']"));
		//WebElement elementb =driver.findElement(By.xpath("//button[contains(text(),'in')]"));
		WebElement elementb =driver.findElement(By.xpath("//button[starts-with(text(),'Log')]"));
		
		
		elementb.click();
		Thread.sleep(2000);
		driver.quit();
	}

}
