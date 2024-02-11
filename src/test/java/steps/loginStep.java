package steps;

import factories.driverManager;
import helpers.keyword;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;

public class loginStep {

    private LoginPage getLoginPage() {
        return new LoginPage(driverManager.getInstance().getDriver());
    }
    private HomePage getHomePage() {
        return new HomePage(driverManager.getInstance().getDriver());
    }
    private AccountPage getAccountPage() {
        return new AccountPage(driverManager.getInstance().getDriver());
    }


    @When("user input valid email")
    public void inputEmail() {
        getLoginPage().inputEmail("miyali4273@bitofee.com");
    }

    @And("user input correct password")
    public void inputPassword() {
        getLoginPage().inputPassword("P@ssw0rd123");
    }

    @Then("user click Login button")
    public void clickLoginButton() {
        getLoginPage().clickLoginButton();
        keyword.waitFor(2);
    }

    @Then("user login successfully")
    public void userLoginSuccessfully() {
        getHomePage().clickAccountButton();
        getAccountPage().verifyLoginSuccessfully();
    }

    @When("user click Logout button")
    public void userClickLogoutButton() {
        getAccountPage().clickLogout();
    }

    @Then("user logout successfully")
    public void logoutSuccessfully() {
        getLoginPage().verifyComponentLoginPage();
    }

}
