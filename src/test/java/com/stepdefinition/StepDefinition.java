package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.baseclass.BaseClass;
import com.datareader.DataReaderManager;
import com.pageobjectmanager.PageObjectManager;
import com.runner.AdactinTest;
import com.values.Adultvalues;
import com.values.CC_month;
import com.values.CC_type;
import com.values.CC_year;
import com.values.Childvalues;
import com.values.Hotelvalues;
import com.values.Locationvalues;
import com.values.Roomnum;
import com.values.Roomtype;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinition extends BaseClass{
	
	WebDriver driver = AdactinTest.driver;
	
	PageObjectManager pom = new PageObjectManager(driver);
	
	
	//Login Page
	
	
	@Given("^Launch The URL$")
	public void launchTheURL() throws Throwable {
		
		//urllaunch("https://adactinhotelapp.com/");
	    String URL = DataReaderManager.getInstanceDRM().getInstanceDR().getPropUrl();
	    urllaunch(URL);
	    Thread.sleep(200);
	}
	
	@Given("^Maximize The Window$")
	public void maximizeTheWindow() throws Throwable {
	    
		maximize();
	
	}

	@When("^Enter The Username In Username Field$")
	public void enterTheUsernameInUsernameField() throws Throwable {
		
		//sendvalues(pom.getPOMLogin().getUsername(),"NLavanya");
	    String username = DataReaderManager.getInstanceDRM().getInstanceDR().getPropUsername();
	    sendvalues(pom.getPOMLogin().getUsername(),username);
	    Thread.sleep(200);
	}

	@When("^Enter The Password In Password Field$")
	public void enterThePasswordInPasswordField() throws Throwable {
		
		//sendvalues(pom.getPOMLogin().getPassword(),"$Lavanya11");
		String password = DataReaderManager.getInstanceDRM().getInstanceDR().getPropPassword();
		sendvalues(pom.getPOMLogin().getPassword(),password);
		Thread.sleep(200);
	    
	}

	@Then("^User Click The Login Button And It Will Navigate To Search Page$")
	public void userClickTheLoginButtonAndItWillNavigateToSearchPage() throws Throwable {
	    
		clickelement(pom.getPOMLogin().getLogin());
		Thread.sleep(200);
		
	}
	
	//Login Fail
	
	@When("^User Click The Login Button And Login Should Fail$")
	public void user_Click_The_Login_Button_And_Login_Should_Fail() throws Throwable {
		
		clickelement(pom.getPOMLogin().getLogin());
		String errmsg = driver.findElement(By.tagName("b")).getText();
	    Assert.assertEquals(errmsg, "Invalid Login details or Your Password might have expired. Click here to reset your password");
	
	}
	
	//Parameters 
	
	@When("^Enter The Username In Username Field as \"([^\"]*)\"$")
	public void enterTheUsernameInUsernameFieldAs(String username) throws Throwable {

		sendvalues(pom.getPOMLogin().getUsername(),username);
	    Thread.sleep(200);
	
	}

	@When("^Enter The Password In Password Field as \"([^\"]*)\"$")
	public void enterThePasswordInPasswordFieldAs(String password) throws Throwable {
	
		sendvalues(pom.getPOMLogin().getPassword(),password);
		Thread.sleep(200);
		
	}

	
	//Search Page
	
	
	@When("^Select The Location$")
	public void selectTheLocation() throws Throwable {
		
		selectvalues(pom.getPOMSearch().getLocation(),Locationvalues.selectSydney());
		Thread.sleep(200);
	}

	@When("^Select The Hotel Name$")
	public void selectTheHotelName() throws Throwable {
		
		selectvalues(pom.getPOMSearch().getHotel(),Hotelvalues.selectHotelCreek());
		Thread.sleep(200);
	    
	}

	@When("^Select The Room Type$")
	public void selectTheRoomType() throws Throwable {
		
		selectvalues(pom.getPOMSearch().getRoom_type(),Roomtype.selectStandard());
		Thread.sleep(200);
	}

	@When("^Select Number Of Rooms$")
	public void selectNumberOfRooms() throws Throwable {
		
		selectvalues(pom.getPOMSearch().getRoom_no(),Roomnum.select1());
		Thread.sleep(200);
	    
	}

	@When("^Enter Check In Date$")
	public void enterCheckInDate() throws Throwable {
		
		clearvalues(pom.getPOMSearch().getCheck_in());
		String check_in = DataReaderManager.getInstanceDRM().getInstanceDR().getPropCheckin();
		sendvalues(pom.getPOMSearch().getCheck_in(),check_in);
		Thread.sleep(200);
	   
	}

	@When("^Enter Check Out Date$")
	public void enterCheckOutDate() throws Throwable {
		
		clearvalues(pom.getPOMSearch().getCheck_out());
		String check_out = DataReaderManager.getInstanceDRM().getInstanceDR().getPropcheckout();
		sendvalues(pom.getPOMSearch().getCheck_out(),check_out);
		Thread.sleep(200);
	    
	}

	@When("^Select Adults Per Room$")
	public void selectAdultsPerRoom() throws Throwable {
		
		selectvalues(pom.getPOMSearch().getAdult(),Adultvalues.select4());
		Thread.sleep(200);
	 
	}

	@When("^Select Children Per Room$")
	public void selectChildrenPerRoom() throws Throwable {

		
		selectvalues(pom.getPOMSearch().getChild(),Childvalues.select2());
		Thread.sleep(200);
		
	}

	@Then("^User Click The Search Button And It Will Navigate To Continue Page$")
	public void userClickTheSearchButtonAndItWillNavigateToContinuePage()  throws Throwable {
		
		clickelement(pom.getPOMSearch().getSearch());
		Thread.sleep(200);
		
	}
	
	//Continue Page
	
	
	@When("^Select The Hotel$")
	public void selectTheHotel() throws Throwable {
		
		clickelement(pom.getPOMContinue().getSelect());
		Thread.sleep(200);
	    
	    
	}

	@Then("^Click The Continue Button And It Will Navigate To Booking Page$")
	public void clickTheContinueButtonAndItWillNavigateToBookingPage() throws Throwable {
	    
		clickelement(pom.getPOMContinue().getCont());
		Thread.sleep(200);
		
	}
	
	
	//Booking Page
	
	
	@When("^Enter The First Name$")
	public void enterTheFirstName() throws Throwable {

	    String f_name = DataReaderManager.getInstanceDRM().getInstanceDR().getPropFirstname();
	    sendvalues(pom.getPOMBooking().getF_name(),f_name);
	    Thread.sleep(200);
	}

	@When("^Enter The Last Name$")
	public void enterTheLastName() throws Throwable {

		String l_name = DataReaderManager.getInstanceDRM().getInstanceDR().getPropLastname();
	    sendvalues(pom.getPOMBooking().getL_name(),l_name);
	    Thread.sleep(200);
		
	}

	@When("^Enter The Billing Address$")
	public void enterTheBillingAddress() throws Throwable {
	    
		String address = DataReaderManager.getInstanceDRM().getInstanceDR().getPropAddress();
	    sendvalues(pom.getPOMBooking().getAddress(),address);
	    Thread.sleep(200);
		
	}

	@When("^Enter The Credit Card Number$")
	public void enterTheCreditCardNumber() throws Throwable {
	    
		String cc_num = DataReaderManager.getInstanceDRM().getInstanceDR().getPropccnum();
	    sendvalues(pom.getPOMBooking().getCc_num(),cc_num);
	    Thread.sleep(200);
		
	}

	@When("^Select The Credit Card Type$")
	public void selectTheCreditCardType() throws Throwable {
	   
	    selectvalues(pom.getPOMBooking().getCc_type(),CC_type.selectAMEX());
	    Thread.sleep(200);
		
	}

	@When("^Select The Expiry Month$")
	public void selectTheExpiryMonth() throws Throwable {
	    
	    selectvalues(pom.getPOMBooking().getCc_month(),CC_month.select11());
	    Thread.sleep(200);
		
	}

	@When("^Select The Expiry Year$")
	public void selectTheExpiryYear() throws Throwable {
	    
	    selectvalues(pom.getPOMBooking().getCc_year(),CC_year.select2026());
	    Thread.sleep(200);
		
	}

	@When("^Enter The CVV Number$")
	public void enterTheCVVNumber() throws Throwable {
	    
		String cc_cvv = DataReaderManager.getInstanceDRM().getInstanceDR().getPropcccvv();
	    sendvalues(pom.getPOMBooking().getCc_cvv(),cc_cvv);
	    Thread.sleep(200);
		
	}

	@Then("^Click The Book Now Button And It will Navigate To Confirmation Page$")
	public void clickTheBookNowButtonAndItWillNavigateToConfirmationPage() throws Throwable {
	    
		clickelement(pom.getPOMBooking().getBook());
		Thread.sleep(1000);
		
	}
}

