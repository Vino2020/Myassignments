package Week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapshot {
	
	public static void main(String[] args) throws IOException {
		
				WebDriverManager.chromedriver().setup();				
				ChromeDriver driver = new ChromeDriver();				
				driver.get("http://www.google.com");

				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				
				File source = driver.getScreenshotAs(OutputType.FILE);	
				File dest = new File("./snaps/Pic002.jpg");
				FileUtils.copyFile(source, dest);
				
				
	}

}
