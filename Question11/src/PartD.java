
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class PartD {

	public static void main(String[] args) {
   // setting up chrome driver
		 System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		        WebDriver driver = new ChromeDriver();

		        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		        
  // validating title of page 
		        String Actual = driver.getTitle();
		        String Expected = "Login - My Store";

		        if (Actual.equals(Expected)) {
		                   System.out.println("Test Passed!");
		        } else {
		                   System.out.println("Test Failed");
		        }

		    }
		
	}


