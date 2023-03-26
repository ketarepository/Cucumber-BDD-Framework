package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\nikun\\OneDrive\\Desktop\\Eclipse IDE\\Cucumber\\src\\test\\java\\feature1\\RememberMe.feature",glue= {"loginstepdef"},
plugin= {"pretty","html:target/HTmlreports"}, monochrome=true, //in monochrome in console output will be more readable
dryRun=true, tags="@regression and not @smoke")  //in dryrun testrunner will check wether in feature file all steps are mapped in step definition or not
//{"pretty","jason:target/HTmlreports.jason"} if we want jason report
// in cucumber options we can write feature file's location and step defintion package name with keyword glue

public class Testrunner {

	
	
}
