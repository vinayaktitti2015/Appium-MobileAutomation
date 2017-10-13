package utils;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

/**
 * Created by vinayak on 14/9/2017.
 */

public class SharedDriver {

    private static AppiumDriver _driver;

    public void setUp_method1() throws MalformedURLException {

        File platform = new File(System.getProperty("os.name"));
        //or
        //platform = android or ios

        if (platform.equals("")) {
           // _driver = new AndroidDriver(new URL(), "");
        } else {
            // _driver = new IOSDriver(new URL(), "");
        }

    }

    private boolean isTargetAndroid(){
        return true;
    }


    public void setup2(){
        AppiumServiceBuilder builder = new AppiumServiceBuilder().usingAnyFreePort();
        AppiumDriverLocalService service = AppiumDriverLocalService.buildService(builder);
        service.start();
        AppiumDriver driver = (isTargetAndroid())? getAndroidDriver(service.getUrl(), false, true) : getIOSDriver(service.getUrl(), false, true);
    }

    public static AppiumDriver getAndroidDriver(URL appiumUrl, boolean fullReset, boolean noReset) {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "**TBD**");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "**TBD**");
        capabilities.setCapability(MobileCapabilityType.APP, appiumUrl);
        capabilities.setCapability(AndroidMobileCapabilityType.NO_SIGN,true);
        capabilities.setCapability(AndroidMobileCapabilityType.UNICODE_KEYBOARD,true); //set unicodekeyboard in order to support umlauts
        capabilities.setCapability(AndroidMobileCapabilityType.RESET_KEYBOARD,true); //reset keyboard after tests
        capabilities.setCapability(AndroidMobileCapabilityType.IGNORE_UNIMPORTANT_VIEWS,true); //speeds up tests, as views that are not important i.e. for accessiblity are not shown on android. Is disabled on demand in tests using driver.ignoreunimporantViews


        //note that setting appPackage and appActivity is not necessary starting from API level 19 (i.e. 4.4) as it is automatically detected
        //should not be necessary anymore, but detected default is omg.abc.SplashActivity which is never shown on certain flavours of the app
        capabilities.setCapability(AndroidMobileCapabilityType.APP_WAIT_ACTIVITY, "omg.abc.android.bdf.MainActivity");

        //only on simulator;
//        if(simOrEmulator) {
//            capabilities.setCapability("language", language);
//        }

        if (fullReset) {
            capabilities.setCapability("fullReset", fullReset);
        }
        if (noReset) {
            capabilities.setCapability("noReset", noReset);
        }

        return new AndroidDriver(appiumUrl,capabilities);
    }

    public static AppiumDriver getIOSDriver(URL appiumUrl, boolean fullReset, boolean noReset) {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.3");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6");
        capabilities.setCapability(MobileCapabilityType.APP, appiumUrl);
        capabilities.setCapability("bundleId", "**TBD**"); //todo set from script

        //only on simulator;
//        if(simOrEmulator) {
//            capabilities.setCapability("language", language);
//        }

        capabilities.setCapability("locationServicesAuthorized", true);
        capabilities.setCapability("locationServicesEnabled", true);
        capabilities.setCapability("autoAcceptAlerts", true);

        if (fullReset) {
            capabilities.setCapability("fullReset", fullReset);
        }
        if (noReset) {
            capabilities.setCapability("noReset", noReset);
        }
        return new IOSDriver(appiumUrl,capabilities);
    }


}
