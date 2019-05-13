import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testtt {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("www.google.com");

	}

}
