package temp;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import stepDefinitions.Hooks;
import utils.Generic_Library;

/**
 * Created by vinayak on 25/9/2017.
 */

public class tempScroll extends Hooks{

    public static void scrollDirection(String direction) throws InterruptedException {
        Dimension size;
        size = driver.manage().window().getSize();

        // Find swipe start and end point from screen's width and height
        // Find starty point which is at bototm side of screen.
        int starty = (int) (size.height * 0.80);

        // Find endy point which is at top side of screen
        int endy = (int) (size.height * 0.20);

        // Find horizontal point to swipe. [middle of screen width]
        int startx = size.width / 2;
        System.out.println("starty = " + starty + "endy = " + endy + "startx = " + startx);

        if (direction.equalsIgnoreCase("down")) {
            // swipe from top to bottom
            //driver.swipe(startx, starty, startx, endy, 15000);
            Generic_Library.sleep();
        } else if (direction.equalsIgnoreCase("up")) {

            //driver.swipe(startx, starty, startx, endy, 3000);
        }
    }

    public static void swipingVertical(String ScrollType, String ele) throws InterruptedException {
        // Get the size of screen.
        Dimension size;
        boolean flag = false;
        size = driver.manage().window().getSize();
        System.out.println(size);
        WebDriverWait wait = new WebDriverWait(driver, 1);
        // Find swipe start and end point from screen's with and height.
        // Find starty point which is at bottom side of screen.
        int starty = (int) (size.height * 0.80);
        // Find endy point which is at top side of screen.
        int endy = (int) (size.height * 0.20);
        // Find horizontal point where you wants to swipe. It is in middle of
        // screen width.
        int startx = size.width / 2;
        System.out.println("starty = " + starty + " ,endy = " + endy + " , startx = " + startx);

        if (ScrollType.equalsIgnoreCase("down"))
        // Swipe from Bottom to Top.
        {
            while (!flag) {
                //driver.swipe(startx, starty, startx, endy, 3000);
                try {
                    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ele)));

                    flag = true;
                } catch (Exception e) {
                    flag = false;
                    System.out.println("Element is not found, scrolling again");
                }
                // Thread.sleep(2000);
            }
        }
        // Swipe from Top to Bottom.
        else if (ScrollType.equalsIgnoreCase("up")) {
            //driver.swipe(startx, endy, startx, starty, 3000);
            Thread.sleep(2000);
        }
    }

    public static void scrollDirection(String direction, int duration) {
        Dimension size;
        size = driver.manage().window().getSize();
        System.out.println(size);

        // Find swipe start and end point from screen's with and height.
        // Find starty point which is at bottom side of screen.
        int starty = (int) (size.height * 0.80);
        // Find endy point which is at top side of screen.
        int endy = (int) (size.height * 0.20);
        // Find horizontal point where you wants to swipe. It is in middle of
        // screen width.
        int startx = size.width / 2;
        System.out.println("starty = " + starty + " ,endy = " + endy + " , startx = " + startx);

        if (direction.equalsIgnoreCase("down"))
        // Swipe from Bottom to Top.
        {
            for (int i = 1; i < duration; i++) {
                //driver.swipe(startx, starty, startx, endy, 15000);
            }
            // Thread.sleep(2000);
        }
        // Swipe from Top to Bottom.
        else if (direction.equalsIgnoreCase("up")) {
            //driver.swipe(startx, endy, startx, starty, 3000);
        }
    }


}
