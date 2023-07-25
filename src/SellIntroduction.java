import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SellIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.ChromeDriver", "C:\\Users\\ayush.sharma1\\Downloads\\chromedriver_win32 (1).exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.close();
		

	}

}