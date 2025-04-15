package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreadAccountLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// launch the browser
				EdgeDriver driver = new EdgeDriver();

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
				
				//Click on Accounts
				driver.findElement(By.xpath("//a[text()='Accounts']")).click();
				
				//Click on the create account button
				driver.findElement(By.xpath("//a[text()='Create Account']")).click();
				
				//Enter an account name
				driver.findElement(By.id("accountName")).sendKeys("TestLeaf");
				
				//Enter a description as "Selenium Automation Tester."
				driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
				
				//Select "ComputerSoftware" as the industry.
				WebElement sourceElement = driver.findElement(By.name("industryEnumId"));
				Select industry=new Select(sourceElement);
				industry.selectByValue("IND_SOFTWARE");
				
				
				//Select "S-Corporation" as ownership using SelectByVisibleText.
				WebElement element = driver.findElement(By.name("ownershipEnumId"));
				Select ownership=new Select(element);
				ownership.selectByIndex(4);
				
				//Select "Employee" as the source using SelectByValue.
				WebElement element2 = driver.findElement(By.id("dataSourceId"));
				Select source = new Select(element2);
				source.selectByValue("LEAD_EMPLOYEE");
				
				//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
				WebElement element3 = driver.findElement(By.id("marketingCampaignId"));
				Select marketingcampgain= new Select(element3);
				marketingcampgain.selectByIndex(6);
				
		        //Select "Texas" as the state/province using SelectByValue.
				//driver.findElement(by)
				
				//Click the "Create Account" button.
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				//Verify that the account name is displayed correctly.
				//Close the browser window.

	}

}
