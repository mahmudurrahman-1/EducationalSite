package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/featureFiles/applicationrouting.feature",
        glue = "hooks"
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
