package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMBooking {
	
	WebDriver driver;
	
	@FindBy (id = "first_name")
	private WebElement f_name;
	
	@FindBy (id = "last_name")
	private WebElement l_name;
	
	@FindBy (id = "address")
	private WebElement address;
	
	@FindBy (id = "cc_num")
	private WebElement cc_num;
	
	@FindBy (id = "cc_type")
	private WebElement cc_type;
	
	@FindBy (id = "cc_exp_month")
	private WebElement cc_month;
	
	@FindBy (id = "cc_exp_year")
	private WebElement cc_year;
	
	@FindBy (id = "cc_cvv")
	private WebElement cc_cvv;
	
	@FindBy (id = "book_now")
	private WebElement book;
	
	public WebElement getF_name() {
		return f_name;
	}

	public WebElement getL_name() {
		return l_name;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCc_num() {
		return cc_num;
	}

	public WebElement getCc_type() {
		return cc_type;
	}

	public WebElement getCc_month() {
		return cc_month;
	}

	public WebElement getCc_year() {
		return cc_year;
	}

	public WebElement getCc_cvv() {
		return cc_cvv;
	}

	public WebElement getBook() {
		return book;
	}

	public POMBooking(WebDriver d)
	{
		
		driver= d;
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	
	
	
	

}
