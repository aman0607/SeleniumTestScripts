package com.tester.webdriver;

import org.testng.annotations.*;


/**
 * Created by asingh on 1/10/18.
 */
public class testNGTest {

    @BeforeTest
    public void demo(){
        System.out.println("This is first test.");
    }

    @Test(groups = {"Smoke"})
    public void demo1(){
        System.out.println("This is second test.");
    }

    @Test(groups = {"Smoke"})
    public void demo3(){
        System.out.println("I am no. 1");
    }

    @Test
    public void demo4(){
        System.out.println("I am the last one.");
    }

    @BeforeClass
    public void B4class(){
        System.out.println("This is before any class in the folder");
    }

    @BeforeMethod
    public void b4method(){
        System.out.println("This is before any method");
    }

    }




