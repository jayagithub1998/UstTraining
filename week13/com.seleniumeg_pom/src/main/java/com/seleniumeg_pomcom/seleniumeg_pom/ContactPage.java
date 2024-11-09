package com.seleniumeg_pomcom.seleniumeg_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactPage {
	private WebDriver driver;

	//create locators
	private By aboutLink = By.id("aboutLink");
	private By homeLink = By.id("homeLink");
	
	//name
	By nameField =By.id("name");
	//email
	By emailField =By.id("email");
	//message
	By messageField =By.id("message");
	//submit
	By submitButton =By.id("submitButton");
	
	By rmessageDiv = By.id("rmessage");

	public ContactPage(WebDriver driver) {
		System.out.println("Displaying Contact Page "+driver.getTitle());
		this.driver=driver;
	}
	//method to perform actions on above webElements

	public AboutPage gotoAboutPage() {
		WebElement aboutLinkElement=driver.findElement(aboutLink);
		aboutLinkElement.click();
		return new AboutPage(driver);
	}

	public HomePage gotoHomePage() {
		WebElement homeLinkElement=driver.findElement(homeLink);
		homeLinkElement.click();
		return new HomePage(driver);
	}
	
	public void fillContactForm(String name,String email,String message){
		driver.findElement(nameField).sendKeys(name);
		driver.findElement(emailField).sendKeys(email);
		driver.findElement(messageField).sendKeys(message);
		driver.findElement(submitButton).click();
	}
	public void checkSubmission() {
		System.out.println("Submitted Text : "+driver.findElement(rmessageDiv).getText());
	}
}
