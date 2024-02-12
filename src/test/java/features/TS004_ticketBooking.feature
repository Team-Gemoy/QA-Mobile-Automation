@ticketBooking
Feature: Ticket Booking

  @ticketBooking
  Scenario: As a user, I should be able to update the data in the user profile
    Given user open WeFly app
    * user is already logged in
    When user searches for flights
    * user click search button
    * user click first flight on list
    * user fills in all the required data on passenger details
    * user click Continue Order button
    * user click Verify Payment button
    Then user verifies that flight payment was successful
    * user take screenshot "ticket-booking-successfully"