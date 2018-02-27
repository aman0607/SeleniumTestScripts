package com.tester.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by asingh on 12/14/17.
 */
public class MyFirstTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "/Users/asingh/Downloads/geckodriver");

        WebDriver driver = new FirefoxDriver();
        driver.get("https://login.salesforce.com");
////        driver.findElement(By.id("email")).sendKeys("This is my first code");
////        driver.findElement(By.name("pass")).sendKeys("123456");
////        driver.findElement(By.linkText("Forgot account?")).click();
////
        driver.findElement(By.id("username")).sendKeys("hello");
        driver.findElement(By.name("pw")).sendKeys("123456");
        driver.findElement(By.className("button r4 wide primary")).click();
        driver.findElement(By.xpath("//*[@id='Login']")).click();

//        driver.findElement(By.className("inputtext")).sendKeys("This is email");

//        driver.findElement(By.cssSelector("#email")).sendKeys("abcdef");
//        driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("1234567");
//        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[3]/td[2]/div/a")).click();



    }

}
