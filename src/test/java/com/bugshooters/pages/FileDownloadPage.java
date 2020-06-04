package com.bugshooters.pages;

import com.bugshooters.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileDownloadPage {
    public FileDownloadPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (linkText = "Vladimir Boiko -1.jpg")
    public WebElement downloadLink;
//    @FindBy
//    public WebElement
}
