package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage {
	
	private WebDriver driver;

	private By subjectHeading = By.id("id_contact");
	private By email = By.id("email");
	private By orderRef = By.id("id_order");
	private By messageText = By.id("message");
	private By sendButton = By.id("submitMessage");
	private By successMessg = By.cssSelector("div#center_column p");

	public ContactUsPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getContactUsPageTitle() {
		return driver.getTitle();
	}
	
	public void fillContactUsForm(String heading, String emailId, String orderReference, String message) {
		Select select = new Select(driver.findElement(subjectHeading));
		select.selectByVisibleText(heading);
		driver.findElement(email).sendKeys(emailId);
		driver.findElement(orderRef).sendKeys(orderReference);
		driver.findElement(messageText).sendKeys(message);
	}

	public void clickSend() {
		driver.findElement(sendButton).click();
	}
	
	public String getSuccessMessg() {
		return driver.findElement(successMessg).getText();
	}
	
	
	
	

}
