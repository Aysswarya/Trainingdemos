import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testleaf.herokuapp.com/home.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='Frame']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[starts-with(@src,'default.html')]")));
		driver.findElement(By.id("Click")).click();
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[starts-with(@src,'page')]")));
		driver.switchTo().frame(driver.findElement(By.id("frame2")));
		driver.findElement(By.xpath("//button[@id='Click1']")).click();
		driver.switchTo().defaultContent();
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println("The number of frames are "+size);
	}

}
