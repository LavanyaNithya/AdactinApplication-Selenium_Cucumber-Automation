package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMSearch {
	
	private WebDriver driver;
	
	@FindBy (id = "location")
	private WebElement location;
	
	@FindBy (id = "hotels")
	private WebElement hotel;
	
	@FindBy (id = "room_type")
	private WebElement room_type;
	
	@FindBy (id = "room_nos")
	private WebElement room_no;
	
	@FindBy (id = "datepick_in")
	private WebElement check_in;
	
	@FindBy (id = "datepick_out")
	private WebElement check_out;
	
	@FindBy (id = "adult_room")
	private WebElement adult;
	
	@FindBy (id = "child_room")
	private WebElement child;
	
	@FindBy (id = "Submit")
	private WebElement search;
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom_type() {
		return room_type;
	}

	public WebElement getRoom_no() {
		return room_no;
	}

	public WebElement getCheck_in() {
		return check_in;
	}

	public WebElement getCheck_out() {
		return check_out;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSearch() {
		return search;
	}
	
	public POMSearch(WebDriver d)
	{
		driver = d;
		PageFactory.initElements(driver, this);
	}

	
	

}
