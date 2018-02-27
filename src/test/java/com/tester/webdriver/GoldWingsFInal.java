package com.tester.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;


/**
 * Created by asingh on 1/10/18.
 */
public class GoldWingsFInal {


    @Test
    public void articlePub() throws IOException {

        //Set the system properties to initiate Chrome browser
        System.setProperty("webdriver.chrome.driver", "/Users/asingh/Downloads/Chromedriver1");
        WebDriver driver = new ChromeDriver();

        //Create properties object to fetch the data

        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("/Users/asingh/Documents/SeleniumTest1/src/test/java/com/tester/webdriver/data.properties");

        prop.load(fis);


        //Get the URL and initiate the webpage
        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
        driver.switchTo().alert().accept();
        driver.switchTo().defaultContent();

        //Fill the form with input via keyboard
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/form/div/input[1]")).sendKeys(prop.getProperty("FirstName"));
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/form/div/input[2]")).sendKeys(prop.getProperty("LastName"));
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/form/div/input[3]")).sendKeys(prop.getProperty("Title"));
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/form/div/input[4]")).sendKeys(prop.getProperty("Company"));
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/form/div/input[5]")).sendKeys(prop.getProperty("StreetAddress"));
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/form/div/input[6]")).sendKeys(prop.getProperty("Suite"));
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/form/div/input[7]")).sendKeys(prop.getProperty("City"));
        driver.findElement(By.cssSelector("#STATEPROVINCE")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/form/div/select[1]/option[38]")).click();

        //Select the country from Dropdown menu
        Select s = new Select(driver.findElement(By.xpath("//*[@id='COUNTRY']")));
        s.selectByVisibleText("Austria");

        //Fill the data with input via keyboard
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/form/div/input[8]")).sendKeys(prop.getProperty("ZipCode"));
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/form/div/input[9]")).sendKeys(prop.getProperty("Telephone"));
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/form/div/input[10]")).sendKeys(prop.getProperty("Email"));
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/form/div/input[11]")).sendKeys(prop.getProperty("TOE"));
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/form/div/textarea")).sendKeys(prop.getProperty("EntryDesc"));
        driver.findElement(By.xpath("//*[@id='publicationTypeArt']/following-sibling::label")).click();
        driver.findElement(By.xpath("//*[@id='publicationDateID']")).click();

        //Invoke the Calendar
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//*[@id='publicationDateID']"))).doubleClick().perform();

        //select year on the calendar
        Actions action1 = new Actions(driver);
        action1.moveToElement(driver.findElement(By.cssSelector(".ui-datepicker-year"))).doubleClick().perform();
        Select dropdown1 = new Select(driver.findElement(By.cssSelector(".ui-datepicker-year")));
        dropdown1.selectByVisibleText("2016");

        //Select month on the calendar
        driver.findElement(By.cssSelector(".ui-datepicker-month")).click();
        Select dropdown = new Select(driver.findElement(By.cssSelector(".ui-datepicker-month")));
        dropdown.selectByVisibleText("Oct");


        //Loop through the calendar and select the specified date
        List<WebElement> dates = driver.findElements(By.className("ui-state-default"));

        int count = driver.findElements(By.className("ui-state-default")).size();

        for (int i = 0; i < count; i++) {

            String text = driver.findElements(By.className("ui-state-default")).get(i).getText();
            if (text.equalsIgnoreCase("23")) {
                driver.findElements(By.className("ui-state-default")).get(i).click();
                break;
            }


        }

        //Fill the data via input from the keyboard
        driver.findElement(By.xpath("//*[@id='publicationName']")).sendKeys(prop.getProperty("PubName"));
        driver.findElement(By.xpath("//*[@id='publicationURL']")).sendKeys(prop.getProperty("SourceURL"));
        driver.findElement(By.xpath("//*[@id='publicationPassword']")).sendKeys(prop.getProperty("TempPass"));

        //upload the file

        WebElement fileInput = driver.findElement(By.xpath("//*[@id='publication']"));
        fileInput.sendKeys("/Users/asingh/Desktop/TestInputFile.rtf");

        //Fill the data via input from the keyboard
        driver.findElement(By.xpath("//*[@id='STATEPROVINCE']")).sendKeys("abcdefgh");

        //Submit application
        //driver.findElement(By.xpath("//input[@value='Submit Application']")).click();


    }


    @Test
    public void audioPub() throws IOException {



        //Set the system properties to initiate Chrome browser
        System.setProperty("webdriver.chrome.driver", "/Users/asingh/Downloads/Chromedriver1");
        WebDriver driver = new ChromeDriver();

        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("/Users/asingh/Documents/SeleniumTest1/src/test/java/com/tester/webdriver/data.properties");

        prop.load(fis);

        //Get the URL and initiate the webpage
        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
        driver.switchTo().alert().accept();
        driver.switchTo().defaultContent();

        //Fill the form with input via keyboard
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/form/div/input[1]")).sendKeys(prop.getProperty("FirstName"));
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/form/div/input[2]")).sendKeys(prop.getProperty("LastName"));
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/form/div/input[3]")).sendKeys(prop.getProperty("Title"));
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/form/div/input[4]")).sendKeys(prop.getProperty("Company"));
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/form/div/input[5]")).sendKeys(prop.getProperty("StreetAddress"));
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/form/div/input[6]")).sendKeys(prop.getProperty("Suite"));
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/form/div/input[7]")).sendKeys(prop.getProperty("City"));
        driver.findElement(By.cssSelector("#STATEPROVINCE")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/form/div/select[1]/option[38]")).click();

        //Select the country from Dropdown menu
        Select s = new Select(driver.findElement(By.xpath("//*[@id='COUNTRY']")));
        s.selectByVisibleText("Austria");

        //Fill the data with input via keyboard
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/form/div/input[8]")).sendKeys(prop.getProperty("ZipCode"));
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/form/div/input[9]")).sendKeys(prop.getProperty("Telephone"));
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/form/div/input[10]")).sendKeys(prop.getProperty("Email"));
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/form/div/input[11]")).sendKeys(prop.getProperty("TOE"));
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/form/div/textarea")).sendKeys(prop.getProperty("EntryDesc"));
        driver.findElement(By.xpath("//*[@id='publicationTypeAud']/following-sibling::label")).click();
        driver.findElement(By.xpath("//*[@id='audioPublicationDateID']")).click();

        //Invoke the Calendar
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//*[@id='audioPublicationDateID']"))).doubleClick().perform();

        //select year on the calendar
        Actions action1 = new Actions(driver);
        action1.moveToElement(driver.findElement(By.cssSelector(".ui-datepicker-year"))).doubleClick().perform();
        Select dropdown1 = new Select(driver.findElement(By.cssSelector(".ui-datepicker-year")));
        dropdown1.selectByVisibleText("2016");

        //Select month on the calendar
        driver.findElement(By.cssSelector(".ui-datepicker-month")).click();
        Select dropdown = new Select(driver.findElement(By.cssSelector(".ui-datepicker-month")));
        dropdown.selectByVisibleText("Oct");

        //Loop through the calendar and select the specified date
        List<WebElement> dates = driver.findElements(By.className("ui-state-default"));

        int count = driver.findElements(By.className("ui-state-default")).size();

        for (int i = 0; i < count; i++) {

            String text = driver.findElements(By.className("ui-state-default")).get(i).getText();
            if (text.equalsIgnoreCase("14")) {
                driver.findElements(By.className("ui-state-default")).get(i).click();
                break;
            }


        }

        //Fill the data via input from the keyboard
        driver.findElement(By.xpath("//*[@id='audioPublicationName']")).sendKeys(prop.getProperty("PubName"));
        driver.findElement(By.xpath("//*[@id='audioPublicationURL']")).sendKeys(prop.getProperty("NOS"));
        driver.findElement(By.xpath("//*[@id='audioPassword']")).sendKeys(prop.getProperty("SourceURL1"));
        driver.findElement(By.xpath("//*[@id='STATEPROVINCE']")).sendKeys(prop.getProperty("TempPass1"));

        //Submit application
        //driver.findElement(By.xpath("//input[@value='Submit Application']")).click();


    }


}
