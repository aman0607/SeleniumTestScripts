package com.tester.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by asingh on 12/28/17.
 */
public class FramesTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/asingh/Downloads/Chromedriver1");
        WebDriver driver = new ChromeDriver();
        driver.get("http://jqueryui.com/droppable/");
        System.out.println(driver.findElements(By.tagName("iframe")).size());

        driver.switchTo().frame(0);
        driver.findElement(By.id("draggable")).click();

        Actions a = new Actions(driver);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        a.dragAndDrop(source,target).build().perform();
        driver.switchTo().defaultContent();







    }

}
