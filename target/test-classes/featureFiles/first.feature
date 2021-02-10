Feature: Navigate various menus and options from given url

Background: 
Given Initialize the browser
And access the url


Scenario: Access the home page of provided url
When Click on the Home Menu
Then home page should be displayed with appropriate page titile
And close the browser


Scenario Outline: try to login using email and password
When click on the login option
And enter user <email> and <password>
Then Error message should be displayed
And close the browser

Examples:
|email				|password			|
|vtam				|13345				|
|vtam@gmail.com		|67890				|
