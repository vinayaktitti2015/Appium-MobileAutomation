package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.Signup_pageobjects;

/**
 * Created by vinayak on 13/9/2017.
 */

public class SignUp_stepdefs {

    WebDriver driver;
    public Signup_pageobjects page;


    public SignUp_stepdefs() {
        this.driver = Hooks.driver;
        page = new Signup_pageobjects();
    }

    @Given("^user is on application homepage$")
    public void user_is_on_application_homepage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        utils.Assertion.checkElementExist("Here is your new Paytm Payments Bank");
    }

    @When("^user selects \"([^\"]*)\"$")
    public void user_selects(String args) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//*[@text='" + args + "']")).click();
    }

    @Given("^user clicks on login icon$")
    public void user_clicks_on_login_icon() throws Throwable {
        page.clickLogin();
    }

    @When("^user click on create a new account button1$")
    public void user_click_on_create_a_new_account() throws Throwable {
        page.clickCreateNewacctbtn1();
    }

    @When("^user enters mobile number \"([^\"]*)\"$")
    public void user_enters_mobile_number(String arg1) throws Throwable {
        page.enterMobileNumber(arg1);
    }

    @Then("^user enters mobile number \"([^\"]*)\" and replace with \"([^\"]*)\"$")
    public void should_replace_value(String args1, String args2) {

        page.replaceMobileNumber(args1, args2);
    }

    @When("^user enters password \"([^\"]*)\"$")
    public void user_enters_password(String arg1) throws Throwable {
        page.enterPassword(arg1);
    }

    @When("^user click on create new account button2$")
    public void user_click_on_create_new_account() throws Throwable {
        page.create_newacct_btn2.click();
    }

    @Then("^validation of mobile number should be \"([^\"]*)\"$")
    public void should_display_mobile_validation_message(String args) {
        page.checkNumberValidation(args);
    }

    @Then("^The validation message should be \"([^\"]*)\"$")
    public void should_show_validation(String args) {
        page.checkCustomDialogBoxValidation(args);
    }

    @Then("user click Ok button$")
    public void should_click_OK_button() {
        page.click_OK_btn();
    }

    @Then("^user clicks on hide button$")
    public void user_clicks_on_hide_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^password should hide$")
    public void password_should_hide() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^user clicks on show button$")
    public void user_clicks_on_show_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^password should show$")
    public void password_should_show() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


}
