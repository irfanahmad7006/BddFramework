Feature: Login Feature

  Scenario Outline:
    Given User is on Application landing page
    When User clicks on Sign in button
    Then User is displayed login screen
    When User enters "<userName>" in username field
    And User enters "<password>" in password field
    And User clicks on button
    Then user gets login failed error message
    Examples:
      | userName           | password           |
      | incorrectUsername1 | incorrectPassword1 |
      | incorrectUsername2 | incorrectPassword2 |
      | incorrectUsername3 | incorrectPassword3 |