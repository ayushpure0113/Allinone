import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.flipkart.com/");
		driver.findElement(By.cssSelector("._3704LK")).sendKeys("Mobiles");
		driver.findElement(By.cssSelector(".L0Z3Pu")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Infinix HOT 20 Play (Racing Black, 64 GB)')]")).click();
		driver.findElement(By.xpath("//button[@class ='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		
		
	}

}
