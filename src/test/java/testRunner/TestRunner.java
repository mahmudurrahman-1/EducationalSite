package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/features/applicationrouting.feature",
        glue = "step_def"
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
