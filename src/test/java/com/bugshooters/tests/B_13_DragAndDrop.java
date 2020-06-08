package com.bugshooters.tests;

import com.bugshooters.utilities.AllPages;
import com.bugshooters.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class B_13_DragAndDrop extends TestBase {

    AllPages allPages = new AllPages();

    @Test
    public void dragAndDrop() throws InterruptedException {
        driver.get("http://www.fhctrip.com/Account/LogOn?ReturnUrl=%2Fadmin%2FHotelRoomAdmin");//http://www.fhctrip.com/admin/HotelRoomAdmin
        allPages.fhc_hotelRoomCreationPage().login();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(text(),'List Of Hotelrooms')])[3]")));
        allPages.fhc_hotelRoomCreationPage().addHotelRooms.click();
        Assert.assertTrue(allPages.fhc_hotelRoomCreationPage().createHotelRoomText.isDisplayed());

        Select select = new Select(allPages.fhc_hotelRoomCreationPage().dropDownIDHotel);

//        List<WebElement> dropDownList = select.getOptions();
//        for (WebElement element : dropDownList){
//            System.out.println(element.getText());
//        }

        select.selectByIndex(3);

        allPages.fhc_hotelRoomCreationPage().code.sendKeys("111");
        allPages.fhc_hotelRoomCreationPage().name.sendKeys("Kral");
        allPages.fhc_hotelRoomCreationPage().description.sendKeys("This room is only for Royal families");

        Thread.sleep(2000);

        Actions actions = new Actions(driver);
        actions.dragAndDrop(allPages.fhc_hotelRoomCreationPage().source, allPages.fhc_hotelRoomCreationPage().target).perform();

        Select select1= new Select(allPages.fhc_hotelRoomCreationPage().roomType);
        select1.selectByIndex(6);

        allPages.fhc_hotelRoomCreationPage().maxAdult.sendKeys("2");
        allPages.fhc_hotelRoomCreationPage().maxChildren.sendKeys("3");
        allPages.fhc_hotelRoomCreationPage().approve.click();
        Thread.sleep(1000);
        allPages.fhc_hotelRoomCreationPage().save.click();

        Thread.sleep(2000);

        boolean isTrue=wait.until(ExpectedConditions.textToBe(By.xpath("//div[@class='bootbox-body']"),"HotelRoom was inserted successfully"));
        Assert.assertTrue(isTrue);
        allPages.fhc_hotelRoomCreationPage().okBtn.click();


        WebElement hotelRoomsLink=wait.until(ExpectedConditions.elementToBeClickable(allPages.fhc_hotelRoomCreationPage().hotelRoomBtn));
        Thread.sleep(3000);
        actions.doubleClick(hotelRoomsLink).perform();

        Thread.sleep(5000);

        Assert.assertTrue(allPages.fhc_hotelRoomCreationPage().listOfHotelRooms.isDisplayed());

        Select select2 = new Select(allPages.fhc_hotelRoomCreationPage().IDHotelList);
        List<WebElement> allOptions = select2.getOptions();
        boolean flag = false;
        for (WebElement element : allOptions){
            if (element.getText().equals("Thousand Hotel")){
                flag = true;
                break;
            }
        }Assert.assertTrue(flag);
    }
}
