package com.salesforceRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

	features = {"src/test/resources/features/salesForce.feature"},
	glue = {"com.cucumberTests.steps"},
	monochrome= true,
	dryRun= false)
public class SalesforceRunner extends AbstractTestNGCucumberTests{

}