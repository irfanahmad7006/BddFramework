Feature: Uber Booking Feature

  @Sanity
  Scenario: Booking a sedan cab
    Given User wants to select a "sedan" car from uber app
    When User selects car "sedan" and pickup point "Delhi" to "Jaipur"
    Then Driver starts the journey
    And Driver ends the journey
    And User pays 1000 rupees
    And User check the trip details

  @Smoke
  Scenario: Booking a cab SUV
    Given User wants to select a "SUV" car from uber app
    When User selects car "SUV" and pickup point "MUMBAI" to "GOA"
    Then Driver starts the journey
    And Driver ends the journey
    And User pays 1000 rupees

  @Regression
  Scenario: Booking a cab MINI
    Given User wants to select a "HATCHBACK" car from uber app
    When User selects car "HATCHBACK" and pickup point "ALIGARH" to "HATHRAS"
    Then Driver starts the journey
    And Driver ends the journey
    And User pays 1000 rupees