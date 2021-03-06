package com.bugshooters.pages;

import com.bugshooters.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestAddressBookPage {

    public TestAddressBookPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "session_email")
    public WebElement emailBox;

    @FindBy (id = "session_password")
    public WebElement passwordBox;

    @FindBy (name = "commit")
    public WebElement signInButton;

    @FindBy (xpath = "//h1")
    public WebElement welcomeMessage;

    @FindBy (className = "navbar-text")
    public WebElement mailID;
}
