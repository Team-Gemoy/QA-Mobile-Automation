package steps;

import factories.driverManager;
import helpers.randomData;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.listFlightPage;

public class ticketBookingStep {

    private HomePage getHomePage() {
        return new HomePage(driverManager.getInstance().getDriver());
    }
    private listFlightPage getlistFlightPage() {
        return new listFlightPage(driverManager.getInstance().getDriver());
    }


    @When("user searches for flights")
    public void searchFlight() {
        getHomePage().inputDepartureDate(randomData.getDateNow());
    }

    @And("user click search button")
    public void clickSearchButton() {
        getHomePage().clickSearch();
    }

    @And("user click first flight on list")
    public void clickFlightOnList() {
        getlistFlightPage().tapFlightOnList();
    }

    @And("user fills in all the required data on passenger details")
    public void fillInAllDataPassengerDetails() {
        getlistFlightPage().inputPassengerDetails(randomData.getFirstName(), randomData.getLastName(), randomData.getDate(), randomData.getNationality());
    }

    @And("user click Continue Order button")
    public void clickContinueButton() {
        getlistFlightPage().tapContinueOrderButton();
    }

    @And("user click Verify Payment button")
    public void clickVerifyButton() {
        getlistFlightPage().tapVerifyPaymentButton();
    }

    @Then("user verifies that flight payment was successful")
    public void paymentSuccess() {
        getlistFlightPage().verifyPaymentSuccess();
    }

}


