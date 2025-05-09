package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week5.day2.SalesforceStaticBaseClass;

public class SalesforceDynamic extends SalesforceStaticBaseClass {

	//public EdgeDriver driver;
	
	@DataProvider(name="fetchData")
	public String[][] sendData(){
		String [][] data=new String[2][1];
		data[0][0]="Vinitha";
		data[1][0]="Vasanth";
		return data;
	}

	@Test(dataProvider = "fetchData")
	public void runSalesforceDynamicmethod(String yourname) {
			
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Legal Entities"+Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"lgt-accordion-section-177\"]/slot/ul/li/one-app-launcher-tab-item/a/span/lightning-formatted-rich-text/span/p/mark")).click();
		driver.findElement(By.xpath("//div[@title='New']")).click();
		driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys("Salesforce Automation by:"+ yourname);
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		WebElement popup = driver.findElement(By.xpath("//lightning-icon[@icon-name='utility:success']//following::a"));
		String verifyPopup = popup.getText();
		System.out.println(verifyPopup);

	}

}
