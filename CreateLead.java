package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();

		WebElement elementuser= driver .findElement(By.id("username"));
		elementuser.sendKeys("Demosalesmanager");

		WebElement elementpswd=driver.findElement(By.id("password"));
		elementpswd.sendKeys("crmsfa");

		WebElement elementbutton= driver.findElement(By.className("decorativeSubmit"));
		elementbutton.click();

		WebElement elementLink = driver.findElement(By.linkText("CRM/SFA"));
		elementLink.click();
		
		WebElement elementlead= driver.findElement(By.linkText("Leads"));
		elementlead.click();

		WebElement elementCreateLead= driver.findElement(By.linkText("Create Lead"));
		elementCreateLead.click();

		WebElement elementCreateName = driver.findElement(By.id("createLeadForm_companyName"));
		elementCreateName.sendKeys("Vega Test Ltd");

		WebElement elementFirst = driver.findElement(By.id("createLeadForm_firstName"));
		elementFirst.sendKeys("Vishwath");

		WebElement elementLastName= driver.findElement(By.id("createLeadForm_lastName"));
		elementLastName.sendKeys("Kanna");

		WebElement elementLocalname= driver.findElement(By.id("createLeadForm_firstNameLocal"));
		elementLocalname.sendKeys("Vish");

		WebElement elementdepartment =driver.findElement(By.id("createLeadForm_departmentName"));
		elementdepartment.sendKeys("Test");

		WebElement elementdesc =driver.findElement(By.id("createLeadForm_description"));
		elementdesc.sendKeys("This is my first selenium project");

		WebElement elementemail =driver.findElement(By.id("createLeadForm_primaryEmail"));
		elementemail.sendKeys("Testmail@gmail.com");

		WebElement elementState = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));

		Select dd= new Select(elementState);
		dd.selectByVisibleText("New York");

		WebElement elementcreatelead = driver.findElement(By.className("smallSubmit"));
		elementcreatelead.click();
		
		System.out.println("The title is :" +driver.getTitle()); 
		
		
	}

}
