@SmokeTest
@activity6
Feature: Data driven test with Data Table

  Scenario: Testing with Data from Data Table
    Given the user is on Login page
    When User enters Usernames and Password
      | usernames | password |
      | admin     | password |
    Then Read the page title and confirmation message
    And Close the Browser
