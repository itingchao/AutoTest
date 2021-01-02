package com.course.testng.params;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParmeterTest {
    @Test
    @Parameters({"name","age"})
    public void paramTest1(String name, String age){
        System.out.println("name" + name +"age" + age);
    }
}
