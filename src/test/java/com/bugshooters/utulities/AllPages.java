package com.bugshooters.utulities;

import com.bugshooters.pages.AmazonHomePage;
import com.bugshooters.pages.HandleAlertsPage;
import com.bugshooters.pages.TestAddressBookPage;
import com.bugshooters.pages.WindowHandlePage;

public class AllPages {

    public AllPages(){

    }

    private AmazonHomePage amazonHomePage;
    private TestAddressBookPage testAddressBookPage;
    private WindowHandlePage windowHandlePage;
    private HandleAlertsPage handleAlertsPage;

    public HandleAlertsPage handleAlertsPage(){
        if(handleAlertsPage==null){
            handleAlertsPage= new HandleAlertsPage();

        }
        return handleAlertsPage;
    }

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
    public WindowHandlePage windowHandlePage(){
        if (windowHandlePage == null){
            windowHandlePage = new WindowHandlePage();
        }
        return windowHandlePage;
    }
}
