package userStepDefintions;

import pages.LoginPage;
import common.TestBase;
import cucumber.api.java.en.Given;

public class CreateProbeStepDefinition extends TestBase{

	@Given("^User is able to login with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_is_able_to_login_with_and(String userName, String password){
		new LoginPage().login(userName, password);
	}
}
