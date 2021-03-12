import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {

	public static void main(String[] args) {
		        System.out.println("hello");
		        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		        WebDriver obj=new ChromeDriver();
		        obj.get("https://www.google.com/");

	}

}
