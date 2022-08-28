package Week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sales {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
		
		driver.findElement(By.id("username")).sendKeys("ramkumar.ramaiah@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Password#123");
		driver.findElement(By.id("Login")).click();
		
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		
		Set<String> window = driver.getWindowHandles();
		List<String> list = new ArrayList(window);
			
		driver.switchTo().window(list.get(1));
		
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();		
		driver.findElement(By.xpath("(//button[text()='Accept All Cookies'])[2]")).click();
		String text = driver.getTitle();
		System.out.println(text);
		
		driver.switchTo().window(list.get(0));
		driver.quit();
		
		
		
	}
}
