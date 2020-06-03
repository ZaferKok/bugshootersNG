package com.bugshooters.pages;

import com.bugshooters.utilities.CrossDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WindowHandlePage {

    public WindowHandlePage () {
        PageFactory.initElements(CrossDriver.getDriver(), this);
    }
    @FindBy(xpath = "//h3")
    public WebElement text;
    @FindBy(xpath = "//a[@href='/windows/new']")
    public WebElement button;
}
