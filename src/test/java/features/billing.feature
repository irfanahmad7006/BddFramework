Feature: Calculate billing amount

  Scenario Outline: Billing amount

    #Inorder to avoid AmbiguousStepDefinitionsException use string as per the below given commented lines
    #When User enters billing amount "<billingAmount>"
    #And User Wrapper Class to avoid above said issue

    Given User is on billing page
    When User enters billing amount <billingAmount>
    When User enters tax amount <taxAmount>
    And User click on calculate button
    Then it give the final amount <finalAmount>

    Examples:
      | billingAmount | taxAmount | finalAmount |
      | 1000          | 10        | 1010        |
      | 500           | 20        | 520         |
      | 100           | 5.5       | 105.5       |