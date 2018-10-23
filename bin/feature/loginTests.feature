#Author: Arshdeep Singh | arshdeepsingh983@gmail.com

Feature:  Login

Background:
Given the user has navigated to the login page

Scenario: Login (Successful)
When they provide the correct credentials
Then the user is logged in 
And they will be directed to their account page


Scenario: Login - (Bad password)
When they provide the incorrect password for their account
Then an error will be provided stating 'Invalid Email or Password'

