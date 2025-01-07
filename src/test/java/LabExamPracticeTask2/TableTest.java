package LabExamPracticeTask2;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class TableTest {
    private static WebDriver driver;

    @Test
    public void tableTest() throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\andre\\Downloads\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/html/html_tables.asp");

        WebElement tableEntry = driver.findElement(By.cssSelector("#customers > tbody > tr:nth-child(6) > td:nth-child(2)"));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        Assertions.assertEquals("Yoshi Tannamuri", tableEntry.getText());
        driver.close();
    }

}
