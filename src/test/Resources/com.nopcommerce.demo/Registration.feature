Feature: Registration

  As a User I wanted to Register successfully on https://demo.nopcommerce.com
  so I can buy any product, I can email any product to friend and filter the product price high to low

  Scenario: To verify user should be able to register successfully
    Given User is on the registration page
    When user select gender "Male"
    And enter the first name "Kp"
    And enter the last name "patel"
    And select the day, month and year for the date of birth "6 april 1979"
    And enter email address "kppatel@yahoo.com"
    And enter company name "Yogiraj"
    And click in newsletter box
    And enter password "test123"
    And confirm password "test123"
    And click on the register button
    Then user should be able to register successfully
    And user should able to see registration successful message

  Scenario:To verify registered user should be able to send email with product successfully
    Given Registered user is on the main page of website
    When user select product "build your own computer"
    And click on that product
    And click on email a friend button
    And enter friends email id "pkpatel@yahoo.com"
    And enter personal message "It is very nice product have a look"
    And click on send email button
    Then user should able to send email with product successfully

  Scenario: To verify registered user should be able to buy any single product successfully
    Given Registered user is on the main page of website
    When user select "HCT One M8 Android L 5.0 Lollipop" product
    And click on add to cart button
    And click on shopping cart button
    And click on terms of service box
    And click on checkout button
    And navigate to check out page
    And see first step billing address
    And enter company name "Yogiraj"
    And select country "United Kingdom"
    And enter city name "London"
    And enter first line of address "15 Talbet Road"
    And enter second line of address "Wembley"
    And enter postalcode "HA04UA"
    And enter phone number "07894234443"
    And enter fax number "02073638352"
    And click on continue button
    And navigate to 3rd step shipping method
    And  click on Ground($0.00) from option
    And click on continue button
    And navigate to step 4 Payment
    And click on credit card
    And click on continue button
    And navigate to step 5 payment information
    And enter cardholder name "Shital"
    And enter card number "4111 1111 1111 1111"
    And enter expire date and year "02/2020"
    And enter card code "737"
    And navigate to step 6 confirm order
    And click on confirm button
    Then user is able to buy product successfully

  Scenario:To verify unregistered user should not be able to send email successfully
    Given User is on the home page of website
    When user click on computer field without login
    And user click on category desktop
    And click on product "Lenovo IdeaCenter 600 All-in-One PC"
    And click on Email a friend button
    And enter friends email id "pnpatel@gmail.com"
    And enter personal email id "skpatel@hotmail.com" in your email address field
    And enter personal message "I wanted to show you this nice product"
    And click on Send Email button
    Then user should be able to see error message "Only registered customers can use email a friend feature"

  Scenario: To verify user must have to accept terms and condition for check out
    Given Registered user is on the mane page of website
    When user click on product "Build your own computer"
    And click on "HDD" button from product description
    And click on add to cart button
    And click on shopping cart button
    And click on check out button without selecting terms and condition button
    Then user is getting error message "Please accept the terms of service before the next step."

  Scenario: To verify user should be able to sort by price high to low
    Given Registered user is on the main page of website
    When user click on Apparel
    And click on category Clothing
    And click on menu drop down button for sort by
    And select price high to low
    Then user should be able to sort by product price high to low

  Scenario: To verify Add To Cart button should be present in all product on home page
    Given  user is on the home page of website
    When  user scroll down
    And see the featured products
    Then user should be able to see "Add to Cart" button in the all product

  Scenario: To verify user should be able to select currency "Euro" in currency selector box
    Given user is on the home page of website
    When user click on the currency selector box
    And select "Euro" as a customer currency
    And click on the "Jewelry" category
    And navigate to jewelry page
    And see all the products
    Then user should able to see "Euro sing" before price in all the product

  Scenario: To verify user should be able to select currency "US Dollar" in currency selector box
    Given user is on the home page of website
    When user click on the currency selector box
    And select "US Dollar" as a customer currency
    And click on the "Jewelry" category
    And navigate to jewelry page
    And all the products should be visible
    Then user should able to see "US Dollar sing($)" before price in all the product
