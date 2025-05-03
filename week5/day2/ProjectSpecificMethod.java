package week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ProjectSpecificMethod extends ProSpecMethodBaseClass{

	@Test
   public void runProjectSpecificMethod() {
		
	   // - Click View All and click Legal Entities from App Launcher
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Legal Entities']")).click();
		
		// - Click on the Dropdown icon in the legal Entities tab
		driver.findElement(By.xpath("(//span[text()='Recently Viewed | Legal Entities'])[1]")).click();
		//WebElement Dropdown = driver.findElement(By.xpath("(//span[text()='Recently Viewed | Legal Entities'])[1]"));
		//Select dropdown1=new Select(Dropdown);
		//dropdown1.selectByIndex(0);
			
		// - Click on New Legal Entity
		driver.findElement(By.xpath("//span[text()='New Legal Entity']")).click();
		
		// - Enter the Company name as 'TestLeaf'.
		driver.findElement(By.id("input-180")).sendKeys("TestLeaf");
		
		// - Enter Description as 'Salesforces'.
		driver.findElement(By.id("input-196")).sendKeys("Salesforces");
		
		// - Select Status as 'Active'
		WebElement Status = driver.findElement(By.xpath("//button[@id='combobox-button-203']"));
		Select statusOptions = new Select(Status);
		statusOptions.selectByIndex(1);
		
		// - Click on Save
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
         //- Verify the Alert message (Complete this field) displayed for Name
		

	}

}
//runProjectSpecificMethod  -@Test
//preConditions  -@BeforeMethod
//postConditions -@AfterMethod
