Feature: User Registration

  Scenario: User Registration with different data (List of List)
    Given User is on regisration page
    When User enters following user details
      | Irfan | Ahmad  | irfan.ahmad@gmail.com   | 8802927006 | Banglore |
      | Tom   | Hooper | thomas.hooper@gmail.com | 9384289342 | London   |
      | Lisa  | John   | lisa.john@gmail.com     | 9842478723 | New York |
    Then User registration should be succefull

  Scenario: User Registration with different data with columns (List of Map)
    Given User is on regisration page
    When User enters following user details with columns
      | FirstName | LastName | Email                   | Phone      | City     |
      | Irfan     | Ahmad    | irfan.ahmad@gmail.com   | 8802927006 | Banglore |
      | Tom       | Hooper   | thomas.hooper@gmail.com | 9384289342 | London   |
      | Lisa      | John     | lisa.john@gmail.com     | 9842478723 | New York |
    Then User registration should be succefull