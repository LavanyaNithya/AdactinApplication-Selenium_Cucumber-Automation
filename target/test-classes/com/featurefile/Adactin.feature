Feature: Booking Hotel Using Adactin Application

@login
Scenario: Login Functionality 

          Given Launch The URL
          
          #And Maximize The Window

          When Enter The Username In Username Field

          And Enter The Password In Password Field

          Then User Click The Login Button And It Will Navigate To Search Page

@search          
Scenario: Search Functionality

          When Select The Location

          And Select The Hotel Name
          
          And Select The Room Type
          
          And Select Number Of Rooms
          
          And Enter Check In Date
          
          And Enter Check Out Date
          
          And Select Adults Per Room
          
          And Select Children Per Room
          
          Then User Click The Search Button And It Will Navigate To Continue Page   

@continue
Scenario: Continue Functionality

          When Select The Hotel
          
          Then Click The Continue Button And It Will Navigate To Booking Page
         
@booking          
Scenario: Booking Functionality

          When Enter The First Name
          
          And Enter The Last Name
          
          And Enter The Billing Address
          
          And Enter The Credit Card Number
          
          And Select The Credit Card Type
          
          And Select The Expiry Month
          
          And Select The Expiry Year
          
          And Enter The CVV Number
          
          Then Click The Book Now Button And It will Navigate To Confirmation Page
  
@logout        
Scenario: Logout Functionality

          Then User click the logout button and it log outs from the page
          
          