package com.bugshooters.tests;

import com.bugshooters.utilities.AllPages;
import com.bugshooters.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class B_7_Actions extends TestBase {
//    Create a class: ActionsClassExample
//    Create a test method : contextClickMethod() and test the following scenario:
//    Given user is on the https://the-internet.herokuapp.com/context_menu
//    When use Right clicks on the box
//    Then verify the alert message is “You selected a context menu”
//    Then accept the alert

    AllPages allPages = new AllPages();
    @Test
    public void contextClickMethod() {
        driver.get("https://the-internet.herokuapp.com/context_menu");
        actions.contextClick(allPages.actionsPage().rectangle).perform();
        String actualText = driver.switchTo().alert().getText();
        String expectedText = "You selected a context menu";
        Assert.assertEquals(actualText, expectedText);
        driver.switchTo().alert().accept();
        WebElement elementalSeleniumText = driver.findElement(By.xpath("//a[@target='_blank']"));
        actions.contextClick(elementalSeleniumText).perform(); // Ama olmadı!!!!!!!

    }
    @Test
    public void hoverOver() {
        /* Create another test method : hoverOver() and test the following scenario:
        Given user is on the https://www.amazon.com/
        When use click on “Your Account” link
        Then verify the page title contains “Your Account” */

        driver.get("https://www.amazon.ca/");
        // no need for ==> Actions actions = new Actions(driver); Because it is created in TestBase Class
        actions.moveToElement(allPages.amazonHomePage().signInBox).perform();
        allPages.amazonHomePage().yourAccount.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1")));
        String actualTitle = driver.getTitle();
        String expetedTitle = "Your Account";
        System.out.println("Title :" + actualTitle);
        Assert.assertTrue(actualTitle.contains(expetedTitle));
    }

    @Test
    public void imageTest(){
        driver.get("https://www.amazon.ca/");
        actions.moveToElement(allPages.amazonHomePage().primeTry).perform();
        Assert.assertTrue(allPages.amazonHomePage().primePicture.isDisplayed());
    }

//    Create a method in the same class: keysUpDown()
//    Go to google
//    Search for IPHONE X PRICES (all capital)
//    And double click on the text box
    @Test
    public void keysUpDown(){
        driver.get("https://www.google.com/");
//  METHOD 1 TO SEND UPPER CASE:
        allPages.googlePage().searchBox.sendKeys(Keys.SHIFT+"iphone x prices", Keys.ENTER);

//  METHOD 2 : ACTIONS CLASS :using Keys.Shift we are pressing shift key on the keyboard
//        actions.
//                moveToElement(allPages.googlePage().searchBox).
//                click().
//                keyDown(Keys.SHIFT).
//                sendKeys("iphone x prices").
//                perform();
//  METHOD 2 : using the actions object
//        actions.
//                keyDown(searchBox, Keys.SHIFT).
//                sendKeys("iphone x prices").
//                keyUp(searchBox,Keys.SHIFT).
//                perform();

//        actions.doubleClick(allPages.googlePage().searchBox).perform();
    }

    @Test
    public void scrollUpDown() throws InterruptedException {
        driver.get("https://www.amazon.com/");
        Thread.sleep(1000);
        //Scrolling down the page
        actions.sendKeys(Keys.PAGE_DOWN).perform(); // 1 page down
        Thread.sleep(1000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1000);
        //ARROW_DOWN also scrolls down the page, but it scroll less amount
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(1000);
        actions.sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(1000);
        //Scroll Up A Page using sendKeys(Keys.PAGE_UP)
        actions.sendKeys(Keys.ARROW_UP).perform();
        Thread.sleep(1000);
        //Scroll Down to end of the page
        actions.sendKeys(Keys.END).perform();
    }
}
