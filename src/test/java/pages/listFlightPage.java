package pages;

import helpers.enums.direction;
import helpers.keyword;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class listFlightPage {

    protected AppiumDriver appiumDriver;

    public listFlightPage(AppiumDriver driver) {
        this.appiumDriver = driver;
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.LinearLayout")
    private static WebElement firstFlighOnList;

    @FindBy(id = "com.synrgy.wefly:id/et_first_name")
    private static WebElement inputFirstName;

    @FindBy(id = "com.synrgy.wefly:id/et_last_name")
    private static WebElement inputLastName;

    @FindBy(id = "com.synrgy.wefly:id/et_date_of_birth_passenger")
    private static WebElement inputDate;

    @FindBy(id = "com.synrgy.wefly:id/et_nationality_passenger")
    private static WebElement inputNationality;

    @FindBy(id = "com.synrgy.wefly:id/btn_order")
    private static WebElement continueOrderButton;

    @FindBy(id = "com.synrgy.wefly:id/btn_verify")
    private static WebElement verifyPaymentButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
    private static WebElement verifyPaymentSuccess;

    public void verifyPaymentSuccess() {
        keyword.verifyWordingOnElement(verifyPaymentSuccess, "Payment Success!");
    }

    public void tapFlightOnList() {
        keyword.tapElement(firstFlighOnList);
        keyword.waitFor(1);
    }

    public void inputPassengerDetails(String firstname, String lastname, String date, String nationality) {
        keyword.inputText(inputFirstName, firstname);
        keyword.inputText(inputLastName, lastname);
        keyword.inputText(inputDate, date);
        keyword.inputText(inputNationality, nationality);
    }

    public void tapContinueOrderButton() {
        keyword.swipe(direction.UP);
        keyword.waitFor(2);
        keyword.tapElement(continueOrderButton);
        keyword.waitFor(1);
    }

    public void tapVerifyPaymentButton() {
        keyword.tapElement(verifyPaymentButton);
        keyword.waitFor(1);
    }

}
