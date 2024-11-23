Feature: Booking Hotel Using Adactin Application

Background: 

          When Select The Location

          And Select The Hotel Name
          
          And Select The Room Type
          
          And Select Number Of Rooms
          
          And Enter Check In Date
          
          And Enter Check Out Date
          
          And Select Adults Per Room
          
          And Select Children Per Room


@testcase1
Scenario: To Verify The Valid Checkin Date and Check Out Date
          
          But User Click The Search Button And System Should Report Error In CheckIn Date and CheckOut Date 


@testcase2       
Scenario: To verify the location in search hotel and select hotel is same
   
          Then User click the search button and verify the location in select hotel page
          
          
@testcase3
Scenario: To verify the checkin date and checkout dates in select hotel page

          Then user click the search button and verify checkin and checkout dates
          

@testcase4
Scenario: To verify the totalprice 

          Then User Click The Search Button And It Will Navigate To Continue Page 
           
          When Select The Hotel
          
          Then Click The Continue Button And It Will Navigate To Booking Page
          
          And verify the totalprice
          
          
@testcase5
Scenario: To check whether the fields on select hotel page are editable

          Then User Click The Search Button And It Will Navigate To Continue Page
           
          And Check if the fields are editable
          
         
          
          
          
          

                     