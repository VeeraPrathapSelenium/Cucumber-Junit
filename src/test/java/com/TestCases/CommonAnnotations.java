package com.TestCases;

import com.GenericFunctions.GenericFunctions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.runtime.ScenarioImpl;

public class CommonAnnotations extends GenericFunctions {
	
	
	@Before
	
	public static void startExecution(Scenario scenario)
	{
		System.out.println(scenario.getName());
		
		intializeReports(scenario.getName());
		
		startTest(scenario.getName());
		
	}
	
	@After
	public static void endExecution() {
		closeTest();
		
		
	}

}
