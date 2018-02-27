package com.tester.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



/**
 * Created by asingh on 12/22/17.
 */
public class FormsTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "/Users/asingh/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.makemytrip.com");

        //isEnabled is a method to see if any element is enabled
        System.out.println(driver.findElement(By.xpath("//input[@id='hp-widget__return']")).isDisplayed());
        //getText() will get what text is written on the website
        System.out.println(driver.findElement(By.xpath("id('fd-wrap')/div[2]/h2[1]")).getText());

        driver.findElement(By.xpath("//input[@id='hp-widget__depart']")).click();

        driver.switchTo().alert().getText();







    }

}
