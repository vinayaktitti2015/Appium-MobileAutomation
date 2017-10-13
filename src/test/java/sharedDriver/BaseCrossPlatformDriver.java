package sharedDriver;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import config.ReadProperty;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import stepDefinitions.Hooks;

/**
 * Created by vinayak on 3/10/2017.
 */

public class BaseCrossPlatformDriver extends Hooks {

    public static void androidCaps() throws IOException {
        File classpathroot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathroot, "apk/");
        File app = new File(appDir, ReadProperty.getKey("ApkVersion"));

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(CapabilityType.BROWSER_NAME, "");
        caps.setCapability("deviceName", ReadProperty.getKey("DeviceName"));
        caps.setCapability("platformVersion", ReadProperty.getKey("PlatformVersion"));
        caps.setCapability("platformName", ReadProperty.getKey("TargetPlatform"));
        caps.setCapability("app", app.getAbsolutePath());

        caps.setCapability("appPackage", ReadProperty.getKey("AppPackage"));
        caps.setCapability("appActivity", ReadProperty.getKey("AppActivity"));
        caps.setCapability("noReset", true);
        caps.setCapability("fullReset", false);

        driver = new AndroidDriver<>(service.getUrl(), caps);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    public static void iOSCaps() throws MalformedURLException {
        File classpathroot = new File("E:/Documents/workspace/Paytm");
        File appDir = new File(classpathroot, "/apk/");
        File app = new File(appDir, "Paytm-net.one97.paytm-123-v6.0.0.ipa");

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(CapabilityType.BROWSER_NAME, "");
        caps.setCapability("deviceName", "Emulator");
        caps.setCapability("platformVersion", "7.1.1");
        caps.setCapability("platformName", "Android");
        caps.setCapability("app", app.getAbsolutePath());

        caps.setCapability("appPackage", "net.one97.paytm");
        caps.setCapability("appActivity", "net.one97.paytm.landingpage.activity.AJRMainActivity");
        caps.setCapability("noReset", true);
        caps.setCapability("fullReset", false);

        //driver = new IOSDriver<>(service.getUrl(), caps);
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
}
