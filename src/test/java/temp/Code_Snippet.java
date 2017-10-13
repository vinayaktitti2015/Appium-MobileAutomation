package temp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by vinayak on 3/10/2017.
 */

public class Code_Snippet {

    static AppiumDriver driver;

    public void testUIComputation(){

        MobileElement element1 = (MobileElement) driver.findElementByAccessibilityId("text");
        MobileElement element2 = (MobileElement) driver.findElementsByClassName("text2").get(1);

        /** they should be same size and the first should be above the second  **/
        assertTrue(element1.getLocation().getY() < element2.getLocation().getY());
        assertEquals(element1.getSize(), element2.getSize());
    }

    /*** wait cmmds ***/
    public void waitMethod(){
        new WebDriverWait(driver, 10).until(ExpectedConditions
                .elementToBeClickable(MobileBy.AccessibilityId("ContentDesc"))).click();
    }

}
