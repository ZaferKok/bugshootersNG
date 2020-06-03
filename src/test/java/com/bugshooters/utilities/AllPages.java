package com.bugshooters.utilities;

import com.bugshooters.pages.*;

public class AllPages {

    public AllPages(){

    }

    private AmazonHomePage amazonHomePage;
    private TestAddressBookPage testAddressBookPage;
    private WindowHandlePage windowHandlePage;
    private HandleAlertsPage handleAlertsPage;
    private HandleIframePage handleIframePage;
    private ActionsPage actionsPage;
    private GooglePage googlePage;

    public GooglePage googlePage() {
        if (googlePage == null) {
            googlePage = new GooglePage();
        }return googlePage;
    }

    public ActionsPage actionsPage (){
        if (actionsPage == null){
            actionsPage = new ActionsPage();
        }
        return actionsPage;
    }

    public HandleIframePage handleIframePage(){
        if (handleIframePage == null){
            handleIframePage = new HandleIframePage();
        }
        return handleIframePage;
    }

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
