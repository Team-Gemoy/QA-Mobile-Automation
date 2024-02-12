package pages;

import helpers.keyword;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class HomePage {

    protected AppiumDriver appiumDriver;

    public HomePage(AppiumDriver driver) {
        this.appiumDriver = driver;
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Account\"]/android.widget.FrameLayout/android.widget.ImageView")
    private static WebElement accountButton;

    @FindBy(id = "com.synrgy.wefly:id/btn_search_flight")
    private static WebElement searchFlightButton;

    @FindBy(id = "com.synrgy.wefly:id/et_date_departure")
    private static WebElement departureDate;


    public void clickAccountButton() {
        keyword.tapElement(accountButton);
        keyword.waitFor(2);
    }

    public void verifySearchButtonExist() {
        keyword.verifyElementExist(searchFlightButton);
        keyword.waitFor(2);
    }

    public void clickSearch() {
        keyword.tapElement(searchFlightButton);
        keyword.waitFor(2);
    }

    public void inputDepartureDate(String date) {
        keyword.inputText(departureDate, date);
    }

}
