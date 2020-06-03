package com.bugshooters.tests;

import com.bugshooters.utulities.AllPages;
import com.bugshooters.utulities.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class B_6_HandleIframe extends TestBase {
    AllPages allPages = new AllPages();
    @Test
    public void iframeTest(){
        driver.get("https://the-internet.herokuapp.com/iframe");
        System.out.println(driver.findElement(By.xpath("//h3")).getText());
        // 1. WebElement ile
        //driver.switchTo().frame(allPages.handleIframePage().frameElement);
        // 2. Index
        //driver.switchTo().frame(0);
        // 3. Id
        driver.switchTo().frame("mce_0_ifr");
        allPages.handleIframePage().textBox.clear();
        allPages.handleIframePage().textBox.sendKeys("Hello World");
        driver.switchTo().defaultContent();

        System.out.println(allPages.handleIframePage().seleniumText.getText());

    }
}

//print the text on the parent iframe
//I will not get exception when locating below line, because that is not inside the iframe
//Trying to type in the box
//WebElement textBox=driver.findElement(By.xpath("//p"));//This Fails
//IF YOUR CODE FAILS WHAT DO YOU DO?
//1.checking of the webelement is correct
//2.checking if i have wait problem
//3.then check the page if you have some iframe
//I HAVE IFRAME ON THE PAGE. SO I HAVE TO SWITCH TO THAT IFRAME FIRST
//THERE ARE 3 WAYS TO SWITCH TO AN IFRAME:1.index,2.id,3.webelement
//driver.switchTo().frame(0);//switching to the first iframe using index
//driver.switchTo().frame("mce_0_ifr");//switching to the first iframe using ID Value
// now i can find the element that is inside this iframe
