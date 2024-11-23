package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMLogin {
	
	WebDriver driver;
	
	@FindBy (id = "username")                  //setter
	private WebElement username;
	
	@FindBy (id = "password")
	private WebElement password;
	
	@FindBy (id = "login")
	private WebElement login;

	public WebElement getUsername() {         //getter methods
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	
	public POMLogin(WebDriver d)         //Constructor to connect driver to the webpage
	{
		driver  = d;
		PageFactory.initElements(driver, this);
		
	}

	}
