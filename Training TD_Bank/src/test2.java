import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sunil");
		String name = driver.findElement(By.name("userName")).getAttribute("value");     //get the value entered in text box
		System.out.println("The value is"  + name);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sunil");
		driver.findElement(By.xpath("//input[@type='image']")).click();
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		WebElement dd = driver.findElement(By.name("passCount"));
		Select select =new Select(dd);
		select.selectByValue("2");
		WebElement dd2 = driver.findElement(By.name("fromPort"));
		Select select1 =new Select(dd2);
		select1.selectByIndex(4);
		WebElement dd3 = driver.findElement(By.name("fromMonth"));
		Select select2 =new Select(dd3);
		select2.selectByVisibleText("October");
		WebElement dd4 = driver.findElement(By.name("toPort"));
		Select select3 =new Select(dd4);
		select3.selectByVisibleText("London");
		List <WebElement> count = select3.getOptions();          //to get the size of the dropdown
		System.out.println(count.size());
		for(int i=0;i<count.size();i++)  //to get the values in the dropdown
				{
					System.out.println(count.get(i).getText());
				}
		Select select4 =new Select(driver.findElement(By.name("toDay")));
		select4.selectByIndex(3);
		driver.findElement(By.xpath("//input[@value='Business']")).click();
		Select select5 =new Select(driver.findElement(By.name("airline")));
		select5.selectByIndex(0);
		driver.findElement(By.xpath("//input[@name='findFlights']")).click();
		driver.findElement(By.xpath("(//input[@name='outFlight'])[3]")).click();
		driver.findElement(By.xpath("(//input[@name='inFlight'])[2]")).click();
		driver.findElement(By.xpath("//input[@name='reserveFlights']")).click();
		driver.findElement(By.name("passFirst0")).sendKeys("Harshu");
		driver.findElement(By.name("passLast0")).sendKeys("Raki");
		driver.findElement(By.name("passFirst1")).sendKeys("Ayss");
		driver.findElement(By.name("passLast1")).sendKeys("Vinu");
		driver.findElement(By.name("creditnumber")).sendKeys("128787765");
		List<WebElement> checkbox = driver.findElements(By.name("ticketLess"));
		for (WebElement e:checkbox)
		{
			e.click();
			
		}
		driver.findElement(By.xpath("//input[@name='buyFlights']")).click();
		
	}

}
