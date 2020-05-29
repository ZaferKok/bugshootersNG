package com.bugshooters.tests;

import com.bugshooters.utulities.AllPages;
import com.bugshooters.utulities.CrossDriver;
import com.bugshooters.utulities.TestBase;
import org.testng.annotations.Test;

public class B_4_Soft_Hard_Assertion extends TestBase {
    //    When user goes to http://a.testaddressbook.com/sign_in
    //    Locate the elements of email textbox,password textbox, and signin button
    //    Enter below username and password then click sign in button
    //    Username :  testtechproed@gmail.com
    //    Password : Test1234!
    //    Then Assert/
    //    Verify that the expected user id  testtechproed@gmail.com using different assertions
    @Test
    public void login(){
        CrossDriver.getDriver().get("http://a.testaddressbook.com/sign_in");
        AllPages allPages = new AllPages();
        allPages.testAddressBookPage().emailBox.sendKeys("testtechproed@gmail.com");
        allPages.testAddressBookPage().passwordBox.sendKeys("Test1234!");
        allPages.testAddressBookPage().signInButton.click();
    }

}
