package com.somefeauture.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/somefeauture/features",
        glue = {"com.somefeauture.stepdefinitions"})
public class LoginRunner {
}
