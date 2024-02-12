@register
Feature: Register User

  @register
  Scenario: As a user, I should be able to register with fill in all required data
    Given user open WeFly app
    * user navigate to Register page
    When user fills in all the required data on the registration page
    * user click Sign Up button
    Then user sees a snackbar that the user successfully registered
    * user take screenshot "user-register-successfully"
