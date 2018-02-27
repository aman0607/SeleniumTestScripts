package com.tester.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.Assertion;

/**
 * Created by asingh on 12/19/17.
 */
public class FacebookTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/asingh/Downloads/chromedriver1");

        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
        String actualTitle = "Facebook - Log In or Sign Up";
        Assert.assertEquals(driver.getTitle(), actualTitle);
//        driver.findElement(By.xpath("//*[@type='email']")).sendKeys("abcdef");
//        driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("123456");
//        driver.findElement(By.xpath("//*[@value='Log In']")).click();

//        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("abcdefg");
//        driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("123456");
//        driver.findElement(By.cssSelector("input[value='Log In']")).click();



    }
}
