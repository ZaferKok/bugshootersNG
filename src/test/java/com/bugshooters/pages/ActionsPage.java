package com.bugshooters.pages;

import com.bugshooters.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActionsPage {
    public ActionsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (id = "hot-spot")
    public WebElement rectangle;
}
