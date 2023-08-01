package com.example.RestSerenityCucumber.runner;
import org.junit.runner.RunWith;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin =  {"pretty"}, features = "src/test/resources/features/employeeDetails.feature", glue = {"com.example.RestSerenityCucumber"})

public class SerenityAPITestRunner {
}
