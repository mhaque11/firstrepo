package com.pftc.cucumber.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactUs extends BasePage {
	
	public ContactUs(){
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	

//	@FindBy(id="id_contact")
//	public Select  subjectHeading;
	
	@FindBy(id="id_contact")
	public WebElement  subjectHeading;

	@FindBy(id="email")
	public WebElement emailAddress;
	
	@FindBy(id="id_order")
	public WebElement orderRef;
	
	
	
	
	public void selectByValue(WebElement element, String value){
		Select obj =new Select(element);
		obj.selectByValue(value);
	}
	

	
	
	public void sendAMessage(String heading, String ref) throws InterruptedException{
		
		selectByValue(subjectHeading,heading);
		
//		Select selectSubjectHeading =new Select(subjectHeading);
//		Thread.sleep(5000);
//		selectSubjectHeading.selectByValue(heading);
		emailAddress.sendKeys(properties.getProperty("Email"));
		orderRef.sendKeys(ref);
		Thread.sleep(5000);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
