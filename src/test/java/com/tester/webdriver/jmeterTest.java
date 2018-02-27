package com.tester.webdriver;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by asingh on 1/24/18.
 */
public class jmeterTest {

    @Test
    public void testing() {

        System.setProperty("webdriver.gecko.driver", "/Users/asingh/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();

        driver.get("http://ebay.com");
        System.out.println(driver.getTitle());

    }



}
