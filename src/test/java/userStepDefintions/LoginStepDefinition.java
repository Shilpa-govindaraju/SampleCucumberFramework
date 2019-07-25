package userStepDefintions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.LoginPage;
import common.Constants;
import common.PageBase;
import common.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class LoginStepDefinition extends TestBase{

	@Given("^User is on Login Page$")
	public void user_is_on_Login_Page(){
		driver.get(Constants.url);
	}

	@When("^Title of login page is \"([^\"]*)\"$")
	public void title_of_login_page_is_copperegg(String loginPageTitle){
		String title = driver.getTitle();
		new PageBase(driver).waitForPageLoad();
		Assert.assertTrue("Login page is displayed", title.equals(loginPageTitle));
	}

	@And("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String userName, String password){
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@Then("^Click on Login Button$")
	public void click_on_Login_Button() throws InterruptedException{
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		Thread.sleep(3);
	}
	
	@Then("^User is on home page$")
	public void User_is_on_home_page(){
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(text(),'Logout')]"))));
		Assert.assertTrue("Logout button is enabled",driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).isDisplayed());
		
	}
}
