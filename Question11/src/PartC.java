
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PartC{
   public static void main(String[] args) {
	   System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	   
      WebDriver driver = new ChromeDriver();
    
      String url = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
      driver.get(url);
      
      String create = "Create an account";
      // getPageSource() to get page source
      if ( driver.getPageSource().contains("Create an account"))
      {
         System.out.println("Text: " + create + " is present. ");
      }
      else {
         System.out.println("Text: " + create + " is not present. ");
      }
   }
}