@updateProfile
Feature: Update Profile

  @updateProfile
  Scenario: As a user, I should be able to update the data in the user profile
    Given user open WeFly app
    * user is already logged in
    * user navigate to edit profile page
    When user edits data on the edit profile page
    * user click Done button
    Then user successfully updates profile