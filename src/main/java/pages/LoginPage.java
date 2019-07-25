package pages;


import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import common.PageBase;

public class LoginPage extends PageBase{
	LoginPageRepo repo;
	public LoginPage(){
		repo = new LoginPageRepo();
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), repo);
	}
	
		
	public HomePage login(String userName,String password){
		repo.userName_TxtField.clear();
		repo.userName_TxtField.sendKeys(userName);
		repo.password_TxtField.sendKeys(password);
		waitForPageLoad();
		repo.login_Button.click();
		return new HomePage();
	}

}
