package com.course.testng.multiThread;

import org.testng.annotations.Test;

public class MultiTheadOnxml {
    @Test
    public void test1(){
        System.out.printf("test1,TheadID: %s%n", Thread.currentThread().getId());
    }
    @Test
    public void test2(){
        System.out.printf("test2,TheadID: %s%n", Thread.currentThread().getId());
    }
    @Test
    public void test3(){
        System.out.printf("test3,TheadID: %s%n", Thread.currentThread().getId());
    }
    @Test
    public void test4(){
        System.out.printf("test4,TheadID: %s%n", Thread.currentThread().getId());
    }
}
