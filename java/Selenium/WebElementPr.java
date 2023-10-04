package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class WebElementPr {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\shree\\Selenium 1\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/admin/");
        WebElement username = driver.findElement(By.id("input-username"));
        username.sendKeys("demo");
        Thread.sleep(3000);
        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("demo");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//button[@class='btn-close']")).click();




    }
}
