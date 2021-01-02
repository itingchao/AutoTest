package com.course.testng;

import org.testng.annotations.Test;

public class TimeOutTest {
    @Test(timeOut = 3000)
    public void timeoutSuccess() throws InterruptedException{
        System.out.println("超时");
        Thread.sleep(2000);
    }
    @Test(timeOut = 2000)
    public void timeoutFail() throws InterruptedException{
        System.out.println("超时");
        Thread.sleep(3000);
    }
}
