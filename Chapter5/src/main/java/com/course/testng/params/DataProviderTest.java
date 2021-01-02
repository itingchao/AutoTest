package com.course.testng.params;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testProvider(String name,String age) {
        System.out.println("name="+name+"age="+age);
    }
    @DataProvider(name="data")
    public Object[][] provider(){
        Object[][] o = new Object[][]{
                {"zhangsan","20"},
                {"wangwu","34"}
        };
        return o;
    }
    @Test(dataProvider = "methodData")
    public void test1(String name, String age){
        System.out.println("方法test1 name="+name+";age="+age);
    }
    @Test(dataProvider = "methodData")
    public void test2(String name, String age){
        System.out.println("方法test2 name="+name+";age="+age);
    }
    @DataProvider(name = "methodData")
    public Object[][] dataProvider(Method method){
        Object[][] result = null;
        if (method.getName().equals("test1")) {
            result = new Object[][]{
                    {"zhangsan","22"},
                    {"lisi","34"}
            };
        } else if (method.getName().equals("test2")){
            result = new Object[][]{
                    {"张龙","29"},
                    {"zhaohu","38"}
            };
        }
        return result;
    }
}
