package com.tester.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by asingh on 12/14/17.
 */
public class ChromeTest {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "/Users/asingh/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
        driver.findElement(By.id("email")).sendKeys("This is my first code");


    }
}
