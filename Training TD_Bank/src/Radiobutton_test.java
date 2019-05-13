import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton_test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testleaf.herokuapp.com/home.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='Radio Button']")).click();
		/*driver.findElement(By.xpath("//input[@value='1']")).click();
		/*List oRadioButton  = driver.findElements(By.xpath("(//input[@value='0'])[2]"));
		  String radbtn = driver.findElement(By.xpath("(//input[@value='1'])[2]")).getAttribute("checked");
		if (radbtn.equalsIgnoreCase("true")) {
			System.out.println("The default selected button is Checked");			
		} else {
			System.out.println("The default button is not Checked");
		}
		WebElement radbutton = driver.findElement(By.xpath("(//input[@value='1'])[2]"));
		if (radbutton.isSelected()) {
			System.out.println("The radio button is selected by default");
		} else {
			System.out.println("The radio button is not selected by default");
		}
		WebElement radbutton1 = driver.findElement(By.xpath("(//input[@value='1'])[3]"));
		if (radbutton1.isSelected()) {
			System.out.println("The radio button is already selected");
		} else {
			radbutton1.click();
		}*/
		List<WebElement> findElements = driver.findElements(By.name("news"));
		for (WebElement webElement : findElements) {         // for loop is used-each element is passed and checked if it is selected.
			if (webElement.isSelected()) {
				System.out.println("The default selected button is "+webElement.getAttribute("value"));
			}
			
		}
		WebElement age = driver.findElement(By.xpath("(//input[@name='age'])[3]"));// change the xpath and check
		if (age.isSelected()) {
			System.out.println("The my age is selected");
			
		} else {
			age.click();
			System.out.println("My age group is not selected");
		}
	}
}

