package com.bugshooters.pages;

import com.bugshooters.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileUploadPage {
    public FileUploadPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (id = "file-upload")
    public WebElement chooseFileButton;
    @FindBy (id = "file-submit")
    public WebElement uploadButton;
    @FindBy (xpath = "//h3")
    public WebElement textMessage;

}
