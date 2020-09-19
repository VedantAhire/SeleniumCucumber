Feature: Smoke test for Facebook
Scenario: Login functionality of Facebook

Given user is already on loginPage
When title of loginPage is FreeCRM
Then user enters "Mayuri_257" and "mayuri$257"
Then user can click on loginPage
Then verify title of homePage 