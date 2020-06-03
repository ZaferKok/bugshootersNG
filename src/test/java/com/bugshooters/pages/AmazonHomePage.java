package com.bugshooters.pages;

import com.bugshooters.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {

    public AmazonHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (id = "searchDropdownBox")
    public WebElement drop;
    @FindBy(xpath = "(//span[@class='nav-text'])[9]")
    public WebElement yourAccount;
    @FindBy(xpath = "//span[text()='Hello, Sign in']")
    public WebElement signInBox;
    @FindBy (id = "nav-link-prime")
    public WebElement primeTry;
    @FindBy (xpath = "//div[@class='pin-nav-bottom-img']")
    public WebElement primePicture;

}
