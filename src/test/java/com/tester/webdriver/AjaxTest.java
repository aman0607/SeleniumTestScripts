package com.tester.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

/**
 * Created by asingh on 12/28/17.
 */
public class AjaxTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/asingh/Downloads/Chromedriver1");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://amazon.com");

        //Action class helps move the cursor over to the web element
        Actions a = new Actions(driver);
        WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));

        //to make the input text in capital letters use the keydown method
        a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();

        //moves to a specific element on the website
        a.moveToElement(move).contextClick().build().perform();









    }


}
