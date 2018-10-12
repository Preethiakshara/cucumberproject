@tag
Feature: Add customer
  Scenario Outline: Add customer details
Given The user is in guru login page
And the user logged in as manager with credentails
|username  |mngr157328|
|password  |zYqetAm   |
And the user navigator to new customer 
When The user enters the customer details "<custname>","<Gender>","<Dob>","<Address>","<city>","<state>","<pin>","<phoneno>","<email>","<password>"
And The user click reset  button
Then The fields should in add customer page

    Examples: 
      |custname | Gender | Dob    |Address    |city    |state|pin   |phoneno   |email          |password|
      |usera    | female |08181994|andal nagar|dindigul|tn   |624005|9787414968|usera@gmail.com|user@1  |
      |userb    | male   |09191994|ns nagar   |dindigul|tn   |624006|9787494168|userb@gmail.com|user@2  |