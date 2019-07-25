package common;

import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase extends ObjectRepository{
	
	protected WebDriver driver;
	private WebDriverWait wait;
	
	protected PageBase() {
		if (TestBase.driver != null) {
			this.driver = TestBase.driver;
		} else {
			//Write the logic to fail the test case as the driver is not initialized 
		}
		wait = new WebDriverWait(driver, Constants.DEFAULT_PAGEELEMENT_TIMEOUT_SECOND);
	}
	
	public PageBase(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Constants.DEFAULT_PAGEELEMENT_TIMEOUT_SECOND);
	}

	
	public void waitForPageLoad() {
		wait.until(new Function<WebDriver, Boolean>() {
			public Boolean apply(WebDriver driver) {
				return String.valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState"))
						.equals("complete");
			}
		});
	}
	
	public WebElement waitForElementVisibleBy(By by, int timeoutSecond) {
		WebDriverWait wait = new WebDriverWait(driver, timeoutSecond);
		try {
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			return element;
		} catch (Exception e) {
			//can modify the logic to fail the test case if the element is not visible
			return null;
		}
	}
	
}
