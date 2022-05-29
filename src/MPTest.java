package com.example.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Selenide.*;

public class WEbPageTest {
    MainPage mainPage = new MainPage();
    static WebDriver webDriver;
    @BeforeAll
    public static void setUpAll() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.get("http://formy-project.herokuapp.com/form");
    }
    @Test
    public void FNameTest(){
        WebElement rekt = webDriver.findElement(By.xpath("//*[@id=\"first-name\"]"));
        rekt.sendKeys("Youssef");
        assertEquals("Youssef", rekt.getAttribute("value"));
    }
    @Test
    public void LnameTest(){
        WebElement rekt = webDriver.findElement(By.xpath("//*[@id=\"last-name\"]"));
        rekt.sendKeys("Showeter");
        assertEquals("Showter", rekt.getAttribute("value"));
    }

    @Test
    public void EDTEST(){
        WebElement Rekt = webDriver.findElement(By.id("Button1"));
        Rekt.click();
        assertEquals(true,Rekt.isSelected());
    }

    @Test
    public void SUBtest(){
        WebElement btn = webDriver.findElement(By.className("button"));
        btn.click();
    }
    @AfterAll
    public static void afterAll(){
        webDriver.quit();
    }
}