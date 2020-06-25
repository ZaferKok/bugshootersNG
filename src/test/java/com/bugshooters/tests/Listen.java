package com.bugshooters.tests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import javax.sound.midi.Soundbank;

public class Listen implements ITestListener {

    /**
     * Invoked each time before a test will be invoked. The <code>ITestResult</code> is only partially
     * filled with the references to class, method, start millis and status.
     *
     * @param result the partially filled <code>ITestResult</code>
     * @see ITestResult#STARTED
     */
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test started" + result.getName());
    }

    /**
     * Invoked before running all the test methods belonging to the classes inside the &lt;test&gt; tag
     * and calling all their Configuration methods.
     *
     * @param context
     */


    /**
     * Invoked each time before a test will be invoked. The <code>ITestResult</code> is only partially
     * filled with the references to class, method, start millis and status.
     *
     * @param result the partially filled <code>ITestResult</code>
     * @see ITestResult#STARTED
     */
    /**
     * Invoked after all the test methods belonging to the classes inside the &lt;test&gt; tag have run
     * and all their Configuration methods have been called.
     *
     * @param context
     */
    /**
     * Invoked each time a test succeeds.
     *
     * @param result <code>ITestResult</code> containing information about the run test
     * @see ITestResult#SUCCESS
     */
    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test success" + result.getName());
    }
}
