package org.example.p3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Scroll1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor jscript = (JavascriptExecutor)  driver;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.google.com/webhp?hl=ru&sa=X&ved=0ahUKEwjMvqXC5NeCAxUaFhAIHRE_B2cQPAgJ");
        jscript.executeScript("window.scrollBy(0, 1000)");

    }
}
