package LabExamPracticeTask5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSm {

    @Test
    public void testSmth() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.phptravels.net/");
        WebElement navbarItem = driver.findElement(By.cssSelector("#navbarSupportedContent > div.nav-item--left.ms-lg-0 > ul > li:nth-child(3) > a"));
        navbarItem.click();
        WebElement thai = driver.findElement(By.cssSelector("#fadein > main > div > div > div.pt-4.row.g-0 > div.col-lg-8.pe-lg-0 > div > a:nth-child(5) > div > div"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", thai);
        Thread.sleep(500);
        thai.click();
        WebElement adults = driver.findElement(By.id("adults"));
        adults.click();
        WebElement four = driver.findElement(By.cssSelector("#adults > option:nth-child(5)"));
        four.click();
        WebElement childs = driver.findElement(By.id("childs"));
        childs.click();
        WebElement three = driver.findElement(By.cssSelector("#childs > option:nth-child(4)"));
        three.click();
        WebElement calendar = driver.findElement(By.cssSelector("#fadein > main > div > div > div.row > div.col-md-4.order-1 > div > div > form > div:nth-child(1) > div > div > div > input"));
        calendar.click();
        WebElement day = driver.findElement(By.cssSelector("#fadein > div.datepicker.dropdown-menu > div.datepicker-days > table > tbody > tr:nth-child(4) > td:nth-child(5)"));
        day.click();
        WebElement price = driver.findElement(By.cssSelector("#fadein > main > div > div > div.row > div.col-md-4.order-1 > div > div > div > div > h3 > span > span"));
        Assertions.assertEquals("502", price.getText());
        WebElement book = driver.findElement(By.cssSelector("#fadein > main > div > div > div.row > div.col-md-4.order-1 > div > div > form > div.btn-box.pt-2 > button"));
        book.click();
    }
}
