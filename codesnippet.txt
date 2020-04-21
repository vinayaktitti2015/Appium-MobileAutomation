// Locators
By xpath = "//*[@class='android.widget.ImageView' and @index= '3']"
By xpath = "(//android.view.View[@clickable= 'True'])[1]"
By xpath = "(//android.view.View[@clickable= 'True'])[2]"
By xpath = "//android.widget.LinearLayout[1]/android.view.View[1][@clickable='True']"
By xpath = "//android.widget.ImageView[@content-desc='Value']"
AndroidElement editElement = driver
                .findElement(MobileBy
                .AndroidUIAutomator("resourceId(\"io.appium.android.apis:id/edit\")"));



// click functions on MENU item
 method 1:
JavscriptExecutor js = (JavaScriptExecutor)driver;
js.executeScript("mobile: keyevent", 82);

method 2:

HashMap swipeObject = new HashMap();
swipeObject("keycode", 82);

((JavaScriptExecutor)driver).executeScript("mobile: keyevent", swipeObject);

method 3:
driver.execute_script("mobile: keyevent", {"keycode": 82});

method 4:
driver.sendKeys(AndroidKeyCode.MENU)  OR driver.getKeyboard().sendKeys(AndroidKeys.MENU);

METHOD 5:
driver.presskeyCode(AndroidKeyCode.MENU);


