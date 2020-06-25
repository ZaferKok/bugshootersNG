package com.bugshooters.utilities;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

    protected WebDriver driver;
    protected Actions actions;

    @Parameters ("browser")
    @BeforeMethod (alwaysRun = true)
    public void setup (@Optional String browser){
        //Dimension d = new Dimension(1024, 768);
        driver = Driver.getDriver(browser);
        //driver.manage().window().setSize(d);
        driver.manage().window().maximize();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("startmaximized");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        actions = new Actions(driver);


    }

    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }
}
