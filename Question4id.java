import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.JavascriptExecutor;

public class Question4id {

public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");

	   WebDriver driver= new ChromeDriver();
driver.get("https://www.google.com");

WebElement elem = driver.findElement(By.name("q"));//finding the web element using name locator
   driver.get("http://www.tothenew.com/");
 
     driver.findElement(By.id("h-contact-us")).sendKeys(Keys.ENTER);
     
     
   
}
}