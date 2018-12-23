package com.syntax.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/features/KPI.feature" }, glue = {
		"com/syntax/stepDefinitions" }, plugin = { "pretty",
				"html:target/cucumber-deafult-reports" }, dryRun = false, tags = { "@Login" })

public class TestRunner {

}
