Feature: Checking feature of Free CRM
Scenario: Deal page test of Free CRM 

Given user is already on loginPage
When title of loginPage is FreeCRM
Then user enters username and password
|Mayuri_257|mayuri$257|
Then user can click on loginPage
Then user is on the homePage 
Then user moves to new Deals
Then user enters deal details
|test deals|1000|50|10|
Then Close the browser