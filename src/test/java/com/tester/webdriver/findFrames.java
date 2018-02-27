package com.tester.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by asingh on 1/4/18.
 */
public class findFrames {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "/Users/asingh/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.cricbuzz.com/live-cricket-scorecard/18508/hbh-vs-ads-17th-match-big-bash-league-2017-18");

        WebElement table = driver.findElement(By.cssSelector("div['class=cb-col cb-col-100 cb-ltst-wgt-hdr']"));
        table.findElements(By.cssSelector(""));

    }
}
