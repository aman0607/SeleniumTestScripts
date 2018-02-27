package com.tester.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

/**
 * Created by asingh on 1/3/18.
 */
public class calendarTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "/Users/asingh/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();

        driver.get("http://path2usa.com/travel-companions");

        driver.findElement(By.xpath("//*[@id='travel_date']")).click();

        //select August 23rd

        List<WebElement> dates = driver.findElements(By.className(".day"));

        int count = driver.findElements(By.className(".day")).size();



        }





    }





