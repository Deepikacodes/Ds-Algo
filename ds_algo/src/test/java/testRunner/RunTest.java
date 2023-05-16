package testRunner;

//import org.junit.runner.RunWith;

//import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/Features"}, //location of feature files
                 glue= {"stepDefinitions","appHooks"}, //location of step definition
                 monochrome = true,
                 //dryRun = true,
                 dryRun = false,
                 plugin= {"pretty","html:target/ds-algo/report.html",
                		 "json:target/ds-algo/report.json",
                		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                		 "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
                 //tags= ("@Register or @login") 
                  )

@Test
public class RunTest extends AbstractTestNGCucumberTests{

}
