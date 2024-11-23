package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMContinue {
	
	private WebDriver driver;
	
	@FindBy (id = "radiobutton_0")
	private WebElement select;
	
	@FindBy (id = "continue")
	private WebElement cont;

	public WebElement getSelect() {
		return select;
	}

	public WebElement getCont() {
		return cont;
	}
	
	public POMContinue(WebDriver d)
	{
		driver = d;
		PageFactory.initElements(driver, this);
		
	}
	
	

}
