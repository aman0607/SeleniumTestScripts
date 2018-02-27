package com.tester.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * Created by asingh on 12/18/17.
 */
public class SafariTest {

    public static void main(String[] args) {

        WebDriver driver = new SafariDriver();
        driver.get("https://facebook.com");
        System.out.println(driver.getPageSource());



    }



}
