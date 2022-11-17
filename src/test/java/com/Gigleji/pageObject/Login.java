package com.Gigleji.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	WebDriver ldriver;
	
	 public Login(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements( rdriver, this);
		
	}
	@FindBy( name="email")
	@CacheLookup
	WebElement Email;
	
	@FindBy( name="password")
	@CacheLookup
	WebElement password;

	@FindBy( xpath="/html/body/div/div[1]/div/div[2]/div/div[2]/div[2]/form/div/div[4]/button")
	@CacheLookup 
	WebElement submit;
	
	
	public void setEmail(String email)
	{
		Email.sendKeys(email);
		
	}
	
	public void setPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void clicksubmit()
	{
		submit.submit();
	}
	}
	 
	

	

