package com.bugshooters.pages;

import com.bugshooters.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HandleIframePage {
    public HandleIframePage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//iframe[@id='mce_0_ifr']")
    public WebElement frameElement;
    @FindBy(xpath = "//p")
    public WebElement textBox;
    @FindBy(linkText = "Elemental Selenium")
    public WebElement seleniumText;
}
