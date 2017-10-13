package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import stepDefinitions.Hooks;

/**
 * Created by vinayak on 14/9/2017.
 */

public class Signup_pageobjects extends Hooks {

    public Signup_pageobjects() {
        PageFactory.initElements(new AppiumFieldDecorator(driver, 1, TimeUnit.SECONDS), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Login']")
    public MobileElement login_btn;

    @AndroidFindBy(id = "net.one97.paytm:id/profile_signup")
    public MobileElement create_newacct_btn1;

    @AndroidFindBy(id = "net.one97.paytm:id/edit_mob_number")
    public AndroidElement mobile_number;

    @AndroidFindBy(id = "net.one97.paytm:id/edit_password")
    public MobileElement password_field;

    @AndroidFindBy(id = "net.one97.paytm:id/text_show")
    public MobileElement hide_btn;

    @AndroidFindBy(id = "net.one97.paytm:id/edit_email_id")
    public MobileElement email_id;

    @AndroidFindBy(id = "net.one97.paytm:id/text_optional")
    public MobileElement optional_emailtext;

    @AndroidFindBy(id = "//android.widget.TextView[@text='Terms & Conditions']")
    public MobileElement terms_conditions_link;

    @AndroidFindBy(id = "net.one97.paytm:id/sign_up_btn")
    public MobileElement create_newacct_btn2;

    /** Validation object **/
    @AndroidFindBy(id="net.one97.paytm:id/textinput_error")
    public MobileElement number_validation;

    @AndroidFindBy(id="net.one97.paytm:id/w_custom_dialog_message")
    public MobileElement custom_dialog_validation;

    @AndroidFindBy(id="net.one97.paytm:id/textinput_error")
    public MobileElement email_validation;

    @AndroidFindBy(id="net.one97.paytm:id/w_custom_dialog_btn_positive")
    public MobileElement ok_btn_custom_dialog;


    /***  functions ****/
    public void clickLogin(){
        login_btn.click();
    }

    public void clickCreateNewacctbtn1(){
        create_newacct_btn1.click();
    }

    public void enterMobileNumber(String args){
        mobile_number.click();
        mobile_number.clear();
        mobile_number.sendKeys(args);
        Assert.assertEquals(args, mobile_number.getText());
        mobile_number.replaceValue("");
    }

    public void replaceMobileNumber(String args1, String args2){
        mobile_number.clear();
        mobile_number.sendKeys(args1);
        Assert.assertEquals(args1, mobile_number.getText());

        //replace
        mobile_number.replaceValue(args2);
        Assert.assertEquals(args2, mobile_number.getText());

    }

    public void enterPassword(String args){
        password_field.clear();
        password_field.sendKeys(args);
        Assert.assertEquals(args, password_field.getText());
    }

    public void enterEmail(String args){
        email_id.clear();
        email_id.sendKeys(args);

    }


    /** validation functions **/

    public void checkNumberValidation(String args){
        Assert.assertEquals(args, number_validation.getText());
    }

    public void checkCustomDialogBoxValidation(String args){
        Assert.assertEquals(args, custom_dialog_validation.getText());
    }

    public void click_OK_btn(){
        ok_btn_custom_dialog.click();
    }


}
