Feature: Sign In Feature


Scenario: Verify user can sign in into Retail Application
Given User is on retail website
When User click on Sign in option
And User enter email 'nazeernawabi@yahoo.com' and password 'Nazeerjan1234@'
And User click on login button
Then User should be logged in into Account


  Scenario: Verify user can create an account into Retail Website
    Given User is on retail website
    When User click on Sign in option
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name  | email                 | password   | confirmPassword |
      | Jamie | jamie222@tekschool.us | Tek@987654 | Tek@987654      |
    And User click on signUp button
    Then User should be logged into account page






