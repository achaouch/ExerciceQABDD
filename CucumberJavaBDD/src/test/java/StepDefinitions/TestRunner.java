package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/GoogleSearch.feature", 
glue= {"StepDefinitions"},
monochrome= true,
dryRun =false,
plugin = {"pretty", "junit:target/JUnitReports/report.xml",
		"json:target/JSONReports/report.json",
		"html:target/HtmlReports",
		 "io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm" }
		)
public class TestRunner {

}