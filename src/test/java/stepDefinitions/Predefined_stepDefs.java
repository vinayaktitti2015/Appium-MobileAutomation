package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.IOException;
import java.util.List;

import config.ReadProperty;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.Connection;
import utils.Generic_Library;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by vinayak on 18/9/2017.
 */

public class Predefined_stepDefs {

    AndroidDriver driver;

    public Predefined_stepDefs() {
        this.driver = Hooks.driver;
    }

    /*** wait step defs ***/

    @Then("^user wait for few seconds$")
    public void user_should_wait_for_fewseconds() throws InterruptedException {
        Generic_Library.sleep();
    }

    /**** Element Exist step defs*****/

    @Then("^user should see \"([^\"]*)\"$")
    public void user_should_see(String args) throws Throwable {
        Boolean isElementExist = driver.findElements(By.xpath("//*[@text='" + args + "']")).size() != 0;
        Assert.assertTrue(isElementExist, "Expected Text not found on screen>>> " + args);
    }

    @Then("^The text \"([^\"]*)\" should be visible$")
    public void should_display_Text(String args) {
        assertNotEquals(0, driver.getAppStringMap(args));
    }

    @Then("^user should not see \"([^\"]*)\"$")
    public void user_should_not_see(String args) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        List<WebElement> elements = driver.findElements(By.xpath("//android.widget.TextView[@text='" + args + "']"));

        boolean isElementExist = elements.isEmpty();
        if (!isElementExist) {
            throw new Exception("Targeted Element should not display, But found on screen>>> " + args);
        }
    }

    /***  Keyboard Actions ***/
    @Then("^user hide keyboard$")
    public void user_hide_keyboard() {
        Generic_Library.hideKeyboard();
    }

    @Then("^user navigate back$")
    public void pressKeyBack() {
        Generic_Library.pressKeyBack();
    }


    /**** Tap Actions ****/
    @When("^user taps on \"([^\"]*)\"$")
    public void user_taps_on(String args) throws Throwable {
        WebElement element = driver.findElement(By.xpath("//android.widget.TextView[@text='" + args + "']"));

        boolean isElementExist = element.isDisplayed();
        if (isElementExist) {
            element.click();
        } else {
            throw new ElementNotInteractableException("Expected Element Not Clickable on Screen:>>> " + args);
        }
    }


    /**** swipe functions ****/
    @Then("^user swipe screen vertical$")
    public void user_swipe_screen_vertical() throws Throwable {
        Generic_Library.swipeVertical(0.9, 0.01, 0.5);
    }

    @Then("^user swipe screen horizontal$")
    public void user_swipe_screen_horizontal() throws Throwable {
        Generic_Library.swipeHorizontal(0.9, 0.1, 0.5);
    }

    @Then("^user swipe using XY co-ordinates$")
    public void user_swipe_using_XY_co_ordinates() throws Throwable {
        Generic_Library.swipeUsingXYCoordinates();
    }

    @Then("^user swipe using javascript$")
    public void user_swipe_using_javascript() {
        Generic_Library.swipeUsingJavascript();
    }

    @Then("^user swipe from 1st Element to 2nd Element$")
    public void user_swipe_from_1stElement_To_2ndElement() {
        Generic_Library.swipeFrom1stElementTo2ndElement(driver.findElements(By.id("net.one97.paytm:id/item_image")), 7, 0);
    }

    @Then("^user swipe from \"([^\"]*)\" to \"([^\"]*)\"$")
    public void user_should_swipe_using_elements(String args1, String args2) throws Throwable {
        AndroidElement element1 = (AndroidElement) driver.findElement(By.xpath("//*[@text='" + args1 + "']"));
        AndroidElement element2 = (AndroidElement) driver.findElement(By.xpath("//*[@text='" + args2 + "']"));

        //Generic_Library.swipeUsingPerformTouchAction(element1, element2);
    }

    /*** Orientation function ***/
    @Then("^user rotate device into LandscapeRightRotation$")
    public void user_rotate_device_into_LandscapeRightRotation() throws Throwable {
        Generic_Library.testLandscapeRightRotation();
    }

    @Then("^user rotate device into PortraitRightRotation$")
    public void user_rotate_device_into_PortraitRightRotation() throws Throwable {
        Generic_Library.testPortraitRightRotation();
    }

    /*** Scroll functions ***/
    @Then("^user scroll to \"([^\"]*)\"$")
    public void user_scroll_toText(String args) throws Throwable {
        Generic_Library.scrollToText(args);
    }

    @Then("^user scroll to subElement$")
    public void user_scrollTo_SubElement() {
        Generic_Library.scrollToSubElement();
    }


    /****  Connection Steps ****/
    @Then("^check connection set to Wifi$")
    public void should_connect_wifi() {
        driver.setConnection(Connection.WIFI);
        assertEquals(Connection.WIFI, driver.getConnection());
    }

    @Then("^check connection set to Airplane$")
    public void should_connect_Airplane() {
        driver.setConnection(Connection.AIRPLANE);
        assertEquals(Connection.AIRPLANE, driver.getConnection());
    }

    @Then("^check connection set to All")
    public void should_connect_All() {
        driver.setConnection(Connection.ALL);
        assertEquals(Connection.ALL, driver.getConnection());
    }


    /**** Context Steps *****/
    @Then("^check Native app context$")
    public void shouldBe_NativeApp_context() {
        assertEquals("NATIVE_APP", driver.getContext());
    }

    @Then("^check WebView context$")
    public void shouldBe_WebView_context() {
        assertEquals("WEBVIEW", driver.getContext());
    }

    /**** App Test Steps ****/
    @Then("^check app installed Successfully$")
    public void should_install_app() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        assertTrue("App Not Installed", driver.isAppInstalled(ReadProperty.getKey("AppPackage")));
    }

    @Then("^check app closed Successfully$")
    public void should_close_app() throws IOException {
        driver.closeApp();
        driver.launchApp();
        assertEquals((".landingpage.activity.AJRMainActivity"), driver.currentActivity());
    }

    @Then("^check device isLocked$")
    public void should_check_appLocked() {
        driver.lockDevice();
        assertTrue("Device Not locked", driver.isLocked());
    }

    @Then("^check keyboard activity$")
    public void should_display_keyboard() {
          assertTrue("Keyboard Not Found", driver.isKeyboardShown());
    }

    @Then("^check current activity$")
    public void should_check_CurrentActivity() throws IOException {
          assertEquals(ReadProperty.getKey("AppActivity"), driver.currentActivity());
    }


}
