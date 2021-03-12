import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
		
public class Question6 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		      String url = "https://www.tothenew.com/contact-us";
		      driver.get(url);
		      // get current URL and print
		      String strUrl = driver.getCurrentUrl();
		      System.out.println("Current Url is:"+ strUrl);
		      
		   }
	}


