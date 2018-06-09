package com.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericFunctions;
import com.ScreenFunctions.Login;
import com.ScreenFunctions.Registration_User;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Tc_01_Signin_Validation extends GenericFunctions{
	
	
	@Given("Launch the ([^\"]*) and with the ([^\"]*) maximize it")

	public static void launchApp(String Browser, String url) {
		
		launchApplication( Browser, url);
		
	}
	
	@Then("click on the signin link")
	public static void click_on_Signin()
	{
		Login lgn=PageFactory.initElements(driver, Login.class);
		
		lgn.click_Signin();
	}
	@And("Enter the ([^\"]*) ID and verify the user is not exist on the database")
	public static void enter_Email(String email)
	{
		Registration_User regusr=PageFactory.initElements(driver, Registration_User.class);
		
		regusr.verify_Email_Exist(email);
	}
	

}
