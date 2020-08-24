import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alo {
	@Test
	public void test(){
	String path = System.getProperty("user.dir");
	System.out.println(path); 
	System.setProperty("webdriver.chrome.driver",path+"\\Resoures\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.prothomalo.com/");
	}

}
