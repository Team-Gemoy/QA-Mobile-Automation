package steps;

import factories.driverManager;
import helpers.randomData;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountPage;
import pages.HomePage;
import pages.ProfilePage;

public class profileStep {

    private HomePage getHomePage() {
        return new HomePage(driverManager.getInstance().getDriver());
    }
    private AccountPage getAccountPage() {
        return new AccountPage(driverManager.getInstance().getDriver());
    }
    private ProfilePage getProfilePage() {
        return new ProfilePage(driverManager.getInstance().getDriver());
    }

    @And("user navigate to edit profile page")
    public void navigateEditProfilePage() {
        getHomePage().clickAccountButton();
        getAccountPage().clickEdit();
    }

    @When("user edits data on the edit profile page")
    public void doEditProfile() {
        getProfilePage().doEdit(randomData.getFullname(), randomData.getGender(), randomData.getCity(),randomData.getDate(), randomData.getPhoneNumber());
    }

    @And("user click Done button")
    public void clickEditButton() {
        getProfilePage().clickDoneButton();
    }

    @Then("user successfully updates profile")
    public void verifyUpdateProfileSuccess() {
        getAccountPage().verifyLoginSuccessfully();
    }

}
