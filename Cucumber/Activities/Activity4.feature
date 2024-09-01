@activity4
Feature: Data Driven Test without Example

  @loginTest @loginSuccess
  Scenario: Testing with correct data from inputs
    Given the user is on the login page
    When the user enters "admin" and "password"
    And click on the submit button
    Then get the confirmation message and verify message as "Welcome Back, admin"

  @loginTest @loginFail
  Scenario: Testing with Incorrect data from inputs
    Given the user is on the login page
    When the user enters "admin12" and "password12"
    And click on the submit button
    Then get the confirmation message and verify message as "Invalid Credentials"