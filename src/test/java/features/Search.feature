Feature: Search Feature Test
  @Smoke
  Scenario: Search for a product on amazon
    Given User is on search field
    When User searches for "Iphone" with price 1000
    Then System displays the product "Iphone"
  @Regression
  Scenario: Search for a product on amazon
    Given User is on search field
    When User searches for "Mac Book" with price 1500
    Then System displays the product "Mac Book"

