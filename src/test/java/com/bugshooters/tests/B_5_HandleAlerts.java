package com.bugshooters.tests;

import com.bugshooters.utulities.AllPages;
import com.bugshooters.utulities.TestBase;
import com.google.gson.internal.bind.util.ISO8601Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class B_5_HandleAlerts extends TestBase {

    /* Create 3 methods
        1. acceptAlert    2. dismissAlert    3. sendKeysAlert
    Go to https://the-internet.herokuapp.com/javascript_alerts */

    AllPages allPages = new AllPages();

    @Test
    public void testCase1() {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        allPages.handleAlertsPage().clickbutton1.click();
        driver.switchTo().alert().accept();
        Assert.assertTrue(allPages.handleAlertsPage().resultmessage.isDisplayed());
    }
    @Test
    public void testCase2() {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        allPages.handleAlertsPage().clickButton2.click();
        driver.switchTo().alert().dismiss();
        String expectedResultMessage="You clicked: Cancel";
        Assert.assertEquals(allPages.handleAlertsPage().resultmessage2.getText(),expectedResultMessage);
    }
    @Test
    public void testCase3() {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        allPages.handleAlertsPage().clickButton3.click();
        driver.switchTo().alert().sendKeys("Ahmet");
        driver.switchTo().alert().accept();
        String expectedResultMessagelast="You entered: Ahmet";
        Assert.assertEquals(allPages.handleAlertsPage().resultmessage3.getText(),expectedResultMessagelast);
    }
}
