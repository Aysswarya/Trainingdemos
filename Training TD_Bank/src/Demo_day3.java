import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_day3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver1.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		for(int i=0;i<=6;i++)
		{
		//driver.findElement(By.xpath(" //*[starts-with(@href,'mercurywelcome')]")).click();
		List<WebElement> lists = driver.findElements(By.xpath("//*[@class='mouseOut']"));
		String pagename = lists.get(i).getText();
		String Actualtitle = driver.getTitle();
		if (Actualtitle.startsWith("Under")) {
			System.out.println(Actualtitle +" page is not working");
		} else {
			System.out.println(Actualtitle +" page is working");
		}
		}
	}

}
