import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath("//div[@class='fsw_inputBox dates inactiveWidget ']")).click();
		
		while (!driver.findElement(By.xpath("//div[@class='DayPicker-NavBar']//child::span")).getText().contains("May"))
		{
			driver.findElement(By.xpath("//div[@class='DayPicker-NavBar']//child::span")).click();
		}
	
		List<WebElement> dates = driver.findElements(By.className("DayPicker-Day"));
		
		int count = driver.findElements(By.className("DayPicker-Day")).size();
		
		for(int i=0;i<count;i++)
		{
			String text = driver.findElements(By.className("DayPicker-Day")).get(i).getText();
			if(text.equalsIgnoreCase("25"))
			
		driver.findElements(By.className("DayPicker-Day")).get(i).click();
		}
	}

}
