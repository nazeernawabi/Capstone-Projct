Feature: Retail Account feature

Background: 

Given User is on retail website
When User click on Sign in option
And User enter email 'nazeernawabi@yahoo.com' and password 'Nazeerjan1234@'
And User click on login button
And User should be logged in into Account


Scenario: Verify user can update Profile Information 
When User click on Account option
And User update Name 'Harris' and Phone '9162152556'
And User click on Update button
Then User profile information should be updated
@test4
Scenario: Verify User can Update password
When User click on Account option
And User enter below informaton
|previousPassword|newPassword|confirmPassword|
|Nazeerjan1234@|Kabul@1234|Kabul@1234|
And User click on Change Password button
Then A message should be displayed Password Updated Successfully

  