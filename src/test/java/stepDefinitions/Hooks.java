package stepDefinitions;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.testng.annotations.Listeners;

import java.io.File;
import java.io.IOException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import sharedDriver.BaseCrossPlatformDriver;
import config.Constants;
import config.ReadProperty;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServerHasNotBeenStartedLocallyException;
import utils.ScreenshotUtility;

/**
 * Created by vinayak on 13/9/2017.
 */

//@Listeners({ScreenshotUtility.class})
public class Hooks {

    public static AndroidDriver<AndroidElement> driver;
    public static AppiumDriverLocalService service;

    @Before
    public static void init() throws Exception {
        service = AppiumDriverLocalService.buildDefaultService();
        service.start();

        if (service == null || !service.isRunning()) {
            throw new AppiumServerHasNotBeenStartedLocallyException("An Appium server node is not started");
        }

        if (ReadProperty.getKey("TargetPlatform").equalsIgnoreCase("ios")){
            BaseCrossPlatformDriver.iOSCaps();
        } else if (ReadProperty.getKey("TargetPlatform").equalsIgnoreCase("android")){
            BaseCrossPlatformDriver.androidCaps();
        }

    }



    @After
    public static void tearDown(Scenario scenario) {

        System.out.println("After Method Execution Starts");
        if (scenario.isFailed()) {
            // screenshot emded
            try {
                scenario.write("Current Page is " + driver.getAutomationName());
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            } catch (WebDriverException e) {
                System.err.println(e.getMessage());
            }

            // custom screenshot
            try {
                File file = driver.getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(file, new File(Constants.screenshotpath + scenario.getName() + ".png"));
                System.out.println("Screenshot taken for" + scenario.getName() + "test case");
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }

        if (driver != null) {
            driver.quit();
        }
        if (service != null) {
            service.stop();
        }
    }

}
