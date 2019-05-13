import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testleaf.herokuapp.com/home.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='Table']")).click();
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		int rowsize = rows.size();
		System.out.println("The number of rows is "+rowsize);
		WebElement firstrow = rows.get(0);
		List<WebElement> columns = driver.findElements(By.tagName("th"));
		int columnsize = columns.size();
		System.out.println("The number of rows is "+columnsize);
		WebElement firstcolumn = columns.get(0);
		List<WebElement> alldata = driver.findElements(By.tagName("td"));
		for (WebElement webElement : alldata) {
			String mytext = webElement.getText();
			if (mytext.equalsIgnoreCase("Learn to interact with Elements")) {
				//rows.get(2).findElement(By.tagName("td")).get(1).gettext();
				rows.get(2).findElements(By.tagName("td")).get(1).getText();
				
			}
		}
		
		
	}

}
