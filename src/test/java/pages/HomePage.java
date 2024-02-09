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


    public void clickAccountButton() {
        keyword.tapElement(accountButton);
        keyword.waitFor(3);
    }

    public void verifySearchButtonExist() {
        keyword.verifyElementExist(searchFlightButton);
    }

}
