package pages;

import helpers.keyword;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class RegisterPage {

    public RegisterPage(AppiumDriver driver) {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView[1]")
    private static WebElement titleregisterPage;

    @FindBy(id = "com.synrgy.wefly:id/et_email")
    private static WebElement inputEmail;

    @FindBy(id = "com.synrgy.wefly:id/et_fullname")
    private static WebElement inputFullname;

    @FindBy(id = "com.synrgy.wefly:id/et_phone_number")
    private static WebElement inputPhoneNumber;

    @FindBy(id = "com.synrgy.wefly:id/et_password")
    private static WebElement inputPassword;

    @FindBy(id = "com.synrgy.wefly:id/btn_sign_up")
    private static WebElement signUpButton;

    @FindBy(id = "com.synrgy.wefly:id/et_date_of_birth")
    private static WebElement inputDateOfBirth;

    @FindBy(id = "android:id/button1")
    private static WebElement OKbuttonOnCalender;

    public void fillAllRequiredData(String email, String fullname,String date, String phonenumber, String password) {
        keyword.inputText(inputEmail, email);
        keyword.inputText(inputFullname, fullname);
        keyword.inputText(inputDateOfBirth, date);
        keyword.inputText(inputPhoneNumber, phonenumber);
        keyword.inputText(inputPassword, password);
    }

    public void tapSignUpButton() {
        keyword.tapElement(signUpButton);
        keyword.waitFor(2);
    }

    public void verifyComponentOnRegisterPage() {
        keyword.verifyWordingOnElement(titleregisterPage, "Register Now !");
        keyword.verifyElementExist(signUpButton);
    }
}
