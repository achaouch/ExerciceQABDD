

Feature: feature to test google search functionality

  Scenario Outline: Validate google search is working
    Given browser window is open
    And user is on google search page
    When user enters a <Keyword> in search box
    And  user hits enter 
    Then user is navigated to search results of <Keyword>

    Examples: 
      | Keyword  | 
      |  Abdou   |
      |  Cyrine  |
       