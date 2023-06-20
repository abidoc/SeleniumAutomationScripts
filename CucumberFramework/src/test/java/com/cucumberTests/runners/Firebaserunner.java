package com.cucumberTests.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features ={"src/test/resources/features/Firebase.feature"
		},
glue ={"com.cucumberTests.steps"},
monochrome = true,
dryRun =true,
tags="@add")

public class Firebaserunner extends AbstractTestNGCucumberTests {

}
