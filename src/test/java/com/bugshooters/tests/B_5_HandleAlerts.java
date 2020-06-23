package com.bugshooters.tests;

import com.bugshooters.utilities.AllPages;
import com.bugshooters.utilities.TestBase;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class B_5_HandleAlerts extends TestBase {

    /* Create 3 methods
        1. acceptAlert    2. dismissAlert    3. sendKeysAlert   4.getText()
    Go to https://the-internet.herokuapp.com/javascript_alerts */

    AllPages allPages = new AllPages();
    WebDriverWait wait;


    @Test
    public void testCase1() {
        wait = new WebDriverWait(driver, 10);
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        allPages.handleAlertsPage().clickbutton1.click();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        wait.until(ExpectedConditions.visibilityOf(allPages.handleAlertsPage().resultmessage));
        Assert.assertTrue(allPages.handleAlertsPage().resultmessage.isDisplayed());
    }
    @Test
    public void testCase2() throws InterruptedException {
        wait = new WebDriverWait(driver, 10);
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        allPages.handleAlertsPage().clickButton2.click();
        wait.until(ExpectedConditions.alertIsPresent());
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();
        wait.until(ExpectedConditions.visibilityOf(allPages.handleAlertsPage().resultmessage2));
        String expectedResultMessage="You clicked: Cancel";
        System.out.println(allPages.handleAlertsPage().resultmessage2.getAttribute("outerText"));
        Assert.assertEquals(allPages.handleAlertsPage().resultmessage2.getText(),expectedResultMessage);
    }
    @Test
    public void testCase3() throws InterruptedException {
        wait = new WebDriverWait(driver, 10);
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        allPages.handleAlertsPage().clickButton3.click();
        wait.until(ExpectedConditions.alertIsPresent());
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("Ahmet");
        driver.switchTo().alert().accept();
        wait.until(ExpectedConditions.visibilityOf(allPages.handleAlertsPage().resultmessage3));
        String expectedResultMessagelast="You entered: Ahmet";
        Assert.assertEquals(allPages.handleAlertsPage().resultmessage3.getText(),expectedResultMessagelast);

    }
}
