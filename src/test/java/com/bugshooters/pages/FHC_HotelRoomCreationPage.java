package com.bugshooters.pages;

import com.bugshooters.utilities.AllPages;
import com.bugshooters.utilities.ConfigReader;
import com.bugshooters.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sun.awt.windows.ThemeReader;

public class FHC_HotelRoomCreationPage {
    public FHC_HotelRoomCreationPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    AllPages allPages = new AllPages();

    @FindBy(xpath = "//input[@name='UserName']")
    public WebElement username;
    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginBtn;
    @FindBy(xpath = "(//*[.='List Of Hotelrooms'])[2]")
    public WebElement listOfHotelRooms;
    @FindBy (xpath = "//span[@class='hidden-480']")
    public WebElement addHotelRooms;
    @FindBy (xpath = "//div[@class='caption']")
    public WebElement createHotelRoomText;
    @FindBy (id = "IDHotel")
    public WebElement dropDownIDHotel;
    @FindBy(id = "Code")
    public WebElement code;
    @FindBy(id = "Name")
    public WebElement name;
    @FindBy(xpath = "//div[@id='cke_1_contents']//textarea")
    public WebElement description;
    @FindBy(xpath = "//input[@title='Price']")
    public WebElement target;
    @FindBy(xpath = "//li[@data-id='700']")
    public WebElement source;
    @FindBy(id = "IDGroupRoomType")
    public WebElement roomType;
    @FindBy(id = "MaxAdultCount")
    public WebElement maxAdult;
    @FindBy(id = "MaxChildCount")
    public WebElement maxChildren;
    @FindBy(id = "IsAvailable")
    public WebElement approve;
    @FindBy(id = "btnSubmit")
    public WebElement save;
    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement text;
    @FindBy(xpath = "(//button[@type='button'])[6]")
    public WebElement okBtn;
    @FindBy(xpath = "//a[@href='/admin/HotelRoomAdmin']")
    public WebElement hotelRoomBtn;
    @FindBy(id = "lkpHotels")
    public WebElement IDHotelList;

    public void login() {
        allPages.fhc_hotelRoomCreationPage().username.sendKeys(ConfigReader.getProperty("valid_username"));
        allPages.fhc_hotelRoomCreationPage().password.sendKeys(ConfigReader.getProperty("valid_password"));
        allPages.fhc_hotelRoomCreationPage().loginBtn.click();
    }
}
