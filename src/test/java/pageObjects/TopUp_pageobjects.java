package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import stepDefinitions.Hooks;

/**
 * Created by vinayak on 26/9/2017.
 */

public class TopUp_pageobjects extends Hooks {

    public TopUp_pageobjects() {
        PageFactory.initElements(new AppiumFieldDecorator(driver, 1, TimeUnit.SECONDS), this);
    }

    @AndroidFindBy(id= "net.one97.paytm:id/radio_prepaid")
    public MobileElement prepaid;

    @AndroidFindBy(id = "net.one97.paytm:id/radio_postpaid")
    public MobileElement postpaid;

    @AndroidFindBy(id= "net.one97.paytm:id/edit_no")
    public MobileElement mobile_number;

    @AndroidFindBy(id = "net.one97.paytm:id/contact_picker")
    public MobileElement conatct_picker;

    @AndroidFindBy(id = "android.widget.ImageButton")
    public MobileElement choose_contact_imageBtn;

    @AndroidFindBy(id = "com.android.contacts:id/menu_search")
    public MobileElement conatct_searchIcon;

    @AndroidFindBy(id= "net.one97.paytm:id/text_mob_op")
    public MobileElement current_operator;

    @AndroidFindBy(id = "net.one97.paytm:id/edit_amount")
    public MobileElement edit_amount;

    @AndroidFindBy(id= "net.one97.paytm:id/radio_fast_forward")
    public MobileElement fastforward_radioBtn;

    @AndroidFindBy(id = "net.one97.paytm:id/proceed_btn")
    public MobileElement proceed_btn;

    @AndroidFindBy(id= "net.one97.paytm:id/search_operator")
    public MobileElement search_operator;

    @AndroidFindBy(id = "net.one97.paytm:id/txt_indicative_plan")
    public MobileElement browse_plans;

    @AndroidFindBy(id= "net.one97.paytm:id/disclaimer_textview")
    public MobileElement disclaimer_message;


    public void enterMobileNumber(String args){
        mobile_number.click();
        driver.getKeyboard().sendKeys(args);
    }

    public void isPrepaidSelected(){
        Assert.assertTrue("Prepaid is Not selected by default", prepaid.isEnabled());
    }

    public void isPostpaidSelected(){
        Assert.assertTrue("Postpaid is Not selected: " , postpaid.isSelected());
    }

    public void isFastforwardSelected(){
        Assert.assertTrue("Fastforward is Not selected by default", fastforward_radioBtn.isSelected());
    }


    public void clickOperator(){
           current_operator.click();
    }

    public void enterAmount(String  args){
          edit_amount.click();
          driver.getKeyboard().sendKeys(args);
    }

    public void clickFFradiobtn(){
        fastforward_radioBtn.click();
    }

    public void clickProceedBtn(){
        proceed_btn.click();
    }






}
