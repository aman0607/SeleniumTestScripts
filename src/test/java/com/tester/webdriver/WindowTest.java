package com.tester.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by asingh on 12/28/17.
 */
public class WindowTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/asingh/Downloads/Chromedriver1");
        WebDriver driver = new ChromeDriver();

        driver.get("https://accounts.google.com/SignUp?continue=https%3A%2F%2Fwww.google.com%2F%3Fgws_rd%3Dssl&hl=en");
        driver.findElement(By.xpath("id('wrapper')/div[2]/div[1]/div[1]/p[1]/a[1]")).click();
        System.out.println(driver.getTitle());
        //driver.switchTo().window();
        Set<String> ids = driver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        String parentID = it.next();
        String childID1 = it.next();
        driver.switchTo().window(childID1);
        System.out.println(driver.getTitle());
        driver.switchTo().window(parentID);
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("ABCD");


    }
}
