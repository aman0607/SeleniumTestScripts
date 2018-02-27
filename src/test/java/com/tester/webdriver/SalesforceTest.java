package com.tester.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by asingh on 12/19/17.
 */
public class SalesforceTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/asingh/Downloads/chromedriver1");

        WebDriver driver = new ChromeDriver();
//        driver.get("https://rediff.com");
//        driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
//        driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("abcdef");
//        driver.findElement(By.cssSelector("input#password")).sendKeys("123456");
//        driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();
//        System.out.println(driver.findElement(By.xpath("//*[@id='login']/div[2]/div[2]/div[4]/div")));

        driver.get("https://google.com");
        driver.findElement(By.xpath("id('lst-ib')")).sendKeys("abcdef");
        driver.findElement(By.xpath("//input[@value='Google Search']")).click();



    }
}
