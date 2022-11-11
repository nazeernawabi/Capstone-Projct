Feature: Retail Account feature

Background: 

Given User is on retail website
When User click on Sign in option
And User enter email 'nazeernawabi@yahoo.com' and password 'Nazeerjan1234@'
And User click on login button
And User should be logged in into Account

@test3
Scenario: Verify user can update Profile Information 
When User click on Account option
And User update Name 'Harris' and Phone '9162152555'
And User click on Update button
Then User profile information should be updated


  