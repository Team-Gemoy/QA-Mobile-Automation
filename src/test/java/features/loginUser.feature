@login
Feature: Login

  @login
  Scenario: As a user, I should be able to log in using correct registered data on secondhand-binaracademy
    Given user open WeFly app
    * user navigate to Login page
    When user input valid email
    * user input correct password
    * user click Login button
    Then user login successfully
    * user take screenshot "user-login-successfully"