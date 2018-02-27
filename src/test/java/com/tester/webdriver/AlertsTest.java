package com.tester.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by asingh on 12/21/17.
 */
public class AlertsTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "/Users/asingh/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
        driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();

        //to print the text message in alert use the getText() method
        System.out.println(driver.switchTo().alert().getText());

        // to transfer the control to the new pop-up use the switchTo() method to transfer
        // the control to the alert and click on the confirmation button 'ok' or 'yes' use accept() method
        // and use dismiss() to cancel the alert
        driver.switchTo().alert().accept();





    }
}
