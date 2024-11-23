package com.stepdefinition;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.baseclass.BaseClass;
import com.pageobjectmanager.PageObjectManager;
import com.runner.AdactinTest;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestcaseSteps extends BaseClass{
	
    WebDriver driver = AdactinTest.driver;
	
	PageObjectManager pom = new PageObjectManager(driver);
	
	String exp_uname;
	
	public String excludehello(String uname)
	{
		
		String act_uname="";
		
		for(int i=0;i<uname.length();i++) {
		
			if(i>=6 && (uname.charAt(i)!='!'))
			{
				act_uname = act_uname + uname.charAt(i);    //retrieving only username excluding "hello"
				
			}
			
	    }
		
		return act_uname;
		
  }
	
	
	@When("User Click The Search Button And System Should Report Error In CheckIn Date and CheckOut Date")
	public void userClickTheSearchButtonAndSystemShouldReportErrorInCheckInDateAndCheckOutDate() {
	    
		clickelement(pom.getPOMSearch().getSearch());
		
		String checkin = driver.findElement(By.id("checkin_span")).getText();
		Assert.assertEquals(checkin,"Check-In Date shall be before than Check-Out Date");
		
		String checkout = driver.findElement(By.id("checkout_span")).getText();
		Assert.assertEquals(checkout, "Check-Out Date shall be after than Check-In Date");
		
	}
	
	
	@Then("User click the search button and verify the location in select hotel page")
	public void userClickTheSearchButtonAndVerifyTheLocationInSelectHotelPage() {
		
		WebElement l1 = pom.getPOMSearch().getLocation();
	    String exp_location = l1.getAttribute("value");
		//System.out.println(exp_location);
	    
	    clickelement(pom.getPOMSearch().getSearch());
	    
	    WebElement l2 = driver.findElement(By.id("location_0"));
	    String act_location = l2.getAttribute("value");
	    //System.out.println(act_location);
	    
	    Assert.assertEquals(act_location, exp_location);
	    
	}

	@Then("user click the search button and verify checkin and checkout dates")
	public void userClickTheSearchButtonAndVerifyCheckinAndCheckoutDates() {
	    
		WebElement in = pom.getPOMSearch().getCheck_in();
		String exp_checkin = in.getAttribute("value");
		
		WebElement out = pom.getPOMSearch().getCheck_out();
		String exp_checkout = out.getAttribute("value");
		
		clickelement(pom.getPOMSearch().getSearch());
		
		WebElement inn = driver.findElement(By.id("arr_date_0"));
        String act_checkin = inn.getAttribute("value");
        
        WebElement outt = driver.findElement(By.id("dep_date_0"));
        String act_checkout = outt.getAttribute("value");
        
        Assert.assertEquals(act_checkin, exp_checkin);
        
        Assert.assertEquals(act_checkout, exp_checkout);
		
	}
	
	
	@Then("verify the totalprice")
	public void verifyTheTotalprice() {
	    
		int actualprice,diff;
		String sign;
		
		String price_night = driver.findElement(By.id("price_night_dis")).getAttribute("value");
		String room_num = driver.findElement(By.id("room_num_dis")).getAttribute("value");
		String days = driver.findElement(By.id("total_days_dis")).getAttribute("value");
		
		String pn = price_night.replaceAll("[^0-9]", "");     //extracting only digits
		int price = Integer.parseInt(pn);                     //converting string to integer
		
	    String r = room_num.replaceAll("[^0-9]", "");
	    int room = Integer.parseInt(r);
	    
	    String d = days.replaceAll("[^0-9]", "");
	    int day = Integer.parseInt(d);
	    
	    actualprice = price*room*day;
	    // System.out.println(actualprice);
	    
	    
	    String t_price = driver.findElement(By.id("total_price_dis")).getAttribute("value");
	    String tprice = t_price.replaceAll("[^0-9]", "");
	    int expprice = Integer.parseInt(tprice);
	    
	    if(actualprice > expprice)
	    {
	        sign = "less";
	    	diff = actualprice-expprice;
	    }
	    else
	    {
	    	sign = "more";
	        diff = expprice-actualprice;
	    }
	    
	    Assert.assertEquals(expprice, actualprice,"The total price calculated is "+sign+" by  $"+diff);
	    
   }


@Then("User click the logout button and it log outs from the page")
public void userClickTheLogoutButtonAndItLogOutsFromThePage() {
     
	     driver.findElement(By.xpath("//a[text()='Logout']")).click();
	     String msg = driver.findElement(By.className("reg_success")).getText();
         Assert.assertEquals(msg, "You have successfully logged out. Click here to login again");

}


@Then("Check if the fields are editable")
public void checkIfTheFieldsAreEditable() {
    
	WebElement hotel = driver.findElement(By.id("hotel_name_0"));
	hotel.isEnabled();
	Assert.assertTrue(hotel.isEnabled());                    //isEnabled() is used to check whether the fields are editable
	                                                         //assertTrue checks if the condition returns true
}





@Then("To verify autofill checkin and checkout dates are correct")
public void toVerifyAutofillCheckinAndCheckoutDatesAreCorrect() {
    
	clickelement(pom.getPOMLogin().getLogin());
	
	String act_checkin = pom.getPOMSearch().getCheck_in().getAttribute("value");
	
	String act_checkout = pom.getPOMSearch().getCheck_out().getAttribute("value");
	
	LocalDateTime d = LocalDateTime.now();         //method to return the current date
	 
	DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	 
	String exp_checkin = df.format(d);
	
	String exp_checkout = df.format(d.plusDays(1));
	
	Assert.assertEquals(act_checkin, exp_checkin);
	
	Assert.assertEquals(act_checkout, exp_checkout);
	
}

@Then("User clicks login button and check correct username is displayed in search hotel page")
public void userClicksLoginButtonAndCheckCorrectUsernameIsDisplayedInSearchHotelPage() {
       
	exp_uname = driver.findElement(By.id("username")).getAttribute("value");
	
	clickelement(pom.getPOMLogin().getLogin());
	
	String uname = driver.findElement(By.id("username_show")).getAttribute("value");
	
	String act_uname = excludehello(uname);
	
	Assert.assertEquals(act_uname, exp_uname);
}



@Then("Check correct username is displayed in select hotel page")
public void checkCorrectUsernameIsDisplayedInSelectHotelPage() {
	
	
	String uname = driver.findElement(By.id("username_show")).getAttribute("value");
	
	String act_uname = excludehello(uname);
	
	Assert.assertEquals(act_uname, exp_uname);
	
	
   
 }

@Then("Check correct username is displayed in book hotel page")
public void checkCorrectUsernameIsDisplayedInBookHotelPage() {
	
    String uname = driver.findElement(By.id("username_show")).getAttribute("value");
	
	String act_uname = excludehello(uname);
	
	Assert.assertEquals(act_uname, exp_uname);
	
    
    
}

@Then("Check correct username is displayed in confirmation page")
public void checkCorrectUsernameIsDisplayedInConfirmationPage() {
    
    String uname = driver.findElement(By.id("username_show")).getAttribute("value");
	
	String act_uname = excludehello(uname);
	
	Assert.assertEquals(act_uname, exp_uname);
	
	
}

@When("User clicks on booked itinerary button")
public void userClicksOnBookedItineraryButton() {
    
  
	driver.findElement(By.xpath("//a[text()='Booked Itinerary']")).click();
    
}

@Then("Check correct username is displayed in booked itinerary page")
public void checkCorrectUsernameIsDisplayedInBookedItineraryPage() {
    
    String uname = driver.findElement(By.id("username_show")).getAttribute("value");
	
	String act_uname = excludehello(uname);
	
	Assert.assertEquals(act_uname, exp_uname);
	
}





}