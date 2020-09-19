Feature: Functionality test Free CRM
Scenario Outline: Contact details in Free CRM

Given user is already on loginPage
When title of loginPage is FreeCRM
Then user enters "<username>" and "<password>"
Then user can click on loginbutton
Then user is on the homePage 
Then user moves to new Contacts
Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
Then Close the browser

Examples:

        |username  |password   |firstname|lastname  |position |
        |Mayuri_257|mayuri$257 | Tomy    | Heikein  | Manager |
        |Mayuri_257|mayuri$257 | Jack    | Rosewelt | Director|
        |Mayuri_257|mayuri$257 | John    | Carlton  | Analyst |