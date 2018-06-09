package com.RunnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)


@CucumberOptions(
		strict = true,
		monochrome = true, 
		features = "Features",
		glue= "com.TestCases"
		
		)


public class Firefox_Runner {

}
