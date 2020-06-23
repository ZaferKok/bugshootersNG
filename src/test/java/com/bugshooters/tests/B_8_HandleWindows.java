package com.bugshooters.tests;

import com.bugshooters.utilities.AllPages;
import com.bugshooters.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class B_8_HandleWindows extends TestBase {

    AllPages allPages = new AllPages();

    @Test
    public void windowHandle() {
        driver.get("https://the-internet.herokuapp.com/windows");
        Assert.assertEquals(allPages.windowHandlePage().text.getText(), "Opening a new window");
        Assert.assertEquals(driver.getTitle(), "The Internet");
        allPages.windowHandlePage().button.click();
        String parentWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();

        // 1. Way => For each loop: When you click a link in the parent page
//        for (String handle: allWindows) {
//            if (!handle.equals(parentWindow)){
//                driver.switchTo().window(handle);
//            }
//        }

        // 2. Way => toArray() method: When you want to open a new tab with new address or when you click a link in the parent page
        driver.switchTo().window(allWindows.toArray()[1].toString());
        System.out.println(driver.getTitle());


        Assert.assertEquals(driver.getTitle(), "New Window");
        driver.switchTo().window(parentWindow);
        Assert.assertEquals(allPages.windowHandlePage().text.getText(), "Opening a new window");


        // How you can open a new tab with together new address? Answer: By using JavascriptExecutor
        ((JavascriptExecutor) driver).executeScript("window.open('https://www.amazon.com/','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://www.google.com/','_blank');");
        // New tabs are added end of the set and get the last index
        Set<String> tabs = driver.getWindowHandles();

        for (int i = 0; i < tabs.size(); i++) {
            driver.switchTo().window(tabs.toArray()[i].toString());
            System.out.println(i + ". window ==> " + driver.getTitle());

        }

        driver.switchTo().window(tabs.toArray()[2].toString());
        //How to find all links in the page?
        List<WebElement> list = driver.findElements(By.tagName("a"));
        list.stream().map(t -> t.getText()).forEach(System.out::println);

//        for (WebElement element: list) {
//            System.out.println(element.getText());
//            }
    }
}
