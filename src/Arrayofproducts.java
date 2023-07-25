import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Arrayofproducts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String[] veggie = {"Cucumber","Brocolli","Tomato","Beans"};
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");
		//Thread.sleep(3000);
		//Methods
		additems(driver,veggie);
	}
	
	public static void additems(WebDriver driver, String[] veggie ) throws InterruptedException
	{
		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
		
		int j= 0, i=0, k=1;
		
		for (i =0;i<products.size();i++)
		{
			String[] names = products.get(i).getText().split("-");
			String formatedname = names[0].trim();
			
			//Thread.sleep(200);

			
			List veggielist = Arrays.asList(veggie);
			//Array to arraylist
			if(veggielist.contains(formatedname))
			{
				for(k=1;k<5;k++)
				{
					Thread.sleep(200);
					driver.findElements(By.xpath("//a[@class='increment']")).get(i).click();
				}
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/child::button")).get(i).click();
				
				if(j==veggie.length)
				{	
					driver.findElement(By.cssSelector(".cart-icon")).click();
					driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
					driver.findElement(By.cssSelector(".promocode")).sendKeys("rahulshettyacademy");
					driver.findElement(By.cssSelector(".promoBtn")).click();
					Thread.sleep(10000);
					driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
					Select s = new Select (driver.findElement(By.xpath("//div[@class='wrapperTwo']/child::div/select")));
					Thread.sleep(1000);
					s.selectByVisibleText("India");
					driver.findElement(By.cssSelector(".chkAgree")).click();
					driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
}
}
}
}		
}