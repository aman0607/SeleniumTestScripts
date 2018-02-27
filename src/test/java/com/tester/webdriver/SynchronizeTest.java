package com.tester.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.tools.jconsole.Tab;

import java.util.concurrent.TimeUnit;

/**
 * Created by asingh on 12/27/17.
 */
public class SynchronizeTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "/Users/asingh/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();

       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
        driver.findElement(By.id("H-destination")).sendKeys("nyc");
        driver.findElement(By.id("H-destination")).sendKeys(Keys.TAB);
        driver.findElement(By.id("H-fromDate")).sendKeys(Keys.ENTER);

        WebDriverWait d = new WebDriverWait(driver, 20);
        //d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'New-York-Hotels-Wellington')]")));
        d.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@href,'New-York-Hotels-Wellington')]")));

        driver.findElement(By.xpath("//a[contains(@href,'New-York-Hotels-Wellington')]")).click();








    }


}
