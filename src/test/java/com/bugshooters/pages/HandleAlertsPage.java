package com.bugshooters.pages;

import com.bugshooters.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HandleAlertsPage {


   public HandleAlertsPage(){
       PageFactory.initElements(Driver.getDriver(), this);}
        @FindBy (xpath = "//button[@onclick='jsAlert()']")
        public WebElement clickbutton1;
        @FindBy (xpath = "//p[@id='result']")
        public WebElement resultmessage;
        @FindBy (xpath = "//button[@onclick='jsConfirm()']")
        public WebElement clickButton2;
        @FindBy (xpath = "//p[@id='result']")
        public WebElement resultmessage2;
        @FindBy (xpath = "//button[@onclick='jsPrompt()']")
        public WebElement clickButton3;
        @FindBy (xpath = "//*[.='You entered: Ahmet']")
        public WebElement resultmessage3;







}
