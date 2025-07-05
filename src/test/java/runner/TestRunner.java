package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
    features = "src/test/java/features",
    glue = {"steps"},
    plugin = {"pretty","html:target/cucumber-html-report",
            "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
    	
    monochrome = true,
     tags ="@cucumber"
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
