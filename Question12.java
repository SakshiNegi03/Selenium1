import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question12 {

	public static void main(String[] args) {
		
		        
		 System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");

		   WebDriver driver= new ChromeDriver();
		 
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

		WebElement elem = driver.findElement(By.name("email_create"));//finding the web element using name locator
		elem.sendKeys(new String[]{"snegihm@gmail.com"});
		elem.submit();


		   WebElement firstName = driver.findElement(By.name("customer_firstname"));//finding the web element using name locator
		firstName.sendKeys("Sakshi");

		  WebElement lastName = driver.findElement(By.name("customer_lastname"));//finding the web element using name locator
		lastName.sendKeys("Negi");
		          
		        }
	}


