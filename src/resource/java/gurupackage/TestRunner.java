package gurupackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(features="src/resource/java/login.feature",glue={"gurupackage"},plugin={"html:target"})
@CucumberOptions(features="src/resource/java/addcustomer.feature",glue={"gurupackage"},plugin={"html:target"})
public class TestRunner {


}
