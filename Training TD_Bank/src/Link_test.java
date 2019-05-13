import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://testleaf.herokuapp.com/home.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='Link']")).click();
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.navigate().back();
		String attribute = driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href");
		System.out.println("The value is "+attribute);
		//driver.findElement(By.xpath("//a[@style='color:green']")).click();
		driver.findElement(By.linkText("Verify am I broken?")).click();
		String text = driver.findElement(By.xpath("/html/body/h1")).getText(); //absolute xpath as there is no id,class,linktext
		String myText = "Not Found";
		if (myText.equalsIgnoreCase(text))
		{
			System.out.println("The website is Not working");
		} else {
			System.out.println("The webite is working");
		}
		
		driver.navigate().back();
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.navigate().back();
		int size = driver.findElements(By.tagName("a")).size();
		System.out.println("The number of links available in this page is "+size);
	}

}
