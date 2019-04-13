package com.pftc.cucumber.stepDef;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;












import com.pftc.cucumber.pageObject.BasePage;
import com.pftc.cucumber.pageObject.ContactUs;
import com.pftc.cucumber.pageObject.HomePage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SendEmailStepDef extends BasePage{
	
	
	
	/*  public WebDriver driver; 
	 * public SendEmailStepDef()
	{
    	driver = Hooks.driver;
    	
    	PageFactory.initElements(driver, AutomationHomePage.class);
    }*/
	
	
	
	@Before
	public void openBrowser(){
		BasePage.initBrowser();
	}
	
	@After
	public void teardown(){
		driver.close();
	}
	HomePage homePage;
	ContactUs contactUs;
	
	@Given("User Navigate to My Store Home Page")
	public void user_Navigate_to_My_Store_Home_Page() throws InterruptedException {	
		
		String URL=properties.getProperty("AppUrl");
		driver.get(URL);
		homePage = new HomePage();
		homePage.getTitleofCurrentPageTitle();
		Assert.assertEquals(driver.getTitle(), "My Store");
	}

	@When("User Click on Contact Us Page")
	public void user_Click_on_Contact_Us_Page() {
		
		homePage.clickOnContactUsLink();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Then("User fill Up all the info and Send Email")
	public void user_fill_Up_all_the_info_and_Send_Email() throws InterruptedException {
		contactUs = new ContactUs();
		homePage.getTitleofCurrentPageTitle();
		contactUs.sendAMessage("1", "Bhal Bhal");
	}
	
	
	
	
	
	
	
	
}
