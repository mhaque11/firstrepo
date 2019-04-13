package com.pftc.cucumber.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogInPage {

	
	public static WebElement firstname(WebDriver driver){
		return driver.findElement(By.id("u_0_c"));
	}
	
	public static WebElement lastname(WebDriver driver){
		return driver.findElement(By.name("lastname"));
	}
	
	public static WebElement email(WebDriver driver){
		return driver.findElement(By.xpath("//*[@id='u_0_h']"));
	}
	
	public static Select monthselect(WebDriver driver){
		Select month = new Select(driver.findElement(By.id("month")));
		return month;	
	}
	
	
	
	
	
	
	
}
