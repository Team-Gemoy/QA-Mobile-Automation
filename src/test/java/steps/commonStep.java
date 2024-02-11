package steps;

import factories.driverManager;
import helpers.keyword;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;


public class commonStep {
    private LoginPage getLoginPage() {
        return new LoginPage(driverManager.getInstance().getDriver());
    }
    private HomePage getHomePage() {
        return new HomePage(driverManager.getInstance().getDriver());
    }
    private AccountPage getAccountPage() {
        return new AccountPage(driverManager.getInstance().getDriver());
    }


    @Given("user open WeFly app")
    public void userOpenSwagLabsApp() {
        getHomePage().verifySearchButtonExist();
        keyword.waitFor(3);
    }

    @And("user navigate to Login page")
    public void navigateToLoginPage() {
        getHomePage().clickAccountButton();
        getLoginPage().verifyComponentLoginPage();
        keyword.waitFor(1);
    }

    @And("user take screenshot {string}")
    public void userTakeScreenshot(String screenshot) {
        keyword.takeScreenshot(screenshot);
    }
}
