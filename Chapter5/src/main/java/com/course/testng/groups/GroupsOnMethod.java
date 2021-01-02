package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    @Test(groups = "server")
    public void test01(){
        System.out.println("这是服务端测试的方法1");
    }
    @Test(groups = "server")
    public void test02(){
        System.out.println("这是服务端测试的方法2");
    }
    @Test(groups = "client")
    public void test03(){
        System.out.println("这是客户端测试的方法3");
    }

    @Test(groups = "client")
    public void test04(){
        System.out.println("这是客户端测试的方法4");
    }
    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("这是服务端组运行之前的测试方法");
    }
    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("这是服务组运行之后的测试方法");
    }
}
