package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/saitejapulluri/Desktop/Courses/Sft Testing/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys("pulluri@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("12345678");
        driver.findElement(By.name("login")).click();
//        System.out.println("Hello and welcome!");

    }
}