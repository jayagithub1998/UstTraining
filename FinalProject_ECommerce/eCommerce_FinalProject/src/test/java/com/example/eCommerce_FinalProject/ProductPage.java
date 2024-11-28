package com.example.eCommerce_FinalProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
	private WebDriver driver;
	private By searchInput =By.id("searchInput");
	private By searchButton =By.tagName("button");
	private By searchResult =By.id("results");
	
	public ProductPage(WebDriver driver) {
		System.out.println("Displaying Product page "+driver.getTitle());
		this.driver=driver;
	}
	
	public void InputSearchProduct(WebDriver driver, String product) {
		WebElement searchProd =driver.findElement(searchInput);
		searchProd.sendKeys(product);
	}
	
	public void seachProduct(WebDriver driver) {
		driver.findElement(searchButton).click();
	}
	
	public String verifyProduct(WebDriver driver) {
		String prodResult= driver.findElement(searchResult).getText();
		return prodResult;
	}

}
