package pageObjects;

import org.openqa.selenium.WebDriver;

import io.appium.java_client.android.AndroidDriver;

/**
 * Created by vinayak on 21/9/2017.
 */

public class BasePage {

    protected WebDriver driver;

    public BasePage(AndroidDriver driver) {

        this.driver = driver;
    }
}
