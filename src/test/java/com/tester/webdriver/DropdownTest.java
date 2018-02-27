package com.tester.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by asingh on 12/20/17.
 */
public class DropdownTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/asingh/Downloads/chromedriver1");
        WebDriver driver = new ChromeDriver();

        driver.get("http://spicejet.com");

        //create a new object for the Select feature for any dropdown
        Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
        s.selectByValue("2");
        s.selectByIndex(6);
        s.selectByVisibleText("5");

//        driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
//        driver.findElement(By.xpath("//a[@value='IXC']")).click();
//        driver.findElement(By.xpath("(//a[@value='DEL'])[1]")).click();

        // Validate if checkbox is selected by default. You will need to make sure that no other
        System.out.println("Checkbox is selected? "+ driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_Unmr']")).isSelected());
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_Unmr']")).click();
        System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_Unmr']")).isSelected());




    }





}
