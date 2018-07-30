package TestRunner;
 
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Stash\\Online\\src\\test\\resources\\FunctionalTesting"
		,glue={"Stepdefination"}
		)
 
public class Runner {
 
}