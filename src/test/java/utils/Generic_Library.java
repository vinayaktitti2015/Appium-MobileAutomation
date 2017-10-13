package utils;

import cucumber.api.java.eo.Do;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.functions.ActionSupplier;
import stepDefinitions.Hooks;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by vinayak on 11/2/2017.
 */
public class Generic_Library extends Hooks {


    public static void sleep() throws InterruptedException {
        Thread.sleep(1000);
    }

    public static void sleep(long duration) throws InterruptedException {
        Thread.sleep(duration);
    }

    public void toggle() {
        if (driver instanceof AndroidDriver) {
            ((AndroidDriver) driver).toggleLocationServices();
        } else {
            // do ios action
        }
    }


    public static void tapByListElements(String LocatorType, String locatorValue, int index) {
        switch (LocatorType) {
            case "id":
                List<AndroidElement> list = driver.findElements(By.id(locatorValue));
                list.get(index).click();
                break;
            case "className":
                List<AndroidElement> list1 = driver.findElements(By.className(locatorValue));
                list1.get(index).click();
                break;
        }
    }

    /*** Touch Actions ***/
    public static void singleTap(MobileElement element) {
        TouchActions action = new TouchActions(driver).singleTap(element);
        action.perform();

        // other actions below
        /**
         action.release();
         action.longPress(element);
         action.clickAndHold();
         **/
    }

    public static void multiTouch(MobileElement element1, MobileElement element2) {
        TouchAction action1 = new TouchAction(driver).tap(element1);
        TouchAction action2 = new TouchAction(driver).tap(element2);

        /** MultiTouchAction().add(action0).add(action1).perform(); **/
    }

    /*** Keyboard Actions ***/
    public static void hideKeyboard() {
        try {
            driver.hideKeyboard();
        } catch (Exception e) {
            System.out.println("Keyboard is not present");
        }
    }

    public static void backSpaceKeyEvent(){
        Map<String, Object> BackSpaceKeyEvent = new HashMap<String, Object>();
        BackSpaceKeyEvent.put("key", "67");
        driver.executeScript("mobile:key:event", BackSpaceKeyEvent);
    }

    public static void enterKeyEvent(){
        Map<String, Object> KeyEvent = new HashMap<String, Object>();
        KeyEvent.put("key", "66");
        driver.executeScript("mobile:key:event", KeyEvent);
    }

    public static void pressKeyBack(){
        driver.pressKeyCode(AndroidKeyCode.BACK);
    }


    /**** Swipe functions ***/
    public static void swipeVertical(double startPercentage, double finalPercentage, double anchorPercentage) throws InterruptedException {
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.width * anchorPercentage);
        int startPoint = (int) (size.height * startPercentage);
        int endPoint = (int) (size.height * finalPercentage);
        new TouchAction(driver).press(anchor, startPoint).moveTo(0, endPoint - startPoint).release().perform();
    }

    public static void swipeVerticalUsingElement(AndroidElement element){
        Dimension size = element.getSize();
        TouchAction action = new TouchAction(driver).press(element, size.width/2, size.height -20)
                .waitAction(Duration.ofSeconds(2)).moveTo(element, size.width/2, size.height/ 2+50).release();
        action.perform();
    }

    public static void swipeHorizontal(double startPercentage, double finalPercentage, double anchorPercentage) {
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.width * anchorPercentage);
        int startPoint = (int) (size.height * startPercentage);
        int endPoint = (int) (size.height * finalPercentage);
        new TouchAction(driver).press(startPoint, anchor).moveTo(endPoint - startPoint, 0).release().perform();
    }


    public static void swipeUsingJavascript() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap<String, Integer> swipeElement = new HashMap<String, Integer>();

        Dimension size = driver.manage().window().getSize();
        int width = size.getWidth();
        int height = size.getHeight();
        int startX = size.width/2;
        int startY = (int) (height*0.80);
        int endY = (int) (height*0.20);
        int duration = 2000;

        swipeElement.put("startY", startY);
        swipeElement.put("endY", endY);
        swipeElement.put("startX", startX);
        swipeElement.put("duration", duration);

        js.executeScript("mobile:scroll", swipeElement);
    }

    public static void swipeUsingPerformTouchAction(AndroidElement element) {
        driver.performTouchAction(new TouchAction(driver).press(element)
                .moveTo(0, element.getLocation().getY()).release().perform());
    }

    public static void swipeUsingElements(WebElement element1, WebElement element2) {
        TouchAction action = new TouchAction(driver);
        action.press(element1).waitAction(Duration.ofSeconds(2)).moveTo(element2).release();
    }

    public static void swipeUsingXYCoordinates() throws InterruptedException {
        TouchAction action = new TouchAction(driver);
        action.press(100, 100).waitAction(Duration.ofSeconds(3)).moveTo(200, 200).release().perform();
    }


    /**** Scroll functions ***/
    public static void scrollUsingJavascript(String args) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap<String, String> scrollObject = new HashMap<String, String>();
        scrollObject.put("direction", args);
        js.executeScript("mobile:scroll", scrollObject);
    }

    public static void scrollToSubElement(){
        MobileElement list = (MobileElement) driver.findElement(By.id("net.one97.paytm:id/item_name"));
        MobileElement text = list.findElement(MobileBy
                .AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
                        + "new UiSelector().text(\"iPhone 8\"));"));
        assertNotNull("Landline text not found: ", text.getLocation());
    }

    public static MobileElement scrollToText(String text){
        return (MobileElement) driver.findElement(MobileBy
                .AndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".scrollable(true)).scrollIntoView(resourceId(\"android:id/list\")).scrollIntoView("
                        + "new UiSelector().text(\""+text+"\"))"));

    }

    /*** Drag & Drop function ***/
    public static void dragNDropByLongpress(WebElement element1, WebElement element2) {
        TouchAction dragNDrop = new TouchAction(driver).longPress(element1).moveTo(element2).release();
        dragNDrop.perform();
    }

    public static void dragNDropByCoordinatesTest(AndroidElement element1, AndroidElement element2) {
        Point center1 = element1.getCenter();
        Point center2 = element2.getCenter();
        TouchAction action = new TouchAction(driver).longPress(center1.x, center1.y).moveTo(center2.x, center2.y).release();
        action.perform();
    }

    public static void swipeFrom1stElementTo2ndElement(List<WebElement> element, int start, int end){
        List<WebElement> list = element;
        WebElement src = list.get(start);
        WebElement dest = list.get(end);
        TouchAction action = new TouchAction(driver).longPress(src).moveTo(dest).release().perform();
    }

    /*** Orientation ***/
    public static void testLandscapeRightRotation() {
        DeviceRotation rotation = new DeviceRotation(0, 0, 90);
        driver.rotate(rotation);
        assertEquals(driver.rotation(), rotation);
    }

    public static void testPortraitRightRotation() {
        DeviceRotation rotation = new DeviceRotation(0, 0, 180);
        driver.rotate(rotation);
        assertEquals(driver.rotation(), rotation);
    }

    /*** Handle Toast Message ***/
    public static void handleToastMessage(MobileElement element, String args) {
        final WebDriverWait wait = new WebDriverWait(driver, 10);

        element.click();
        assertNotNull(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text=' " + args + "']"))));
    }


    /*** Supplier ***/




}
