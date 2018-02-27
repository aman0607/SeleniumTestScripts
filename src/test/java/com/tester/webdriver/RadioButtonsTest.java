package com.tester.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by asingh on 12/21/17.
 */
public class RadioButtonsTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "/Users/asingh/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();

        driver.get("http://echoecho.com/htmlforms10.htm");

        //code for handling Radio Buttons
        driver.findElement(By.xpath("//input[@value='Milk']")).click();
        //to get the count within a group of radio buttons use .size method but it only works with findelements not findelement
        System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).size());

        //create a for loop to iterate through the group so we can index the item in case we don't find a radio button by value or other keys

        int count = driver.findElements(By.xpath("//input[@name='group1']")).size();

        for (int i = 0; i < count; i++) {

            // .get() method gets the index location
            // driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();

            System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value"));

            String text = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");

            if (text.equals("Cheese")) {

                driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
            }

        }


    }

}
