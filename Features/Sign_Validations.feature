Feature: This  feature is designed to validate the all possible way behaviour of the signin link

Scenario Outline: Test the signin functionality with the all conmbinations of testdata

Given Launch the <Browser> and with the <url> maximize it

Then click on the signin link

And Enter the <Email> ID and verify the user is not exist on the database

Examples:
|Browser|url|Email|
|firefox|http://automationpractice.com/index.php|abc.xyz@abc.com|

 

   