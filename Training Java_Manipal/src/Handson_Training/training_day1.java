package Handson_Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class training_day1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver1.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		WebElement enab = driver.findElement(By.name("userName"));
		if (enab.isEnabled()) {
			enab.sendKeys("sunil");
			enab.clear();
			enab.sendKeys("sunil");
		}
		if (driver.findElement(By.name("userName")).isDisplayed()) {
			driver.findElement(By.name("password")).sendKeys("sunil");
			driver.findElement(By.name("login")).click();
		}

	}

}
