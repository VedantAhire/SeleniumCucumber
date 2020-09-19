package runner;




import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Vedant\\eclipse-workspace\\SeleniumCucumber1\\src\\main\\java\\Features\\Hooksss.feature", //the path of feature files
glue= {"stepDefinition"},// the path of step Definition file
plugin= {"pretty","html:target/test-output.html", "json:json_output/cucumber.json","junit:junit_output/cucumber.xml"},

monochrome=true, //display the runner output in proper format
stepNotifications=true,
  // display the steps in jUnit
dryRun=false
//tags= "@SmokeTest or ~@Regression" // tags="@SmokeTest and @Regression" (
)

public class TestRunner {

	
	
}
