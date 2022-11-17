package com.Gigleji.testCase;



import org.testng.Assert;

import com.Gigleji.pageObject.Login;

public class Tc_test01 extends Baseclass{

	public void logintest()
	{
		driver.get(baseurl);
		Login l=new Login(driver);
		l.setEmail(Email);
		l.setPassword(password);
		
		l.clicksubmit();
		if(driver.getTitle().equals("gigleji"))
				{
Assert.assertTrue(true);
				}
		else
		{
			Assert.assertTrue(false);
		}
	}
}

