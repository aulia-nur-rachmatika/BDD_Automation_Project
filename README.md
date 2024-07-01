*Computer-Based Test (CBT) System Testing Project*

*Overview*

This repository contains the automated testing scripts and documentation for the Computer-Based Test (CBT) system using Behavior Driven Development (BDD) techniques. 
The project utilizes Katalon Studio for implementing and executing the automated tests.


Features

    Automated functional testing of the CBT system.
    Implementation of BDD using Gherkin syntax for clear and understandable test scenarios.
    Efficient test execution using Katalon Studio.
    Comprehensive reporting of test results.

Technology Stack

    BDD Framework: Cucumber with Gherkin syntax
    Automation Tool: Katalon Studio
    Programming Language: Groovy (for Katalon scripts)
    Version Control: Git


**Test Scenarios**
Sample Test Scenario

Feature: Login Pengguna

Scenario Outline: Pengguna masuk ke dalam sistem 
	Given  Pengguna membuka halaman login 
	When Pengguna memasukkan <email> dan <password> yang valid 
	And Pengguna klik tombol login
	Then Pengguna diarahkan ke halaman sistem
	
	Examples:
	| email | password |
	| aulianurrachmatika02@gmail.com |HXRQlBZtILolxFVf9q2LbQ==|

**Running Test Case**
![gambar](https://github.com/aulia-nur-rachmatika/BDD_Automation_Project/assets/114218228/5011b14d-cced-4580-9f8d-966f8d946883)


	
