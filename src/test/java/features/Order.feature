Feature: Amazon Order Page

  Background:
    Given User is on Amazon Login page
    When User enters username
    And User enters password
    And User clicks on login button
    Then User Navigates to Order page

  Scenario: Check Previous Order Details
    When User clicks on Previous Order link
    And User checks the previous order details

  Scenario: Check Open Order Details
    When User clicks on Open Order link
    And User checks the open order details

  Scenario: Check cancelled Order Details
    When User clicks on cancelled Order link
    And User checks the cancelled order details
