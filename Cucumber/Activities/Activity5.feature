@activity5
Feature: Login Test
  Scenario Outline: Testing Login with Example
  Given the user is on the login page
  When User enters "<Usernames>" and "<Passwords>"
  Then Read the page title and confirmation message

    Examples:
      | Usernames | Passwords |
      | admin     | password  |
      | adminUser | Password  |
