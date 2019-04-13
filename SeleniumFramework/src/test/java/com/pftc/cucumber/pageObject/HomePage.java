package com.pftc.cucumber.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
		
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	
	

	@FindBy(xpath="//*[@id='contact-link']/a")
	public WebElement contactUS;
	
	@FindBy(linkText="Sign In")
	public WebElement signInButton;
	
	
	
	
	public void getTitleofCurrentPageTitle(){
		
		System.out.println("Current Page Title: "+driver.getTitle()+"\n"+"Current Page URL: " +driver.getCurrentUrl());
	}
	
	
	
	public void clickOnContactUsLink(){
	
		if(contactUS.isDisplayed()){
			System.out.println("Element is Visible");
		}else{
			System.out.println("Element is not Visible");
		}
		
		contactUS.click();	
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
