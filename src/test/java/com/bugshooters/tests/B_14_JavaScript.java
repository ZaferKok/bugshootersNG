package com.bugshooters.tests;

import com.bugshooters.utilities.AllPages;
import com.bugshooters.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.List;

public class B_14_JavaScript extends TestBase {

    AllPages allPages = new AllPages();
    @Test
    public void tessss() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/windows");
        Thread.sleep(3000);
        ((JavascriptExecutor)driver).executeScript("alert('WARNING: This is a useless message');");
        Thread.sleep(5000);

        //How to find all links in the page?
        //List<WebElement> list = driver.findElements(By.tagName("a"));
        //for (WebElement element: list) {
        //    System.out.println(element);
        //}

        //Actions actions = new Actions(driver);
        //actions.dragAndDrop(allPages.fhc_hotelRoomCreationPage().source, allPages.fhc_hotelRoomCreationPage().target).perform();
        //actions.clickAndHold(allPages.fhc_hotelRoomCreationPage().source).moveToElement(allPages.fhc_hotelRoomCreationPage().target).release().build().perform();

//        if(driver.findElements(By.xpath("(//a[@target=\"_blank\"])[2]")).size() != 0){
//            System.out.println("Element is Present");
//        }else{
//            System.out.println("Element is Absent");}
        }

        @Test
        public void test2() throws InterruptedException {
            driver.get("https://www.amazon.com");
            WebElement dropdownList = driver.findElement(By.id("searchDropdownBox"));
            System.out.println(dropdownList.getText());
            //dropdownList.stream().map(t->t.getText()).forEach(System.out::print);

            //System.out.println("=====>>>"+dropdownList.toArray()[2].toString());
//            WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
//
//            dropdown.click();
//            Thread.sleep(3000);
//            WebElement element = driver.findElement(By.xpath("//option[@value=\"search-alias=instant-video\"]"));
//            element.click();
//            Thread.sleep(5000);
            System.out.println("Abuzer");

            System.out.println("cihan");

    }
}
