package utils;

import org.openqa.selenium.By;
import org.testng.Assert;

import stepDefinitions.Hooks;

/**
 * Created by vinayak on 19/9/2017.
 */

public class Assertion extends Hooks {

    public static void checkElementExist(String args){
        Boolean isElementExist = driver.findElements(By.xpath("//*[@text='"+args+"']")).size()!=0;
        Assert.assertTrue(isElementExist, "Expected element not found on screen: " + args);
    }
}
