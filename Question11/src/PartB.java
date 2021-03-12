import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class PartB {
public static void main(String[] args) throws InterruptedException {
	//setting up chrome driver
System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
 WebDriver driver= new ChromeDriver();
  // setting up url and filling email 
driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
WebElement elem = driver.findElement(By.name("email_create"));
elem.sendKeys(new String[]{"snegihm@gmail.com"});
elem.submit();

 // selecting gender
WebElement target = driver.findElement(By.id("id_gender2"));
target.click();

 // validating title is selected
List list = driver.findElements(By.name("id_gender"));
Boolean is_selected = ((WebElement) list.get(1)).isSelected();

if (is_selected == true) {
 System.out.println("Test Passed");
} else {
System.out.println("Test Failed");
}
}
}

