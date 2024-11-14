package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = {"D:\\STS\\Cucumber_TestNG_Facebook\\Files\\login.feature"}, glue="steps")
public class TestRunner extends AbstractTestNGCucumberTests{

}
