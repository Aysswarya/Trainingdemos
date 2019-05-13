import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Redbus_booking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("u_0_j")).sendKeys("abcd");
		driver.findElement(By.id("u_0_l")).sendKeys("efgh");
		driver.findElement(By.xpath("//input[contains(@name,'reg')]")).sendKeys("1234567890");
		driver.findElement(By.id("u_0_v")).sendKeys("password");
		Select select = new Select(driver.findElement(By.id("day")));
		select.selectByValue("9");
		Select select1 = new Select(driver.findElement(By.id("month")));
		select1.selectByIndex(0);
		Select select2 = new Select(driver.findElement(By.id("year")));
		select2.selectByVisibleText("2000");
		driver.findElement(By.id("u_0_9")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	

}
