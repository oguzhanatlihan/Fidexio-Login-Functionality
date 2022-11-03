package com.fidexio.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.fidexio.utilities.Driver.getDriver;


public class loginPage {

    public loginPage () {
        PageFactory.initElements(getDriver(),this);
    }


    @FindBy(xpath = "//input[@type='text']")
public WebElement usernamebar;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordBar;

    @FindBy(xpath = "//button[.='Log in']")
    public WebElement loginButton;

    @FindBy(xpath = "//p[@class='alert alert-danger']")
    public WebElement WrongLoginAlert;

    @FindBy(xpath = "//input[@required='required']")
    public WebElement requiredMessage;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement bulletPassword;

    public void login(String usernameStr, String passwordStr) {
        usernamebar.sendKeys(usernameStr);
        passwordBar.sendKeys(passwordStr);
        loginButton.click();
        // verification that we logged

    }

}
