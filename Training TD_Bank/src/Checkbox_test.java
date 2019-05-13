import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testleaf.herokuapp.com/home.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='Checkbox']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		WebElement element = driver.findElement(By.xpath("( //input[@type='checkbox'])[6]"));
		if (element.isSelected()) {
		System.out.println("The Selenium is checked");	
		}
		List<WebElement> findElements2 = driver.findElements(By.xpath("(//div[@class='example'])[3]/input"));
		for (WebElement webElement1 : findElements2) {
			if (webElement1.isSelected()){
			webElement1.click();
			}
		}
		List<WebElement> findElements = driver.findElements(By.xpath("(//div[@class='example'])[4]/input"));
		for (WebElement webElement : findElements) {
			if (!(webElement.isSelected()))
				webElement.click();	
		}
			
			}
	}


