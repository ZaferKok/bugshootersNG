package com.bugshooters.tests;

import org.testng.TestNG;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    @Test
    public void runner(){
        Listen listen = new Listen();
        TestNG objtestNg = new TestNG();
        List<String> suites = new ArrayList<>();
        suites.add("parallel.xml");
        objtestNg.setTestSuites(suites);
        objtestNg.addListener(listen);
        objtestNg.run();
    }
}
