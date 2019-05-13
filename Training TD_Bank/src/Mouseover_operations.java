import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Mouseover_operations {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver1.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		WebElement link = driver.findElement(By.xpath("(//*[starts-with(@href,'mercuryunderconst')])[2]"));
		Actions build = new Actions(driver);
		Action mouseover = build.moveToElement(link).build();
		mouseover.perform();
		build.sendKeys(link,(Keys.ENTER)).perform();
	
	}

}
