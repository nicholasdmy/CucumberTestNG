package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/features/"},
        glue = {"StepsDefinitions"}
)

public class Run extends AbstractTestNGCucumberTests{
}
