import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3 {

	public static void main(String[] args) {
	    System.out.println("hello");
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver obj=new ChromeDriver();
        obj.get("https://www.google.com/");
        
        obj.findElement(new By.ByCssSelector("input[name=q]")).sendKeys("To The New");
        obj.findElement(new By.ByCssSelector("input[name=q]")).sendKeys(Keys.ENTER);


	}

}
