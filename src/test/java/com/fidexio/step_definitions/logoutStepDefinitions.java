package com.fidexio.step_definitions;

import com.fidexio.pages.loginPage;
import com.fidexio.pages.logout;
import com.fidexio.utilities.ConfigurationReader;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class logoutStepDefinitions {
    logout logout=new logout();
    @Given("user is on the home page as {string}")
    public void user_is_on_the_home_page_as(String userType) {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        String username = null;
        String password= null;
        if (userType.contains("salesmanager")){
            username = ConfigurationReader.getProperty("salesmanager_username");
            password = ConfigurationReader.getProperty("salesmanager_password");
        } else if (userType.contains("posmanager")) {
       username = ConfigurationReader.getProperty("posmanager_username");
       password = ConfigurationReader.getProperty("posmanager_password");
        }
new loginPage().login(username,password);

    }

    @When("user clicks posmanager section right top of the page")
    public void user_clicks_posmanager_section_right_top_of_the_page() {
        logout.userbutton.click();

    }
    @When("user clicks log out button from bottom of the section")
    public void user_clicks_log_out_button_from_bottom_of_the_section() {
logout.logoutbutton.click();
    }
    @Then("user successfully logged out from the page")
    public void user_successfully_logged_out_from_the_page() {
        Assert.assertEquals("Login | Best solution for startups","Login | Best solution for startups");
    }

    @When("user clicks salesmanager section right top of the page")
    public void user_clicks_salesmanager_section_right_top_of_the_page() {
logout.userbutton.click();
    }

    @Given("user logged out successfully as a {string}")
    public void user_logged_out_successfully_as_a(String userType) {
      Assert.assertEquals("Login | Best solution for startups","Login | Best solution for startups");
    }
    @When("user clicks step back button")
    public void user_clicks_step_back_button() {
        Driver.getDriver().navigate().back();
    }
    @Then("user see session expired text")
    public void user_see_session_expired_text() {
Assert.assertEquals(Driver.getDriver().getTitle(), "Odoo");
    }

}
