package com.collinson.BDDTests.TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(tags = "@REST", features = "src/test/java/com/collinson/BDDTests/features", glue = {"com.collinson.BDDTests.StepDefinition"})
public class RunTest
{

}

