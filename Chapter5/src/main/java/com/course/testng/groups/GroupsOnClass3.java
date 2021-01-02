package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "tes")
public class GroupsOnClass3 {

    public void tes1(){
        System.out.println("public class GroupsOnClass3中的tes1在运行");
    }
    public void tes2(){
        System.out.println("public class GroupsOnClass3中的tes2在运行");
    }
}
