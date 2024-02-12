package pages;

import helpers.keyword;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class ForgotPasswordPage {

    protected AppiumDriver appiumDriver;

    public ForgotPasswordPage(AppiumDriver driver) {
        this.appiumDriver = driver;
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView[1]")
    private static WebElement titleForgotPasswordPage;

    @FindBy(id = "com.synrgy.wefly:id/et_email")
    private static WebElement inputEmail;

    @FindBy(id = "com.synrgy.wefly:id/btn_reset")
    private static WebElement resetButton;

    @FindBy(id = "com.synrgy.wefly:id/pin_main")
    private static WebElement otpField;

    @FindBy(id = "com.synrgy.wefly:id/btn_continue")
    private static WebElement continueButton;

    @FindBy(id = "com.synrgy.wefly:id/et_password")
    private static WebElement inputPassword;

    @FindBy(id = "com.synrgy.wefly:id/et_new_pass")
    private static WebElement inputNewPassword;


    public void fillInEmail(String email){
        keyword.inputText(inputEmail, email);
    }

    public void clickResetButton() {
        keyword.tapElement(resetButton);
        keyword.waitFor(2);
    }

    public void inputOTP(String otp) {
        keyword.inputText(otpField, otp);
    }

    public void clickContinueButton() {
        keyword.tapElement(continueButton);
        keyword.waitFor(1);
    }

    public void fillInAllData(String email, String password1, String password2) {
        keyword.inputText(inputEmail, email);
        keyword.inputText(inputPassword, password1);
        keyword.inputText(inputNewPassword, password2);
    }

    public void verifyComponentOnForgotPassword() {
        keyword.verifyWordingOnElement(titleForgotPasswordPage, "FORGOT PASSWORD?");
    }








}
