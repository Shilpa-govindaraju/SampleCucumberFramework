package userStepDefintions;

import org.openqa.selenium.WebDriver;

import common.TestBase;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks{
	protected static WebDriver driver = null;
	
	@Before
	public void beforeScenario(){
		/*
		 * This method is to execute any code before each scenario starts
		*/
		TestBase testBase = new TestBase();
		driver = testBase.driverSetup("chrome");
	}
	
	@After
	public void afterScenario(){
		/*
		 * This method is to execute any code after each scenario completes its steps
		*/
		driver.quit();
	}

}
