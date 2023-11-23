package org.example.p4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class OpenRef {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com/search?q=bosco&sca_esv=584594592&source=hp&ei=KhFeZZrpF9StwPAP4ai7UA&iflsig=AO6bgOgAAAAAZV4fOrLLf4HeH7-oaCqA2e6jXM4CPaPP&ved=0ahUKEwiaprTL6deCAxXUFhAIHWHUDgoQ4dUDCAo&uact=5&oq=bosco&gs_lp=Egdnd3Mtd2l6IgVib3NjbzILEAAYgAQYsQMYgwEyCxAAGIAEGLEDGIMBMgsQLhiABBjHARjRAzIFEAAYgAQyBRAAGIAEMgUQABiABDIFEAAYgAQyDhAuGIAEGMcBGK8BGI4FMgUQABiABDIFEAAYgARI0AtQ3wJYowhwAXgAkAEAmAFLoAGPAqoBATW4AQPIAQD4AQGoAgrCAhAQABgDGI8BGOUCGOoCGIwDwgIQEC4YAxiPARjlAhjqAhiMA8ICCBAuGIAEGLEDwgIREC4YgAQYsQMYgwEYxwEY0QPCAggQABiABBixA8ICCxAuGIAEGLEDGIMBwgIOEC4YgAQYsQMYxwEY0QPCAhQQLhiABBixAxiDARjHARjRAxjUAsICDhAAGIAEGIoFGLEDGIMB&sclient=gws-wiz");
        List<WebElement> list = driver.findElements(By.tagName("a"));
        System.out.println(list.size());
        for (WebElement e : list) {
            System.out.println(e.getAttribute("href"));
            System.out.println(e.getText());
        }
    }
}
