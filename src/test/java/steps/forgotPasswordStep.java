package steps;

import factories.driverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountPage;
import pages.ForgotPasswordPage;
import pages.HomePage;
import pages.LoginPage;

public class forgotPasswordStep {
    private HomePage getHomePage() {
        return new HomePage(driverManager.getInstance().getDriver());
    }
    private AccountPage getAccountPage() {
        return new AccountPage(driverManager.getInstance().getDriver());
    }
    private ForgotPasswordPage getForgotPasswordPage() {
        return new ForgotPasswordPage(driverManager.getInstance().getDriver());
    }
    private LoginPage getLoginPage() {
        return new LoginPage(driverManager.getInstance().getDriver());
    }


    @And("user navigate to Forgot Password page")
    public void navigateToForgotPasswordPage() {
        getHomePage().clickAccountButton();
        getLoginPage().verifyComponentLoginPage();
        getLoginPage().clickLinkTextForgotPassword();
        getForgotPasswordPage().verifyComponentOnForgotPassword();
        }

    @When("user fill in email")
    public void fillInEmail() {
        getForgotPasswordPage().fillInEmail("50yzv2e8lq@skygazerhub.com");
    }

    @And("user click Reset button")
    public void clickResetButton() {
        getForgotPasswordPage().clickResetButton();
    }

    @And("user fill in otp code")
    public void inputOTP() {
        getForgotPasswordPage().inputOTP("1111");
    }

    @And("user click Continue button")
    public void clickContinue() {
        getForgotPasswordPage().clickContinueButton();
    }

    @And("user fill in all required data on forgot password page")
    public void fillInAllData() {
        getForgotPasswordPage().fillInAllData("50yzv2e8lq@skygazerhub.com", "P@ssw0rd123", "P@ssw0rd123");
    }

    @Then("user update password successfully")
    public void updatePasswordSuccess() {
        getForgotPasswordPage().verifyComponentOnForgotPassword();
    }

}
