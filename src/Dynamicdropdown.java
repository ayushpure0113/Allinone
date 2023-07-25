import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Dehradun (DED)']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@Value='BOM'])[2]")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@Value='BOM']")).click();
		//System.out.println(driver.findElement(By.xpath("a[@Value='BOM'])[2]")).getText());
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
	}

}
