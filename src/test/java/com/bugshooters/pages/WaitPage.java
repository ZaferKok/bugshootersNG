package com.bugshooters.pages;

import com.bugshooters.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WaitPage {
    public WaitPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//button[@type='button']")
    public WebElement removeButton;
    @FindBy (id = "message")
    public WebElement goneMessage;
}
