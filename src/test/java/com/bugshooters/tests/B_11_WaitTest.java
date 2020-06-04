package com.bugshooters.tests;

import com.bugshooters.utilities.AllPages;
import com.bugshooters.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class B_11_WaitTest extends TestBase {

    AllPages allPages = new AllPages();

    @Test
    public void implicitWait(){

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        allPages.waitPage().removeButton.click();
        String expectedMessage = "It's gone!";
        Assert.assertEquals(allPages.waitPage().goneMessage.getText(),expectedMessage);
    }
    @Test
    public void explicitWait(){

        WebDriverWait wait=new WebDriverWait(driver,10);
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        allPages.waitPage().removeButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
        String expectedMessage = "It's gone!";
        Assert.assertEquals(allPages.waitPage().goneMessage.getText(),expectedMessage);
    }
}
