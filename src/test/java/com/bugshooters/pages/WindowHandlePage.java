package com.bugshooters.pages;

import com.bugshooters.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WindowHandlePage {

    public WindowHandlePage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//h3")
    public WebElement text;
    @FindBy(xpath = "//a[@href='/windows/new']")
    public WebElement button;
}
