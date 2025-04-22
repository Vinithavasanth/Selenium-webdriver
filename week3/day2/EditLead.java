package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Browser Initialize
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Graas");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Vinitha");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("M");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Vinitha");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software Tester");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("vinitha.be1997@gmail.com");
		WebElement State = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropdown = new Select(State);
		dropdown.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_description")).sendKeys("Selenium Automation Tester course completed in TestLeaf");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String titleOfPage = driver.getTitle();
		System.out.println(titleOfPage);

		
	}

}
