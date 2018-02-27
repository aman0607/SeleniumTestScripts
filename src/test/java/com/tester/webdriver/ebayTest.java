package com.tester.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by asingh on 1/2/18.
 */
public class ebayTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/Users/asingh/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://ebay.com");

        //Get count of the link in the entire page 'Twitter'
        System.out.println(driver.findElements(By.tagName("a")).size());

        //Count of links in the footer section of the page
       WebElement footer =driver.findElement(By.xpath(".//*[@id='hlGlobalFooter']"));

        System.out.println(footer.findElements(By.tagName("a")).size());
    }
}
