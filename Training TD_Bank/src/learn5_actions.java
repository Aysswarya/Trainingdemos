import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class learn5_actions {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Gmail")).sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
		Thread.sleep(2000);
		ArrayList<String> tabs = new ArrayList<> (driver.getWindowHandles());     //To get the number of opened tabs
		System.out.println("The number of tabs are " + tabs.size());
		driver.switchTo().window(tabs.get(1)); //To go to the next tab
		WebElement link = driver.findElement(By.xpath("(//*[contains(@target,'blank')])[4]"));
		Actions build = new Actions(driver);
		build.moveToElement(link).build().perform();
		build.moveToElement(link).click();
		build.contextClick().build().perform();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
	}

}
