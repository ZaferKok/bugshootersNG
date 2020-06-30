package com.bugshooters.tests;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class FactoryRunner {
    @Test
    @Factory
    public Object[] testRunner(){
        Object[] tests = new Object[2];
        tests[0]= new B_2_AmazonDropdown();
        tests[1] = new B_6_HandleIframe();
        //return new Object[] {new B_2_AmazonDropdown(), new B_6_HandleIframe()};
        return tests;
    }
}
