package com.bugshooters.tests;

import com.bugshooters.utilities.AllPages;
import com.bugshooters.utilities.Driver;
import com.bugshooters.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class B_12_EnableTest extends TestBase {

    AllPages allPages = new AllPages();

    @Test
    public void isEnabledTest(){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        allPages.enablePage().enableDisableButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
        boolean isEnabled = allPages.enablePage().textBox.isEnabled();
        Assert.assertTrue(isEnabled);
    }
}
