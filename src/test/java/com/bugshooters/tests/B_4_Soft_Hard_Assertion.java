package com.bugshooters.tests;

import com.bugshooters.utulities.AllPages;
import com.bugshooters.utulities.CrossDriver;
import com.bugshooters.utulities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class B_4_Soft_Hard_Assertion extends TestBase {
    //    When user goes to http://a.testaddressbook.com/sign_in
    //    Locate the elements of email textbox,password textbox, and signin button
    //    Enter below username and password then click sign in button
    //    Username :  testtechproed@gmail.com
    //    Password : Test1234!
    //    Then Assert/
    //    Verify that the expected user id  testtechproed@gmail.com using different assertions

    AllPages allPages = new AllPages();

    @Test
    public void login(){
        driver.get("http://a.testaddressbook.com/sign_in");

        allPages.testAddressBookPage().emailBox.sendKeys("testtechproed@gmail.com");
        allPages.testAddressBookPage().passwordBox.sendKeys("Test1234!");
        allPages.testAddressBookPage().signInButton.click();
    }
    @Test (dependsOnMethods = "login")
    public void softAssertion (){

        // HARD ASSERTION
        String actual = allPages.testAddressBookPage().welcomeMessage.getText();
        String expected = "Welcome to Address Book";
        Assert.assertEquals(actual, expected);

        // SOFT ASSERTION
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(allPages.testAddressBookPage().welcomeMessage.getText(), "Welcome to Address Book");
        softAssert.assertEquals(allPages.testAddressBookPage().mailID.getText(), "testtechproed@gmail.com");
        softAssert.assertEquals(3,5); // Fail ama assertAll yazılmazsa pass olur!!
        softAssert.assertAll(); // Gercek manada assertion bu komut ile calisiyor. Yazilmaz ise fail olsa bile pass verir.
    }
}
