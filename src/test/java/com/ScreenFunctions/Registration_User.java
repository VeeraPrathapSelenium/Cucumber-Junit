package com.ScreenFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.GenericFunctions.GenericFunctions;
import com.thoughtworks.selenium.Wait;

public class Registration_User extends GenericFunctions{
	
	@FindBy(how=How.XPATH,using="//input[@id='email_create']")
	public static WebElement Edi_Registration_Email;
	
	
	@FindBy(how=How.XPATH,using="//button[@id='SubmitCreate']")
	public static WebElement Btn_Registration_Submit;
	
	@FindBy(how=How.XPATH,using="//li[text()='Invalid email address.']")
	public static WebElement Txt_Registration_ErrorMessage;
	
	@FindBy(how=How.XPATH,using="//li[contains(text(),'already been registered')]")
	public static WebElement Txt_Registration_Exist_ErrorMessage;
	
	public static boolean verify_Email_Exist(String email)
	{
		boolean status=true;
		
		waitForElement(Edi_Registration_Email);
		
		status=click_SendData(Edi_Registration_Email, email);
		
		if(status)
		{
			System.out.println("Email id is entered sucessfully");
			logEvent("pass", "Email id is entered sucessfully");
			
			status=hover_Click(Btn_Registration_Submit);
			
			if(status)
			{
				System.out.println("Create Account button is clicked sucessfully");
				logEvent("pass", "Create Account button is clicked sucessfully");
				
				try
				{
					if(Txt_Registration_ErrorMessage.isDisplayed())
					{
						System.out.println("Email id is invalid");
						
					}
				}catch(Exception e)
				{
					System.out.println("Email id is not invalid");
					
					try
					{
			String errmsg="An account using this email address has already been registered. Please enter a valid password or request a new one. ";			
//new WebDriverWait(driver, 35).until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@id='create_account_error']/ol/li"), errmsg));
	
for(int i=0;i<10;i++)
{
	try
	{
		System.out.println("Wait executing........"+i);
		if(driver.findElement(By.xpath("//div[@id='create_account_error']/ol/li")).isDisplayed())
		{
			System.out.println("Email is is already exist");
			break;
		}
	}
	catch(Exception r)
	{
		status=false;
		Thread.sleep(1000);
	}
}

if(! status)
{
	System.out.println("Email id is not  exist");
}





					
					}catch(Exception e1)
					{
						System.out.println("Email id is not  exist");
						status=false;
					}
					
					
				}
				
				
			}
			else
			{
				System.out.println("Create Account button is clicked sucessfully");
				logEvent("fail", "Create Account button is clicked sucessfully");
			}
			
		}
		else
		{
			System.out.println("Email id is not entered sucessfully");
			logEvent("fail", "Email id is not entered sucessfully");
		}
		
		
		return status;
		
		
	}

}
