package com.bugshooters.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class TestBase {

    protected WebDriver driver;

    @Parameters ("browser")
    @BeforeMethod (alwaysRun = true)
    public void setup (@Optional String browser){
        driver = CrossDriver.getDriver(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown(){
        //CrossDriver.closeDriver();
    }
}
