package pages;

import helpers.keyword;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LoginPage {

    public LoginPage(AppiumDriver driver) {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "com.synrgy.wefly:id/et_email")
    private static WebElement input_email;

    @FindBy(id = "com.synrgy.wefly:id/et_password")
    private static WebElement input_password;

    @FindBy(id = "com.synrgy.wefly:id/btn_login")
    private static WebElement loginButton;

    @FindBy(id = "com.synrgy.wefly:id/tv_register")
    private static WebElement signUpButton;

    @FindBy(id = "com.synrgy.wefly:id/tv_forgot_pass")
    private static WebElement forgotPasswordButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView[1]")
    private static WebElement titleLoginPage;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ImageView")
    private static WebElement weFlyIcon;

    public void inputEmail(String email) {
        keyword.inputText(input_email, email);
    }

    public void inputPassword(String password) {
        keyword.inputText(input_password, password);
    }

    public void clickLoginButton() {
        keyword.tapElement(loginButton);
    }

    public void clickLinkTextSignUp() {
        keyword.tapElement(signUpButton);
    }

    public void clickLinkTextForgotPassword() {
        keyword.tapElement(forgotPasswordButton);
    }

    public void verifyComponentLoginPage() {
        keyword.verifyElementExist(weFlyIcon);
        keyword.verifyElementExist(titleLoginPage);
        keyword.verifyElementExist(loginButton);
    }

}
