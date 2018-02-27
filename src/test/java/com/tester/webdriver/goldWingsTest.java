package com.tester.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import java.util.List;


/**
 * Created by asingh on 1/9/18.
 */
public class goldWingsTest {

    public static void main(String[] args) {

        //Set the system properties to initiate Chrome browser
        System.setProperty("webdriver.chrome.driver", "/Users/asingh/Downloads/Chromedriver1");
        WebDriver driver = new ChromeDriver();

        //Get the URL and initiate the webpage
        driver.get("http://10.54.10.186/awards/gold-wing/form.php");
        driver.manage().window().maximize();
        driver.switchTo().alert().accept();
        driver.switchTo().defaultContent();

        //Fill the form with input via keyboard
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/form/div/input[1]")).sendKeys("John");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/form/div/input[2]")).sendKeys("Doe");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/form/div/input[3]")).sendKeys("Manager");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/form/div/input[4]")).sendKeys("Microsooft");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/form/div/input[5]")).sendKeys("211 Russel St.");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/form/div/input[6]")).sendKeys("400");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/form/div/input[7]")).sendKeys("Rockville");
        driver.findElement(By.cssSelector("#STATEPROVINCE")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/form/div/select[1]/option[38]")).click();

        //Select the country from Dropdown menu
        Select s = new Select(driver.findElement(By.xpath("//*[@id='COUNTRY']")));
        s.selectByVisibleText("Austria");

        //Fill the data with input via keyboard
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/form/div/input[8]")).sendKeys("45678");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/form/div/input[9]")).sendKeys("245-234-2345");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/form/div/input[10]")).sendKeys("abc@abnchgko.net");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/form/div/input[11]")).sendKeys("Test pubs");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/form/div/textarea")).sendKeys("This is a test for the checking the input into the input area.");
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
        driver.findElement(By.xpath("//*[@id='publicationName']")).sendKeys("Random publication.");
        driver.findElement(By.xpath("//*[@id='publicationURL']")).sendKeys("www.randompublicationtest.net");
        driver.findElement(By.xpath("//*[@id='publicationPassword']")).sendKeys("123456789");

        //upload the file

        WebElement fileInput = driver.findElement(By.xpath("//*[@id='publication']"));
        fileInput.sendKeys("/Users/asingh/Desktop/TestInputFile.rtf");

        //Fill the data via input from the keyboard
        driver.findElement(By.xpath("//*[@id='STATEPROVINCE']")).sendKeys("abcdefgh");

        //Submit application
        //driver.findElement(By.xpath("//input[@value='Submit Application']")).click();


    }

}
