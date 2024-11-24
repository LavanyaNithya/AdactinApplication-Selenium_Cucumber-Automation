**Overview**

The Adactin Hotel Automation Project is a comprehensive test automation suite designed to validate the functionality of the Adactin Hotel application. This project demonstrates automation testing skills using Selenium WebDriver, Cucumber (BDD), and Java to ensure a robust and reliable user experience for the hotel booking process.

**Features Covered**

1.User Authentication:

Testing login functionality with valid and invalid credentials.

2.Hotel Search:

Verifying search criteria, such as location, room type, and dates.

3.Hotel Booking:

Automating room selection, personal details input, and booking confirmation.

4.Order History:

Testing the order history feature for existing bookings.

5.Logout Functionality:

Ensuring secure session termination.

**Technologies Used**

Programming Language: Java

Automation Framework: Selenium WebDriver

Test Framework: Cucumber (Behavior-Driven Development)

Build Tool: Maven

IDE: Eclipse/IntelliJ IDEA

Version Control: Git and GitHub

Reporting: Cucumber HTML Reports,Extent Reports

**Folder Structure**

AdactinApplication-Automation/

├── src/

│     ├── main/

│     │   └── java/

│     │       ├── Baseclass/           # Core utilities for setup and reusable methods

│     │       ├── DataReader/          # Data-driven testing utilities

│     │       ├── PageObjectManager/   # Singleton class for managing page objects

│     │       ├── PageObjectModel/     # Page classes for encapsulating web elements

│     │       ├── PropertyFile/        # Configuration file utilities

│     ├── test/

│         └── java/

│             ├── Featurefile/         # Cucumber feature files

│             ├── Hooks/               # Pre and post-test setup

│             ├── Runner/              # Cucumber runner classes

│             ├── StepDefinition/      # Step definitions for Cucumber scenarios

├── HtmlReport/                       # Automatically generated HTML test reports

├── test-output/                      # Cucumber Extent reports

├── pom.xml                           # Maven dependencies and build configuration

└── README.md                         # Project documentation


**Setup and Execution**

Pre-requisites

1.Install Java JDK 8+.

2.Install Maven.

3.Install Eclipse IDE or IntelliJ IDEA.


Clone the repository using:

   git clone https://github.com/LavanyaNithya/AdactinApplication-Selenium_Cucumber-Automation.git

Steps to Execute:

1.Open the project in your IDE.

2.Download dependencies by running

   mvn clean install

3.Execute the tests using:

   mvn test


