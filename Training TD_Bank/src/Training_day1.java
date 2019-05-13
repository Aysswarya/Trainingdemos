import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Training_day1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		String Expectedtitle = "OrangeHRM";
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		String Actualtitle = driver.getTitle();
		if (Expectedtitle.equals(Actualtitle)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		driver.findElement(By.xpath("//input[@type='radio']")).isSelected()
		
		
	}

}
