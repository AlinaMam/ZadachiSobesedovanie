package org.example.p3;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Scroll {
    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "/Users/alina/Desktop/web_chrome_drive"); // путь к chromedriver
        WebDriver driver = new ChromeDriver(); //для запуска браузера создаем объект драйвера
        JavascriptExecutor jscript = (JavascriptExecutor) driver;
        driver.manage().window().maximize(); //чтобы ход теста отображался в полностью открытом окне

        /*элементы на странице доступны не сразу и необходимо дождаться появления элемента.
        * для этого существуют ожидания
        * они бывают 2х видов - явные и неявные
        * В примере используются неявные ожидания Implicity Wait, которое задается вначале теста
        * и будет работать при каждом вызове метода поиска элемента
        * т.о. если элемент не найден то драйвер будет ждать его появления в течение 10 секунд и шагом в 500 мс*/
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //передаем драйверу адрес страницы
        driver.get("https://www.bosco.ru/");
        WebElement element = driver.findElement(By.name("EMAIL"));
        element.sendKeys("test@gmail.com", Keys.ENTER);
        jscript.executeScript("window.scrollBy(0, 900)");


    }
}
