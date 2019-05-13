import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edit_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://testleaf.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='Edit / Text Fields']")).click();
		driver.findElement(By.id("email")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("harshith");
	    //driver.findElement(By.xpath("(//input[@type='text'])[2]"))
		String attribute = driver.findElement(By.name("username")).getAttribute("value");//to get the Default value, cntrl+2+L and use getattribute
		System.out.println("The value present is "+ attribute);
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		WebElement checking = driver.findElement(By.xpath("//input[@disabled='true']"));// cntrl+2+L to get the Webelement.Webelement is a predefined
		                                                                                 // class
		if(checking.isEnabled()) {
			System.out.println("The element is enabled");
		}
		else
				System.out.println("The element is disabled");
		}
}
