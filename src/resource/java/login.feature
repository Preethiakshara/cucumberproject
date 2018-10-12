
Feature: To test Login functionality

Scenario: To login with valid credentials
Given The user is in Guru login page
When The user enters username & password
Then The user should be logged in


Scenario: To Add the New Customer
Given The user is in add new customer
When the user enter the details
|usera|andal nagar|dindigul|tamilnadu|624005|9787414968|akshara@gmail.com|aks12|08181994|
And the user click the submit button
Then The user should see the success message

Scenario Outline: To reset with valid credentials
Given The user is in login page
When The user enter username"<username>",password"<password>"
And The user click reset button
Then The fields should be empty
 Examples: 
|username|password|
|abac    |abac    |
|1234    |1234    |
|aks     |aks     |