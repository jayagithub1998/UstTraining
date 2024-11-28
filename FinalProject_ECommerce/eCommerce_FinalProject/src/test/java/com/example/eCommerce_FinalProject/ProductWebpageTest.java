package com.example.eCommerce_FinalProject;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductWebpageTest {
	private  static WebDriver driver;
	private static WebDriverWait wait;
	
	@BeforeAll
	public static void setUp() {
		//set driver property
		//load driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver-win32\\chromedriver.exe");
		
		//create an instance of chrome driver
		driver = new ChromeDriver();
		
		//wait
		wait =new WebDriverWait(driver,Duration.ofSeconds(10));
		
		ExcelReadUtils.init();
		
	}

	@Test
	public void testProduct() throws InterruptedException {
		//Open the HTML page (replace with actual URL)
		driver.get("File:///C:\\Users\\Administrator\\Downloads\\eCommerce_FinalProject\\src\\main\\resources\\Product.html");
		
		//create HomePage
		ProductPage productPage = new ProductPage(driver);

		
		//wait until About page is loaded
		wait.until(ExpectedConditions.titleContains("Product"));
		Thread.sleep(2000);
		//assert with page title
		assertTrue(driver.getTitle().contains("Product"));
		
		productPage.InputSearchProduct(driver, "Apple");
		Thread.sleep(2000);
		
		productPage.seachProduct(driver);
		Thread.sleep(2000);
		
		String prodResult = productPage.verifyProduct(driver);
		System.out.println("Result "+prodResult);
		assertTrue(prodResult.contains("Apple"));

	}
	
	@Test
	public void testEmptyProduct() throws InterruptedException {
		//Open the HTML page (replace with actual URL)
		driver.get("File:///C:\\Users\\Administrator\\Downloads\\eCommerce_FinalProject\\src\\main\\resources\\Product.html");
		
		//create HomePage
		ProductPage productPage = new ProductPage(driver);

		
		//wait until About page is loaded
		wait.until(ExpectedConditions.titleContains("Product"));
		Thread.sleep(2000);
		//assert with page title
		assertTrue(driver.getTitle().contains("Product"));
		
		productPage.InputSearchProduct(driver, "");
		Thread.sleep(2000);
		
		productPage.seachProduct(driver);
		Thread.sleep(2000);
		
		String prodResult = productPage.verifyProduct(driver);
		System.out.println("Result "+prodResult);
		assertTrue(prodResult.contains("Please enter a search term."));

	}
	
	@Test
	public void testInvalidProduct() throws InterruptedException {
		//Open the HTML page (replace with actual URL)
		driver.get("File:///C:\\Users\\Administrator\\Downloads\\eCommerce_FinalProject\\src\\main\\resources\\Product.html");
		
		//create HomePage
		ProductPage productPage = new ProductPage(driver);

		
		//wait until About page is loaded
		wait.until(ExpectedConditions.titleContains("Product"));
		Thread.sleep(2000);
		//assert with page title
		assertTrue(driver.getTitle().contains("Product"));
		
		productPage.InputSearchProduct(driver, "abc");
		Thread.sleep(2000);
		
		productPage.seachProduct(driver);
		Thread.sleep(2000);
		
		String prodResult = productPage.verifyProduct(driver);
		System.out.println("Result "+prodResult);
		assertTrue(prodResult.contains("No products found."));

	}
	
	@AfterAll
	public static void tearDown() {
		if(driver !=null) {
			driver.quit();
		}
	}
}
