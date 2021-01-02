package com.course.testng;
import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public void TestCase1(){
        System.out.println("这是测试用例1");
    }

    @Test
    public void TestCase2(){
        System.out.println("这是测试用例2");
    }
    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("beforeMethod");
    }

    @AfterMethod
    public void AfterMethod(){
        System.out.println("afterMehod");
    }

    @AfterClass
    public void afterClass2(){
        System.out.println("类运行之后运行");
    }

    @BeforeClass
    public void beforeClass2(){
        System.out.println("类运行之前");
    }

    @BeforeSuite
    public void beforeSuitedd(){
        System.out.println("beforeSuitedddd");
    }

    @AfterSuite
    public void afterSuitd(){
        System.out.println("afterSuitdfd");
    }
}
