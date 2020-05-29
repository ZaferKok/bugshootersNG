package com.bugshooters.utulities;

import com.bugshooters.pages.AmazonHomePage;
import com.bugshooters.pages.TestAddressBookPage;

public class AllPages {

    public AllPages(){

    }

    private AmazonHomePage amazonHomePage;
    private TestAddressBookPage testAddressBookPage;

    public AmazonHomePage amazonHomePage(){
        if (amazonHomePage == null){
            amazonHomePage = new AmazonHomePage();
        }
        return amazonHomePage;
    }
    public TestAddressBookPage testAddressBookPage(){
        if (testAddressBookPage == null){
            testAddressBookPage = new TestAddressBookPage();
        }
        return testAddressBookPage;
    }

}
