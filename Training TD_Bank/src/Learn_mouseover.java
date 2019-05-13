import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Learn_mouseover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		WebElement login = driver.findElement(By.xpath("//input[@id='btnLogin']"));
		Actions button = new Actions(driver);
		button.sendKeys(login,(Keys.ENTER)).perform();
		button.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER).perform();     // 3 times tab- goes to marketplace
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		Thread.sleep(2000);
		WebElement link = driver.findElement(By.linkText("Add Employee"));
		Actions build = new Actions(driver);
		Action mouseover = build.moveToElement(link).build();
		mouseover.perform();
		build.sendKeys(link,(Keys.ENTER)).perform();
		
	}

}
