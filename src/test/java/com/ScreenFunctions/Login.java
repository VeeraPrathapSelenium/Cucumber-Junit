package com.ScreenFunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericFunctions;

public class Login extends GenericFunctions {
	
	@FindBy(how=How.XPATH,using="//a[normalize-space(text())='Sign in']")
	public static WebElement Lnk_Login_Signin;
	
	public static boolean click_Signin() {
		
		boolean status=true;
		
		try
		{
			status=waitForElement(Lnk_Login_Signin);
			
			if(status)
			{
				status=hover_Click(Lnk_Login_Signin);
				
				if(status)
				{
					System.out.println("Signin link is clicked sucessfully");
					logEvent("pass", "Signin link is clicked sucessfully");
				}else
				{
					System.out.println("Signin link is not clicked sucessfully");
					logEvent("fail", "Signin link is not clicked sucessfully");
				}
				
			}
			
		}catch(Exception e)
		{
			System.out.println("Unable to click on the Sign in link because of "+e.getMessage());
			logEvent("fail", "unable to identify the sigin link");
		}
		
		
		
		return status;
	}

	
	
	

}
