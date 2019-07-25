package env;



import org.junit.runner.RunWith;

import common.Constants;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features=Constants.RESOURCE_DIR+"/features/login.feature",
		glue= {"userStepDefintions"},
		plugin={"pretty","html:target/cucumber-html-report","json:cucumber.json"}
		)

public class RunCukeTest {

}
