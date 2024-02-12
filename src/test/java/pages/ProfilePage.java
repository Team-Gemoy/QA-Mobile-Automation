package pages;

import helpers.keyword;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class ProfilePage {

    public ProfilePage(AppiumDriver driver) {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "com.synrgy.wefly:id/et_full_name")
    private static WebElement inputFullname;

    @FindBy(id = "com.synrgy.wefly:id/et_gender")
    private static WebElement selectGender;

    @FindBy(id = "com.synrgy.wefly:id/et_city")
    private static WebElement inputCity;

    @FindBy(id = "com.synrgy.wefly:id/et_date_of_birth")
    private static WebElement inputDate;

    @FindBy(id = "com.synrgy.wefly:id/et_phone_number")
    private static WebElement inputPhonenumber;

    @FindBy(id = "com.synrgy.wefly:id/btn_edit")
    private static WebElement submitButton;

    public void doEdit(String fullname, String gender, String city, String date, String phonenumber) {
        keyword.inputText(inputFullname, fullname);
        keyword.inputText(selectGender, gender);
        keyword.inputText(inputCity, city);
        keyword.inputText(inputDate, date);
        keyword.inputText(inputPhonenumber, phonenumber);
    }

    public void clickDoneButton() {
        keyword.tapElement(submitButton);
    }

}
