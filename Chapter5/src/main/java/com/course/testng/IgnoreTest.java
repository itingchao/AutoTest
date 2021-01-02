package com.course.testng;

import org.testng.annotations.Test;

public class IgnoreTest {
    @Test
    public void test01(){
        System.out.println("忽略的方法");
    }

    @Test(enabled = false)
    public void test02(){
        System.out.println("test02忽略的方法");
    }

    @Test(enabled = true)
    public void test03(){
        System.out.println("test03忽略的方法");
    }

}
