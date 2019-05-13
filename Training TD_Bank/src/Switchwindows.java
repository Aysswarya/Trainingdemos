import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Switchwindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		driver.manage().window().maximize();
		//this is to identify my parent window
		String Parentwindow = driver.getWindowHandle();
		System.out.println("The parent window is -- " + Parentwindow);
		WebElement Clickbutton = driver.findElement(By.id("button1"));   //clicking the button 3 times
		for (int i = 0; i <3; i++) {
			Clickbutton.click();
			Thread.sleep(2000);
		}
		//This is to identify my child window
		List<String> childWindow = new ArrayList<>(driver.getWindowHandles());
		System.out.println("The Child window is -- " + childWindow);
		String lastwindow = "";
		for (int i = 1; i < childWindow.size(); i++) {
			driver.navigate().to("http://www.google.com");
			lastwindow = childWindow.get(i).toString();
		}
		//Switchimg back to parent window
		driver.switchTo().window(Parentwindow);
		driver.navigate().to("http://newtours.demoaut.com/");
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(lastwindow);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.quit();
	}

}
