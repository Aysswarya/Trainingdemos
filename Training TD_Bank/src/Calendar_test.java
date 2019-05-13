
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Calendar_test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testleaf.herokuapp.com/home.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='Calendar']")).click();
		//driver.findElement(By.id("datepicker")).sendKeys("04/10/2019");
		driver.findElement(By.id("datepicker")).click();
		List<WebElement> findElements = driver.findElements(By.xpath("//a[contains(@class,'state')]"));
		for (WebElement webElement : findElements) {
			String text = webElement.getText();
			if (text.equalsIgnoreCase("29")) {
				webElement.click();
			}
			
		}
		TakesScreenshot screen = ((TakesScreenshot)driver);  //TakesScreenshot is a predefined class 
		File screenshotAs = screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, new File("C:\\TD CBAW\\"+ System.currentTimeMillis()+".png")); // each time we get a unique screenshotname
	}

}
