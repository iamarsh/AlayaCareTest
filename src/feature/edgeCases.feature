#Author: Arshdeep Singh | arshdeepsingh983@gmail.com

Feature: Testing Edge Cases

Background: 
Given the user has logged-in
		
Scenario Outline: Basic hotel search for Extreme Dates and Number of Users
    
When the user has clicked Home to access the search page
When they have chosen the Hotels option
When they have chosen a hotel for "<city>"
When they have chosen "<checkin>" for checkin
When they have chosen "<checkout>" for checkout
When they have selected "<adults>" for adults
When they have chosen "<children>" for children
When they click search
Then matching results are displayed

Examples: 
| city     		| checkin    | checkout   | adults | children |
| Quebec City | 01/11/2018 | 01/11/0001 |      1 |        1 | 
| Toronto	 		| 15/11/2018 | 28/11/9999 |     10 |        5 |
| Montreal 		| 31/10/2018 | 14/11/2018 |      0 |        0 |
| Vancouver		| 15/11/2018 | 28/11/2018 | 999999 |   999999 |
