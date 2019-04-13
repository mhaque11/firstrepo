package com.pftc.cucumber.pageObject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BasePage {

	public static WebDriver driver;
	public static Properties properties;

	public BasePage() {

		properties = new Properties();

		try {
			FileInputStream file = new FileInputStream("config.properties");
			properties.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static WebDriver initBrowser() {

		String browser = properties.getProperty("browser");
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"src/test/resources/drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("FF")) {
			System.setProperty("webdriver.firefox.marionette",
					"src/test/resources/drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		} else if (browser.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver",
					"src/test/resources/drivers/IEDriverServer.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}else {
			System.out.println("Sorry your browser can not be found");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts()
				.implicitlyWait(Constants.IMPLICITLY_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts()
				.pageLoadTimeout(Constants.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		return driver;
	}

}
