Feature: Checking feature of Free CRM
Scenario: Deal page test of Free CRM 

Given user is already on loginPage
When title of loginPage is FreeCRM
Then user enters username and password

|username  |password  |
|Mayuri_257|mayuri$257|

Then user can click on loginPage
Then user is on the homePage 
Then user moves to new Deals
Then user enters deal details
|title     |amount|probability|commission|
|test     1|1000  |50         |10        |
|test     2|2000  |40         |20        |
|test     3|3000  |60         |30        |

Then Close the browser