import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.ChromeDriver", "C:\\Users\\ayush.sharma1\\Downloads\\chromedriver_win32 (1).exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("fgh@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys("socialplaygmailcom");
		driver.findElement(By.className("submit")).click();
		System.out.println(driver.findElement(By.cssSelector(".error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("asdewq");
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("asde@wasdt");
		driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("98767656555");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector(".infoMsg")).getText());


}
}