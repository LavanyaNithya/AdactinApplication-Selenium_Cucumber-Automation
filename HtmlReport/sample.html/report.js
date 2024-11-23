$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\java\\com\\featurefile\\Adactin.feature");
formatter.feature({
  "name": "Booking Hotel Using Adactin Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login Functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch The URL",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.launchTheURL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter The Username In Username Field",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.enterTheUsernameInUsernameField()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter The Password In Password Field",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.enterThePasswordInPasswordField()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click The Login Button And It Will Navigate To Search Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.userClickTheLoginButtonAndItWillNavigateToSearchPage()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Search Functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@search"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Select The Location",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.selectTheLocation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select The Hotel Name",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.selectTheHotelName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select The Room Type",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.selectTheRoomType()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Number Of Rooms",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.selectNumberOfRooms()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Check In Date",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.enterCheckInDate()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Check Out Date",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.enterCheckOutDate()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Adults Per Room",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.selectAdultsPerRoom()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Children Per Room",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.selectChildrenPerRoom()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click The Search Button And It Will Navigate To Continue Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.userClickTheSearchButtonAndItWillNavigateToContinuePage()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Continue Functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@continue"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Select The Hotel",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.selectTheHotel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click The Continue Button And It Will Navigate To Booking Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.clickTheContinueButtonAndItWillNavigateToBookingPage()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png");
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Booking Functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@booking"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Enter The First Name",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.enterTheFirstName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter The Last Name",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.enterTheLastName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter The Billing Address",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.enterTheBillingAddress()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter The Credit Card Number",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.enterTheCreditCardNumber()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select The Credit Card Type",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.selectTheCreditCardType()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select The Expiry Month",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.selectTheExpiryMonth()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select The Expiry Year",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.selectTheExpiryYear()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter The CVV Number",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.enterTheCVVNumber()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click The Book Now Button And It will Navigate To Confirmation Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.clickTheBookNowButtonAndItWillNavigateToConfirmationPage()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png");
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Logout Functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@logout"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User click the logout button and it log outs from the page",
  "keyword": "Then "
});
formatter.match({
  "location": "TestcaseSteps.userClickTheLogoutButtonAndItLogOutsFromThePage()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded4.png");
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});