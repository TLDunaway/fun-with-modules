package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //path of feature file
        features = "src/test/resources/features/",
        //path of step definition file
        glue = "stepdefinitions"
    )
public class RunEverythingTests {
}

