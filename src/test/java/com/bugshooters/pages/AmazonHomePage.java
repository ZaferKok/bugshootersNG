package com.bugshooters.pages;

import com.bugshooters.utilities.CrossDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {

    public AmazonHomePage(){
        PageFactory.initElements(CrossDriver.getDriver(), this);
    }
    @FindBy (id = "searchDropdownBox")
    public WebElement drop;
}
