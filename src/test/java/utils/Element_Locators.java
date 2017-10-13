package utils;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import stepDefinitions.Hooks;

/**
 * Created by vinayak on 18/9/2017.
 */

public class Element_Locators extends Hooks{

    public void byXpath() {
        /**** by text **/
        driver.findElement(By.xpath("//*[@name=" + "text" +"]"));
        driver.findElement(By.xpath("//*[@value=" + "text" +"]"));
        driver.findElement(By.xpath("//*[contains(@name=" + "text" +")]"));
        driver.findElement(By.xpath("//android.widget.TextView[@text='value']"));
        driver.findElement(MobileBy.AccessibilityId("text/contentdesc"));

    }
}
