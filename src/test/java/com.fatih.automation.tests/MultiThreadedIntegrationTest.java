package com.fatih.automation.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiThreadedIntegrationTest {

    @Test(threadPoolSize = 5, invocationCount = 10, timeOut = 1000)
    public void givenMethod_whenRunInThreads_thenCorrect() {
        int count = Thread.activeCount();
        Assert.assertTrue(count > 1);
    }

}
