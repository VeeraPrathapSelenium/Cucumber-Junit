package com.TestCases;

import com.GenericFunctions.GenericFunctions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class Hooks extends GenericFunctions{

	@Before
	public void launchBrowser()
	{	
			String url="https://www.talentzing.com/";
			launchApplication("chrome",url);
		
	}
	@After
	public void teardown()
	{
		closeBrowser();
	}
	
	
}
