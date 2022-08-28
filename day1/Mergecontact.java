package Week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mergecontact {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Demosalesmanager");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Contacts")).click();
		
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		
		driver.findElement(By.xpath("(//img[@alt=\"Lookup\"])[1]")).click();
		
		
		Set<String> windowhandle =driver.getWindowHandles();
		List<String> window = new ArrayList<String>(windowhandle);
		driver.switchTo().window(window.get(1));
		
		
		driver.findElement(By.xpath("//a[text()='DemoCustomer']")).click();
		
		driver.switchTo().window(window.get(0));
		driver.findElement(By.xpath("(//img[@alt=\"Lookup\"])[2]")).click();
		
		Set<String> windowhandle2 = driver.getWindowHandles();
		List<String>  window2 = new ArrayList<String>(windowhandle2);
		driver.switchTo().window(window2.get(1));
		driver.findElement(By.xpath("//a[text()='DemoLBCust']")).click();
		
		driver.switchTo().window(window2.get(0));
		driver.findElement(By.xpath("//a[@class=\"buttonDangerous\"]")).click();
		
		Alert alr = driver.switchTo().alert();
		
		String text= alr.getText();
		System.out.println(text);
		alr.accept();
		
		String title = driver.getTitle();
		String expectedtitle = "Merge Contacts | opentaps";
		System.out.println(title);
		
		if (title.equalsIgnoreCase(expectedtitle))
		{
			System.out.println("Title matched");
		}	
		else
			System.out.println("Not matched");
	}
	
}
