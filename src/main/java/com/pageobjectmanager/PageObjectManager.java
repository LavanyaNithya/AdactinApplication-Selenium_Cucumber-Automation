package com.pageobjectmanager;

import org.openqa.selenium.WebDriver;

import com.pageobjectmodel.POMBooking;
import com.pageobjectmodel.POMContinue;
import com.pageobjectmodel.POMLogin;
import com.pageobjectmodel.POMSearch;



public class PageObjectManager {
	
	WebDriver driver;
	POMLogin pom1;
	POMSearch pom2;
	POMContinue pom3;
	POMBooking pom4;
	
	public POMLogin getPOMLogin()
	{
		if(pom1 == null)                       //To create new object for the first time only if it is null
		{
			pom1 = new POMLogin(driver);       
		
		}
		return pom1;                          //else return the already created object
		
	}
	public POMSearch getPOMSearch()
	{
		if(pom2 == null)
		{
			pom2 = new POMSearch(driver);
		}
		return pom2;
		
	}
	
	public POMContinue getPOMContinue()
	{
		if(pom3 == null)
		{
			pom3 = new POMContinue(driver);
		}
		return pom3;
		
	}
	
	public POMBooking getPOMBooking()
	{
		if(pom4 == null)
		{
			pom4 = new POMBooking(driver);
		}
		return pom4;
		
	}
	
	
	
	public PageObjectManager(WebDriver d)
	{
		driver = d;
	
	}
	
}
