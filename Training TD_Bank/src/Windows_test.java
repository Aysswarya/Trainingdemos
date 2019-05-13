import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testleaf.herokuapp.com/home.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='Windows']")).click();
		driver.findElement(By.id("home")).click();
		driver.findElement(By.xpath("//button[starts-with(@onclick,'openWindows')]")).click();
		int size = driver.getWindowHandles().size();
		System.out.println("The number of open windows are "+size);
		driver.findElement(By.id("color")).click();
		String parentwindow = driver.getWindowHandle();
		Set<String> allwindows = driver.getWindowHandles();
		for (String handle : allwindows) {
			if (!handle.equals(parentwindow)) {
				driver.switchTo().window(handle);
				driver.close();
			} 
	
		}
		driver.switchTo().window(parentwindow);
		driver.findElement(By.xpath("//button[starts-with(@onclick,'openWindowsWithWait')]")).click();
		Thread.sleep(5000);
		Set<String> allUnordered = driver.getWindowHandles();
		List<String> allOrdered = new ArrayList<String>(); 
		allOrdered.addAll(allUnordered);
		String parent = allOrdered.get(0); //get(0)- to get the index and get(0) will always get the Parent window
		String child1 = allOrdered.get(1);
		System.out.println(child1);
		driver.switchTo().window(child1);
		Thread.sleep(2000);
		driver.close();
		String child2 = allOrdered.get(2);
		System.out.println(child2);
		driver.switchTo().window(child2);
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(parent);
		System.out.println(parent);
		Thread.sleep(2000);
		driver.close();
	}

}
