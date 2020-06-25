package com.bugshooters.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listen.class)
public class Listner {
    @Test
    public void test1(){
        System.out.println("Test 1");
    }
    @Test
    public void test2(){
        System.out.println("Test2");
    }
}
