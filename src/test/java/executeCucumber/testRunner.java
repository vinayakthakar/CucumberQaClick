package executeCucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/featureFiles/second.feature",
		glue = {"stepDefinations"}
		)

public class testRunner extends AbstractTestNGCucumberTests {

	
	
	
	
}
