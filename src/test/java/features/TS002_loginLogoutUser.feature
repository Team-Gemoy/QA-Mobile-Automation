@loginLogout
Feature: Login User

  @loginLogout
  Scenario: As a user, I should be able to log in using correct registered data on WeFly
    Given user open WeFly app
    * user navigate to Login page
    When user input valid email
    * user input correct password
    * user click Login button
    Then user login successfully
    * user take screenshot "user-login-successfully"
    When user click Logout button
    Then user logout successfully
    * user take screenshot "user-logout-successfully"