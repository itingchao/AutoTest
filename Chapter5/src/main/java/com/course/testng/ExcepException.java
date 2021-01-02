package com.course.testng;

import org.testng.annotations.Test;

public class ExcepException {
    @Test(expectedExceptions = RuntimeException.class)
    public void testException(){
        System.out.println("这是一个异常的结果");
    }
    @Test(expectedExceptions = RuntimeException.class)
    public void runtimeExceptinoons(){
        System.out.println("这是一个正常的结果");
        throw new RuntimeException();
    }
}
