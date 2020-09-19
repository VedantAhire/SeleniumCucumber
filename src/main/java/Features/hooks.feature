Feature: FreeCRM app test


@First
Scenario: Create a new deal 
Given user is on deal page
When user fills the deal details
Then new deal is created

@Second
Scenario: Create a new contact 

Given user is on contact page
When user fills the contact details
Then new contact is created

@Third
Scenario: Create a new task

Given user is on tasks page
When user fills the taskdetails
Then new task is created

@Fourth
Scenario: Create a new calls

Given user is on calls page
When user fills the calldetails
Then new call is created