package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import stepDefinitions.Hooks;

/**
 * Created by vinayak on 19/9/2017.
 */

public class wait_util extends Hooks {

    public static MobileElement waitForVisibleElement(MobileElement element, int waittime){
        try{
            WebDriverWait wait = new WebDriverWait(driver, waittime);
            wait.until(ExpectedConditions.elementToBeClickable(element));
            return element;
        }catch (org.openqa.selenium.TimeoutException e){
            return null;
        }
    }

    public static void waitForPresenceOfElementLocated(By element){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(element));
    }
}
