@forgotPassword
Feature: Forgot Password

  @forgotPassword
  Scenario: As a user, I should be able to reset my password
    Given user open WeFly app
    * user navigate to Forgot Password page
    When user fill in email
    * user click Reset button
    * user fill in otp code
    * user click Continue button
    * user fill in all required data on forgot password page
    * user click Reset button
    Then user update password successfully
    * user take screenshot "forgot-password-successfully"