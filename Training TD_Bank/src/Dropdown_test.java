import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testleaf.herokuapp.com/home.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='ListBox']")).click();
		Select select = new Select(driver.findElement(By.id("dropdown1")));
		select.selectByIndex(4);
		Select select1 = new Select(driver.findElement(By.name("dropdown2")));
		select1.selectByVisibleText("Appium");
		Select select2 = new Select(driver.findElement(By.name("dropdown3")));
		select2.selectByValue("2");
		Select select3 = new Select(driver.findElement(By.className("dropdown")));
		List<WebElement> options = select3.getOptions();
		int size = options.size();
		System.out.println("The number of options are " +size);
		driver.findElement(By.xpath("(//option[@selected='selected'])[5]")).click();
		Actions builder = new Actions(driver);
		builder.sendKeys("Appium").build().perform();
		Select select4 = new Select(driver.findElement(By.xpath(" (//option[@value='0'])[6]/..")));	
		select4.selectByIndex(2);
	}
	

}
