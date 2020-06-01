package com.bugshooters.tests;

import com.bugshooters.utulities.AllPages;
import com.bugshooters.utulities.CrossDriver;
import com.bugshooters.utulities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class B_8_HandleWindows extends TestBase {
    AllPages allPages = new AllPages();
    @Test
    public void windowHandle(){
        CrossDriver.getDriver().get("https://the-internet.herokuapp.com/windows");
        Assert.assertEquals(allPages.windowHandlePage().text.getText(), "Opening a new window");
        Assert.assertEquals(CrossDriver.getDriver().getTitle(), "The Internet");
        allPages.windowHandlePage().button.click();
        String parentWindow = CrossDriver.getDriver().getWindowHandle();
        Set<String> allWindows = CrossDriver.getDriver().getWindowHandles();
        for (String handle: allWindows) {
            if (!handle.equals(parentWindow)){
                CrossDriver.getDriver().switchTo().window(handle);
            }
        }
        Assert.assertEquals(CrossDriver.getDriver().getTitle(), "New Window");
        CrossDriver.getDriver().switchTo().window(parentWindow);
        Assert.assertEquals(allPages.windowHandlePage().text.getText(),"Opening a new window");
    }
}
