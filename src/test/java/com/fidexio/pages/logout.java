package com.fidexio.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.fidexio.utilities.Driver.getDriver;

public class logout {

    public logout (){PageFactory.initElements(getDriver(),this);}

    @FindBy (xpath = "//span[@class='oe_topbar_name']")
   public WebElement userbutton;


    @FindBy (xpath = "//a[@data-menu='logout']")
    public WebElement logoutbutton;



}
