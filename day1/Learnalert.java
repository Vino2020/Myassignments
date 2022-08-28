package Week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learnalert {
		public static void main(String[] args) {
			
	
	WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.leafground.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.findElement(By.xpath("//*[text()='Browser']/ancestor::a")).click();        
			driver.findElement(By.xpath("//span[text()='Alert']/ancestor::a")).click();
			driver.findElement(By.xpath("//span[text()='Show']/ancestor::button)[1]")).click();
			
			Alert alert= driver.switchTo().alert();
			String text =alert.getText();
			System.out.println(text);
			alert.accept();
			
			driver.findElement(By.xpath("//span[text()='Show']/ancestor::button)[2]")).click();
			Alert alert2= driver.switchTo().alert();
			String text2 =alert2.getText();
			System.out.println(text2);
			alert.dismiss();
			
			
			
		}
}
	

