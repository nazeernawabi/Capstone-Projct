Feature: Home page feature

  Scenario: Verify shop by Department sidebar
    Given User is on retail website
    When User click on All section
    Then Below options are present in Shop by Department sidebar
      | Electronics | Computers | Smart Home | Sports | Automative |

  Scenario Outline: Verify department sidebar options
    Given User is on retail website
    When User click on All section
    And User on <department>
    Then below options are present in the department
      | <optionOne> | <optionTwo> |

    Examples: 
      | department  | optionOne                      | OptionTwo                |
      | Electronics | TV & Video                     | Video Games              |
      | Computers   | Accessories                    | Networking               |
      | Smart Home  | Smart Home Lightning           | Plugs and Outlets        |
      | Sports      | Athletic Clothing              | Exercise & Fitness       |
      | Automative  | Automative Parts & Accessories | MotorCycle & Powersports |

 
  Scenario: Verify user can add an item to cart
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'nazeernawabi@yahoo.com' and password 'Kabul@1234'
    And User click on login button
    Then User should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item 'Kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And user click add to Cart button
    Then the cart icon quantity should change to '2'
 
  Scenario: Verify user can place an order without Shipping address and payment Method on file
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'nazeernawabi@yahoo.com' and password 'Kabul@1234'
    And User click on login button
    Then User should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item 'Kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And user click add to Cart button
    And the cart icon quantity should change to '2'
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click add Your address button
    And User fill address form with below new information
      | country       | fullName   | phoneNumber | streetAddress  | apt | city       | state      | zipCode |
      | United States | Jack Smith |  9164152555 | 4545 Johns ave |  44 | Sacramento | California |   95682 |
     And User click Add Your Address button
    And User click Add a credit card for Payment method
    And User fill debit card information
      | cardNumber       | nameOnCard | expirationMonth | expiratonYear | securityCode |
      | 4444555566667777 | Jack Smith |             12 |           2025 |          999 |
    And User click on add your card button
    And User click on Place Your Order
    Then The message should be displayed 'Order Placed Successfully'
     
    @test1 
    Scenario: Verify User can place an order with Shipping address and payment Method on file
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'nazeernawabi@yahoo.com' and password 'Kabul@1234'
    And User click on login button
    Then User should be logged in into Account
    And User change the category to 'Electronics'
    And User search for an item 'Apex Legends'
    And User click on Search icon
    And User click on item
    And User select quantity '5'
    And user click add to Cart button
    And the cart icon quantity should change to '5'
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click on Place Your Order
    Then The message should be displayed 'Order Placed Successfully'  
      
      
      
      
      
      
      
      
      
      
