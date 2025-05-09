package week6.day1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLeadExcel extends BaseClassCreateLead {
		
		@DataProvider(name="fetchData")
		public String[][] sendData() throws IOException {
			
			String[][] readData = ReadExcel.readData();
			 return readData;

		}
		
	@Test(dataProvider = "fetchData")
	public void runCreateLead(String companyName, String firstName, String lastName ) {
			
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
			driver.findElement(By.name("submitButton")).click();
			
	}
	}


