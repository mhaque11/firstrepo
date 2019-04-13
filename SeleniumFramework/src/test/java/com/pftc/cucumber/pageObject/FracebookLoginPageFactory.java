package com.pftc.cucumber.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FracebookLoginPageFactory  {

	@FindBy(id="u_0_c")
	public WebElement firstName;
	
	@FindBy(name="u_0_c")
	public WebElement lastName;
	
	
}
