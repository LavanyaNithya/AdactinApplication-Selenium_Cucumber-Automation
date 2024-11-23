Feature: Booking Hotel Using Adactin Application
          
@test @reg
Scenario: Login Functionality

          Given Launch The URL
          
          And Maximize The Window
          
          When Enter The Username In Username Field as "NLavanya"

          And Enter The Password In Password Field as "$Lavanya11"

          Then User Click The Login Button And It Will Navigate To Search Page
          
@smoke        
Scenario Outline: Login Functionality Success

          Given Launch The URL
          
          And Maximize The Window
          
          When Enter The Username In Username Field as "<username>"

          And Enter The Password In Password Field as "<password>"

          Then User Click The Login Button And It Will Navigate To Search Page

@test1          
Examples: 

         |username|password|
         |NLavanya|$Lavanya11|
      
@test2         
Examples:

         |username|password|
         |NKuttima|$Kuttima11|
         
      
@reg         
Scenario Outline: Login Functionality Failure

          Given Launch The URL
          
          And Maximize The Window
          
          When Enter The Username In Username Field as "<username>"

          And Enter The Password In Password Field as "<password>"

          But User Click The Login Button And Login Should Fail
          
Examples: 

         |username|password|
         |NLava|$Lava|
         |NKutti|$Kutti|
