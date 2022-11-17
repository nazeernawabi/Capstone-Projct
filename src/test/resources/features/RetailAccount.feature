Feature: Retail Account feature

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'nazeernawabi@yahoo.com' and password 'Kabul@1234'
    And User click on login button
    And User should be logged in into Account
    When User click on Account option

  Scenario: Verify user can update Profile Information
    When User click on Account option
    And User update Name 'Harris' and Phone '9162152556'
    And User click on Update button
    Then User profile information should be updated

  Scenario: Verify User can Update password
    And User enter below informaton
      | previousPassword | newPassword    | confirmPassword |
      | Kabul@1234       | Nazeerjan1234@ | Nazeerjan1234@  |
    And User click on Change Password button
    Then A message should be displayed 'Password Updated Successfully'

  Scenario: Verify user can add a payment method
    And User click on add a payment method link
    And User fill debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expiratonYear | securityCode |
      | 4444555566667777 | Tony Brown |              02 |          2025 |          888 |
    And User click on add your card button
    Then a message should be displayed 'Payment Method added successfully'

  Scenario: Verify user can edit Debit or Credit card
    And User click on Edit option of card section
    And Use edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expiratonYear | securityCode |
      | 4444555566668888 | Tony Brown |              03 |          2024 |          666 |
    And User click on Update Your Card button
    Then A message should be displayed 'Payment Method updated Successfully'

  Scenario: Verify user can remove Debit
    And User click on remove option of card section
    Then Payment details should be removed

  Scenario: Verify user can add an Address
    And User click on Add address option
    And User fill new address form with below information
      | country       | fullName | phoneNumber | streetAddress     | apt | city      | state | zipCode |
      | United States | Jamie    |  9162152544 | 1178 Yellow court |  10 | Elk Grove | CA    |   95666 |
    And User click Add Your Address button
    Then A message should be displayed 'Address Added Successfully'

  
  Scenario: Verify user can edit an Address added on account
    And User click on edit address option
    And User fill new address form with below information
      | country       | fullName | phoneNumber | streetAddress     | apt | city      | state | zipCode |
      | United States | Jamie    |  9162152544 | 1188 Orange court |  10 | Elk Grove | CA    |   95666 |
    And User click on update Address button
    Then a message should be displayed 'Address Updated Successfully'
    
   
    Scenario: Verify user can remove Address from Account
    And User click on remove option of address section
    Then Address details should be removed
    
    
    
    
    
    
    
