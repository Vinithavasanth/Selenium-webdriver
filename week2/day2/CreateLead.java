package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// launch the browser
		ChromeDriver driver = new ChromeDriver();

		// load url
		driver.get("http://leaftaps.com/opentaps");

		// max browser
		driver.manage().window().maximize();

		// enter the username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		// enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click login button
		driver.findElement(By.className("decorativeSubmit")).click();

		// Click on CRMFSA
		driver.findElement(By.linkText("CRM/SFA")).click();

		// Click on the Leads tab
		driver.findElement(By.linkText("Leads")).click();

		// Click on the Create Lead
		driver.findElement(By.linkText("Create Lead")).click();

		// Enter First Name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vinitha");

		// Enter Last Name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");

		// Enter Company Name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Graas");

		// Enter a Title
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Senior Associate");

		// Handling dropdown
		// Step1: Find the Element
		WebElement sourceElement = driver.findElement(By.id("createLeadForm_dataSourceId"));

		// Step2:Create object for the class
		Select dropdown = new Select(sourceElement);

		// Step3:Use the method to handle
		dropdown.selectByIndex(4);

		// Click on CreateLead button
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();

	}

}
