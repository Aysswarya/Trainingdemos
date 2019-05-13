package projecttest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize(); //to maximize the URL
		driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.linkText("Sign in")).click();
		//driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("abc");
		
		//driver.close();
	}

}
