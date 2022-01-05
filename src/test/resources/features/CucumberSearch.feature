Feature: As a user I want to have an ability to use search on Selenium web site

  Scenario Outline: Search tip should give an appropriate result
    Given the user opens Selenium website
    When the user clicks on the search field
    And the user enters "<title>" in search field
    And opens the first search tip
    Then the page title contains "<title>"
    Examples:
      | title         |
      | Google Summer |
      | Browser       |
      | WebDriver     |