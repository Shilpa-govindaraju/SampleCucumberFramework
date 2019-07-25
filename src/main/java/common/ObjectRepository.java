package common;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

class ObjectRepository {
	
	public class CommonRepo{
		
	}
	
	public class LoginPageRepo{
		@FindBy(name="email")
		public WebElement userName_TxtField;
		
		@FindBy(name="password")
		public WebElement password_TxtField;
		
		@FindBy(xpath="//a[contains(text(),'Login')]")
		public WebElement login_Button;
		
		@FindBy(xpath="//a[contains(text(),'Forgot your password?')]")
		public WebElement forgotPassword;
	}
	
	public class HomePageRepo{
		@FindBy(id="probesTab")
		public WebElement probes_TabField;
		
	}
	
	public class ProbesPageRepo{
		
		@FindBy(xpath="//div[@class='addButton']/a")
		public WebElement Add_ProbeButton;
		
		@FindBy(name="label")
		public WebElement label_tTxtField;
		
		@FindBy(id="protocol_http")
		public WebElement httpProtocol_RadioButton;
		
		@FindBy(id="method_get")
		public WebElement methodGet_RadioButton;
		
		@FindBy(id="url")
		public WebElement url_TxtBox;
		
		@FindBy(xpath="//label[contains(text(),'USA East')]")
		public WebElement station_selection;
		
		@FindBy(xpath="//span[@class='buttons']/a[contains(text(),'Save')]")
		public WebElement save_button;
		
		@FindBy(xpath="//span[@class='buttons']/a[contains(text(),'Cancel')]")
		public WebElement cancel_button;
		
		
	}

}
