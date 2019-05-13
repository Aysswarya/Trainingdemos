import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testleaf.herokuapp.com/home.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='Alert']")).click();
		driver.findElement(By.xpath("//button[contains(@onclick,'normalAlert')]")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[contains(@onclick,'confirmAlert')]")).click();
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//button[contains(@onclick,'confirmPrompt')]")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("IBM training");
		Thread.sleep(2000);
		alert.accept();
		driver.findElement(By.xpath("//button[contains(@onclick,'lineBreaks')]")).click();
		Alert alert2 = driver.switchTo().alert();
		String text = alert2.getText();
		System.out.println("The printed text is "+text);
		alert2.accept();
		
	}
	

}
