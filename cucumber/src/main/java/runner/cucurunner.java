package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "features"
		,glue= {"stepDefinations"}
		,//tags= {"@smoke"}
		// - And - , tags ={"@smoke","@regression"}
	 tags ={"@smoke,@regression"}
		,format= {"pretty","html:target/cucumber","json:target/cucumber/report.json"}
		
		)

public class cucurunner {


}
