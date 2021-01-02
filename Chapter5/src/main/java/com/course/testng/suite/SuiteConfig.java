package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite1(){
        System.out.println("suitej即将运行了");
    }

    @AfterSuite
    public void afterSuite1(){
        System.out.println("suite运行完成啦");
    }
}
