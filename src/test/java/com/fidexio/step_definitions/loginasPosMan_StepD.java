package com.fidexio.step_definitions;

import com.fidexio.pages.loginPage;
import com.fidexio.utilities.ConfigurationReader;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class loginasPosMan_StepD {
    loginPage logPage = new loginPage();
    @Given("User is on the fidexio login page")
    public void user_is_on_the_fidexio_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
    @When("User types {string} username")
    public void user_types_username(String string) {
        logPage.usernamebar.sendKeys(string);
    }
    @When("User types {string} password")
    public void user_types_password(String string) {
        logPage.passwordBar.sendKeys(string);
    }
    @When("User clicks login button")
    public void user_clicks_login_button() {
        logPage.loginButton.click();
    }
    @Then("User lands on the home page {string}")
    public void user_lands_on_the_home_page(String string) {
        Assert.assertEquals("#Inbox - Odoo","#Inbox - Odoo");
    }
    @When("User types {string} invalid username")
    public void user_types_invalid_username(String string) {
        logPage.usernamebar.sendKeys(string);

    }
    @When("User types {string} invalid password")
    public void user_types_invalid_password(String string) {
        logPage.passwordBar.sendKeys(string);


    }
    @Then("User see the wrong mail or password message")
    public void user_see_the_wrong_mail_or_password_message() {
        Assert.assertTrue(logPage.WrongLoginAlert.getText().equals("Wrong login/password"));
    }

    @When("User types {string} just username")
    public void user_types_just_username(String string) {
        logPage.usernamebar.sendKeys(string);

    }
    @When("User types {string} just password")
    public void user_types_just_password(String string) {
        logPage.passwordBar.sendKeys(string);

    }

    @Then("User see the please fille out this field message after password or username is empty")
    public void user_see_the_please_fille_out_this_field_message_after_password_or_username_is_empty() {
        System.out.println(logPage.requiredMessage.getAttribute("required"));
    }

    @When("user types {string} to password blank")
    public void user_types_to_password_blank(String string) {
    logPage.passwordBar.sendKeys(string);
    }

    @Then("user see bullet sign by default")
    public void user_see_bullet_sign_by_default() {
        Assert.assertTrue(logPage.bulletPassword.getAttribute("type").equals("password"));
    }
    @When("User types valid {string}")
    public void user_types_valid(String string) {
       logPage.usernamebar.sendKeys(string);
    }
    @When("User types valid {string} and press the Enter key")
    public void user_types_valid_and_press_the_enter_key(String string) {
        logPage.passwordBar.sendKeys(string+Keys.ENTER);

    }

    @Then("User see Enter keyword working correctly on the login page")
    public void user_see_enter_keyword_working_correctly_on_the_login_page() {
        Assert.assertEquals("#Inbox - Odoo","#Inbox - Odoo");

    }

}

