package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;

public class TestBase {
	
	public static WebDriver driver	=	null;
	
	/*public TestBase(String appBrowser){
		if(appBrowser != null){
			driverSetup(appBrowser);
		}
	}*/
	
	public WebDriver driverSetup(String appBrowser){
		if(appBrowser.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}else if(appBrowser.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver", Constants.RESOURCE_DIR+"/DriverUtilities/IEDriverServer.exe");
			InternetExplorerOptions options = new InternetExplorerOptions();
			options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.IGNORE);
			options.destructivelyEnsureCleanSession();
			options.ignoreZoomSettings();
			options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			driver = new InternetExplorerDriver(options);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}else if(appBrowser.equalsIgnoreCase("chrome")){
			
			System.setProperty("webdriver.chrome.driver", Constants.RESOURCE_DIR+"/DriverUtilities/chromedriver.exe");
			ChromeOptions chromeOpt = new ChromeOptions();
			chromeOpt.addArguments("test-type");
			chromeOpt.addArguments("allow-running-insecure-content");
			chromeOpt.addArguments("--disable-popup-blocking");
			driver = new ChromeDriver(chromeOpt);
			driver.manage().window().maximize();
		}
		return driver;
	}

}
