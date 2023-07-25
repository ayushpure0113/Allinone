import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Printthelinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
	//	System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		
		WebElement footerdriver = driver.findElement(By.xpath("//div[@id ='gf-BIG']/child::table/child::tbody/child::tr/child::td[1]/child::ul"));
	//	System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		
		for (int i = 0; i<footerdriver.findElements(By.tagName("a")).size();i++)
		{
			String newtab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			footerdriver.findElements(By.tagName("a")).get(i).sendKeys(newtab);
		}
	}

}
