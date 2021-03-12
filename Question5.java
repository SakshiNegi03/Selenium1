import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
 
public class Question5 {  
public static void main(String[] args) {  
//setting up chrome driver
System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
WebDriver driver= new ChromeDriver(); 

// Title of contact - us 
String url = ("https://www.tothenew.com/contact-us");  
driver.get(url);  
String title = driver.getTitle();  
System.out.println("Title of the page is : " + title);  
driver.findElement(new By.ByXPath("/html/body/div[2]/div[2]/div/div[2]/button[2]")).sendKeys(Keys.ENTER);
}
}

	
	

