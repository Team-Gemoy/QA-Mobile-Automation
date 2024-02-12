package pages;

import helpers.keyword;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class AccountPage {
    protected AppiumDriver appiumDriver;

    public AccountPage(AppiumDriver driver) {
        this.appiumDriver = driver;
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "com.synrgy.wefly:id/tv_title")
    private static WebElement titleProfilePage;

    @FindBy(id = "com.synrgy.wefly:id/btn_logout")
    private static WebElement logoutButton;

    @FindBy(id = "com.synrgy.wefly:id/btn_edit")
    private static WebElement editButton;


    public void verifyLoginSuccessfully() {
        keyword.verifyWordingOnElement(titleProfilePage,"Account Profile");
        keyword.verifyElementExist(logoutButton);
    }

    public void clickLogout() {
        keyword.tapElement(logoutButton);
    }

    public void clickEdit() {
        keyword.tapElement(editButton);
    }


}
