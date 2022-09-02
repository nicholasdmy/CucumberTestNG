package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/firstTest.feature",
        glue = {"StepsDefinitions"}
)

public class Run extends AbstractTestNGCucumberTests{
}
