import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Images_test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://testleaf.herokuapp.com/home.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='Images']")).click();
		driver.findElement(By.xpath("//img[starts-with(@onclick,'window')]")).click();
		driver.navigate().back();
		WebElement myelement = driver.findElement(By.xpath("//img[contains(@src,'abcd')]"));
		if (myelement.getAttribute("naturalWidth").equals("0"))
       {
		System.out.println("The image is broken "+myelement.getAttribute("outerHTML"));	
		} else {
			System.out.println("The image is not broken");
		}
	    WebElement ourElement = driver.findElement(By.xpath("(//img[contains(@onclick,'location')])[2]"));
		Actions builder = new Actions(driver);     //to perform mouse or keyboard action
		builder.click(ourElement).build().perform();
	}

}
