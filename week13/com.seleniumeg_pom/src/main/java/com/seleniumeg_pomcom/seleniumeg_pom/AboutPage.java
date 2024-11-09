package com.seleniumeg_pomcom.seleniumeg_pom;

import org.openqa.selenium.*;

public class AboutPage {
	private WebDriver driver;
	private By  homeLink=By.id("homeLink");
	private By  contactLink=By.id("contactLink");
	//constructor
	public AboutPage(WebDriver driver) {
		System.out.println("Displaying about page "+driver.getTitle());
		this.driver=driver;
	}
	public HomePage gotoHomePage() {
		WebElement homeLinkElement=driver.findElement(homeLink);
		homeLinkElement.click();
		return new HomePage(driver);
	}

	public ContactPage gotoContactPage() {
		WebElement contactLinkElement=driver.findElement(contactLink);
		contactLinkElement.click();
		return new ContactPage(driver);
	}
}
