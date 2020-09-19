@runAll
Feature: FreeCRM Application testing

@SmokeTest 
Scenario: Login with correct username and correct password
Given This is valid login test

@Regression
Scenario: Login with correct username and correct password
Given This is invalid login test

@SmokeTest
Scenario: Create a contact
Given This is contact test case

@SmokeTest @Regression
Scenario: Create a deal
Given This is deal test case

@SmokeTest @Regression
Scenario: Create a tasks
Given This is tasks test case

@SmokeTest  @Regression
Scenario: Create a cases
Given This is cases test case

@SmokeTest  @Regression
Scenario: Verify left panel links
Given clicking on left panel links

@SmokeTest
Scenario: Search a contact
Given This is a search contact test

@SmokeTest   @Regression
Scenario: Search a deal
Given This is a search deal test

@SmokeTest @Regression
Scenario: Search a case
Given This is a search case test

@SmokeTest
Scenario: Search a task
Given This is a search task test

@SmokeTest
Scenario: Search a call
Given This is a search call test

@SmokeTest @EndtoEnd
Scenario: Search an email
Given This is a search email test

@SmokeTest @EndtoEnd
Scenario: Search a docs
Given This is a search docs test

@SmokeTest  @EndtoEnd 
Scenario: Search a forms
Given This is a search forms test

@EndtoEnd
Scenario: validate a report
Given This is a report test

@EndtoEnd
Scenario: Application logout
Given This is a logout test



