import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button_test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testleaf.herokuapp.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//img[@alt='Buttons']")).click();
		 driver.findElement(By.xpath("//img[contains(@alt,'Buttons')]")).click();  
		  driver.findElement(By.id("home")).click();
		  driver.navigate().back();
		  Point location = driver.findElement(By.id("position")).getLocation();
		 int x = location.getX();
		 System.out.println("The x location is " +x );
		 int y = location.getY();
		 System.out.println("The x location is " +y );
		 String cssValue = driver.findElement(By.id("color")).getCssValue("background-color");
		 System.out.println("The background colour is "+cssValue );
		 WebElement findElement = driver.findElement(By.id("size"));
		 int height = findElement.getSize().getHeight();
		 System.out.println("The height is "+height);
		 int width = findElement.getSize().getWidth();
		 System.out.println("The width is "+width);
	}
	
}


