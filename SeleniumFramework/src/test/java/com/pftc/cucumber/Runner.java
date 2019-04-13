package com.pftc.cucumber;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		//features = "classpath:features",
		features = "src/test/resources/features", //the path of the feature files
		glue={"com/pftc/cucumber/stepDef"}, //the path of the step definition files
	    plugin= {"pretty","html:html-report", "json:json-report/cucumber.json", "junit:xml-report/cucumber.xml"},
		//dryRun = false,
		//monochrome = true,
		//strict = true
		tags = {"@Smoke"}
		)
public class Runner {

}
