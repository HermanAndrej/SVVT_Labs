package LabExamPracticeTask4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {

    @Test
    public void testIdk() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        WebElement link = driver.findElement(By.linkText("Form Authentication"));
        link.click();
        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys("tomsmith");
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("SuperSecretPassword!");
        WebElement signInButton = driver.findElement(By.cssSelector("#login > button > i"));
        signInButton.click();
        Assertions.assertEquals("https://the-internet.herokuapp.com/secure", driver.getCurrentUrl());
        WebElement logOutButton = driver.findElement(By.cssSelector("#content > div > a"));
        logOutButton.click();
        driver.get("https://the-internet.herokuapp.com/");
        WebElement link2 = driver.findElement(By.linkText("Checkboxes"));
        link2.click();
        WebElement checkBox1 = driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(1)"));
        WebElement checkBox2 = driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(3)"));
        checkBox1.click();
        checkBox2.click();
        driver.get("https://the-internet.herokuapp.com/");
        WebElement link3 = driver.findElement(By.linkText("Dropdown"));
        link3.click();
        WebElement menu = driver.findElement(By.id("dropdown"));
        menu.click();
        WebElement option2 = driver.findElement(By.cssSelector("#dropdown > option:nth-child(3)"));
        option2.click();
    }
}
