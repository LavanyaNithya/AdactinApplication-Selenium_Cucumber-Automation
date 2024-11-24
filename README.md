**Overview**

The Adactin Hotel Automation Project is a comprehensive test automation suite designed to validate the functionality of the Adactin Hotel application. This project demonstrates automation testing skills using Selenium WebDriver, Cucumber (BDD), and Java to ensure a robust and reliable user experience for the hotel booking process.

**Features Covered**

User Authentication:

Testing login functionality with valid and invalid credentials.

Hotel Search:

Verifying search criteria, such as location, room type, and dates.

Hotel Booking:

Automating room selection, personal details input, and booking confirmation.

Order History:

Testing the order history feature for existing bookings.

Logout Functionality:

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

AdactinHotelAutomation/

├── src/main/java        # Main application code (if applicable)

├── src/test/java        # Test cases and step definitions

├── features             # Cucumber feature files

├── test-output          # Generated test reports

├── pom.xml              # Maven configuration file

└── README.md            # Project documentation

**Setup and Execution**

Pre-requisites

Install Java JDK 8+.

Install Maven.

Install Eclipse IDE or IntelliJ IDEA.


Clone the repository using:

git clone https://github.com/your-username/adactin-hotel-automation.git

Steps to Execute:

1.Open the project in your IDE.

2.Download dependencies by running

mvn clean install

Execute the tests using:

For all tests:

mvn test


