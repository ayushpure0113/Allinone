import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class spicejet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.spicejet.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz r-1g40b8q']/child::div/child::div[1]")).click();
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-knv0ih r-1k1q3bj r-ql8eny r-1dqxon3']//div[18]")).click();
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-knv0ih r-1k1q3bj r-ql8eny r-1dqxon3']//div[42]")).click();
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-16ru68a r-y47klf r-1loqt21 r-eu3ka r-1otgn73 r-1aockid']")).click();
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz r-19h5ruw r-184en5c']/child::div[1]")).click();
		driver.findElement(By.cssSelector("div[class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")).click();
		int i = 1;
		for(i=1; i<=5;i++)
		{
			driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-k8qxaj r-d9fdf6']/child::div[1]//child::div[3]")).click();
			Thread.sleep(1000);
		}
	    Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz r-19h5ruw r-184en5c']/child::div[2]")).click();
		driver.findElement(By.xpath("(//div[contains(text(),'Senior Citizen')]/parent::div/parent::div/div)[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div.css-1dbjc4n.r-akgwms.r-13awgt0.r-1pi2tsx.r-p1pxzi.r-sa2ff0.r-1udh08x div.css-1dbjc4n.r-1niwhzg.r-1jgb5lz.r-r0h9e2.r-13qz1uu div.css-1dbjc4n.r-14lw9ot:nth-child(1) div.css-1dbjc4n.r-14lw9ot.r-z2wwpe.r-vgw6uq.r-156q2ks.r-urutk0.r-8uuktl.r-136ojw6:nth-child(3) div.css-1dbjc4n.r-1pcd2l5.r-1uwte3a.r-m611by.r-bnwqim:nth-child(2) div.css-1dbjc4n.r-18u37iz.r-1wtj0ep.r-1lgpqti:nth-child(7) div.css-1dbjc4n:nth-child(2) > div.css-1dbjc4n.r-1awozwy.r-z2wwpe.r-1loqt21.r-18u37iz.r-1777fci.r-1g94qm0.r-1w50u8q.r-ah5dr5.r-1otgn73")).click();
		//driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-1w50u8q r-ah5dr5 r-1otgn73']/child::div)[1]")).click();
		}

}
	