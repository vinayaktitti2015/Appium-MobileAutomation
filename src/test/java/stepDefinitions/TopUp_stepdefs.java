package stepDefinitions;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import pageObjects.TopUp_pageobjects;

/**
 * Created by vinayak on 3/10/2017.
 */

public class TopUp_stepdefs {

    AppiumDriver driver;
    public TopUp_pageobjects page;

    public TopUp_stepdefs(){
        this.driver = Hooks.driver;
        page = new TopUp_pageobjects();
    }

    @Then("^The Prepaid option should select by default$")
    public void the_Prepaid_option_should_select_by_default() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
           page.isPrepaidSelected();
    }

    @Then("^The Postpaid option should select by default$")
    public void the_Postpaid_option_should_select_by_default() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        page.isPostpaidSelected();
    }

    @Then("^user enters mobile number on mobile prepaid page \"([^\"]*)\"$")
    public void should_enter_mobile_number(String args){
           page.enterMobileNumber(args);
    }

    @When("^user enters amount \"([^\"]*)\"$")
    public void user_enters_amount(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        page.enterAmount(arg1);
    }

    @Then("^user select fastforward$")
    public void should_check_fastforward(){
        Assert.assertTrue("radiobtn already selected: ", !page.fastforward_radioBtn.isSelected());
        page.clickFFradiobtn();
    }

    @Then("^user click on current operator$")
    public void should_click_operator(){
        page.clickOperator();
    }

    @When("^click on proceed to pay button$")
    public void click_on_proceed_to_pay_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        page.clickProceedBtn();
    }
}
