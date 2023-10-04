package Selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasic {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\shree\\Selenium 1\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        String title = driver.getTitle();
        System.out.println(title);

    }
}
