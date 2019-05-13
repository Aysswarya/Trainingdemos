import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class learn3_actions {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://realestate.upskills.in/my-profile/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='user_login']")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id='user_pass']")).sendKeys("admin@123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		WebElement link = driver.findElement(By.xpath("//*[contains(@class,'avatar')]"));
		Actions build = new Actions(driver);
		build.moveToElement(link).build().perform();
		build.moveToElement(link).click();
		build.contextClick().build().perform();           
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);                     
		robot.keyPress(KeyEvent.VK_CONTROL);           //to go back to main page again give cntl+tab
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		System.out.println(driver.getCurrentUrl());
	}

}
