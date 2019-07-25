package pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import common.PageBase;

public class HomePage extends PageBase{
	HomePageRepo repo;
	public HomePage(){
		repo = new HomePageRepo();
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), repo);
	}
	
	public void probesTab(){
		repo.probes_TabField.click();
		waitForPageLoad();
		
	}

}
