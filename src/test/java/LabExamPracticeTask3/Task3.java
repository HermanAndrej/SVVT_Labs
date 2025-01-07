package LabExamPracticeTask3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

    @Test
    public void task3Test() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/login.html");
        WebElement emailField = driver.findElement(By.id("email"));
        WebElement passwordField = driver.findElement(By.id("passwd"));
        emailField.sendKeys("svvt@test.com");
        passwordField.sendKeys("testing");
        WebElement signInButton = driver.findElement(By.id("SubmitLogin"));
        signInButton.click();
        Assertions.assertEquals("https://demo.guru99.com/test/success.html", driver.getCurrentUrl());
        WebElement heading = driver.findElement(By.cssSelector("body > div:nth-child(2) > div > div > h3"));
        Assertions.assertTrue(heading.getText().contains("Successfully Logged in..."));
        driver.close();
    }
}
