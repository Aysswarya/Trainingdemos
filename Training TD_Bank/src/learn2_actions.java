import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class learn2_actions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://retail.upskills.in/admin/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin@123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		WebElement link = driver.findElement(By.id("menu-catalog"));
		Actions build = new Actions(driver);
		build.moveToElement(link).build().perform();
		build.moveToElement(link).click();
	}

}
