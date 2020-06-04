package com.bugshooters.pages;

import com.bugshooters.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnablePage {
    public EnablePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "(//button[@type=\"button\"])[2]")
    public WebElement enableDisableButton;
    @FindBy(xpath = "//input[@type='text']")
    public WebElement textBox;
    @FindBy (id = "message")
    public  WebElement message;
}
