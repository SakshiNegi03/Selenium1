import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Question4 {

public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");

   WebDriver driver= new ChromeDriver();
driver.get("https://www.google.com");

WebElement elem = driver.findElement(By.name("q"));//finding the web element using name locator
   driver.get("http://www.tothenew.com/");
 
   // Xpath 
     driver.findElement(new By.ByXPath("/html/body/div[2]/div[2]/div/div[2]/button[2]")).sendKeys(Keys.ENTER);

     driver.findElement(new By.ByXPath("//*[@id='h-contact-us']")).sendKeys(Keys.ENTER);
        
}
}