package steps;

import factories.driverManager;
import helpers.randomData;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

public class registerStep {
    private LoginPage getLoginPage() {
        return new LoginPage(driverManager.getInstance().getDriver());
    }
    private HomePage getHomePage() {
        return new HomePage(driverManager.getInstance().getDriver());
    }
    private AccountPage getAccountPage() {
        return new AccountPage(driverManager.getInstance().getDriver());
    }
    private RegisterPage getRegisterPage() {
        return new RegisterPage(driverManager.getInstance().getDriver());
    }


    @When("user fills in all the required data on the registration page")
    public void fillAllData() {
        getRegisterPage().fillAllRequiredData(randomData.getEmail(), randomData.getFullname(), "08435263472", "P@ssw0rd123");
    }

    @And("user click Sign Up button")
    public void clickSignUp() {
        getRegisterPage().tapSignUpButton();
        getLoginPage().verifyComponentLoginPage();
    }

    @And("user navigate to Register page")
    public void navigateToRegisterPage(){
        getHomePage().clickAccountButton();
        getLoginPage().verifyComponentLoginPage();
        getLoginPage().clickSignUp();
        getRegisterPage().verifyComponentOnRegisterPage();
    }
}
