package Week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leafground {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
		
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		Set<String> window = driver.getWindowHandles();
		List<String> listwindow= new ArrayList<String>(window);
		
		driver.switchTo().window(listwindow.get(1));
		
		String text = driver.getTitle();
		String expectedtext ="Dashboard";
		
		if (text.equalsIgnoreCase(expectedtext))
			
			System.out.println("Matched");
		else System.out.println("Not Matched");
		
		driver.switchTo().window(listwindow.get(0));
		
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		
		Set<String> window2 = driver.getWindowHandles();
		List<String> listwin = new ArrayList<String>(window2);
		
		System.out.println("Total number of windows opened :"  + listwin.size());
		
		
		driver.switchTo().window(listwin.get(0));
		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		
		Set<String> window3= driver.getWindowHandles();
		List<String> listwin3 = new ArrayList<String>(window3);
		int num =listwin3.size();
		System.out.println(num);		
		for(int i=1; i<num; i++)
		{
			driver.switchTo().window(listwin3.get(i)).close();
			
		}
		
		driver.switchTo().window(listwin3.get(0));
		
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.numberOfWindowsToBe(4));
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(list.get(0));
		
		

		
	}

}
