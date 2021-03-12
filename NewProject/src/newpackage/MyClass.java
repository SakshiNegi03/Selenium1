package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyClass {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("executing");
        System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.29.0-win64\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.google.com/");
}
    }