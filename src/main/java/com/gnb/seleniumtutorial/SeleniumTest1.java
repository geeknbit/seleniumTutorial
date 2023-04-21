package com.gnb.seleniumtutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SeleniumTest1 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/rishi/Desktop/driver/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        System.out.println(driver.getTitle());

    driver.findElement(By.id("inputUsername")).sendKeys("rahul");
    driver.findElement(By.name("inputPassword")).sendKeys("password");
    driver.findElement(By.className("signInBtn")).click();
    driver.findElement(By.linkText("Forgot your password?")).click();
    driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("john");
    }
}
