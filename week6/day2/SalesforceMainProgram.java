package week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SalesforceMainProgram {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("bhuvanesh.moorthy@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Testleaf@2025");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//button[@class='slds-button slds-context-bar__button slds-icon-waffle_container slds-show']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Legal Entities"+Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"lgt-accordion-section-177\"]/slot/ul/li/one-app-launcher-tab-item/a/span/lightning-formatted-rich-text/span/p/mark")).click();
		driver.findElement(By.xpath("//div[@title='New']")).click();
		driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys("Salesforce Automation by Vinitha");
		//driver.findElement(By.xpath("(//input[@class='slds-input'])[1]")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Salesforce");
		WebElement None = driver.findElement(By.xpath("//span[text()='--None--']"));
		driver.executeScript("arguments[0].click();", None);
		driver.findElement(By.xpath("//span[@title='Active']")).click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		WebElement popup = driver.findElement(By.xpath("//lightning-icon[@icon-name='utility:success']//following::a"));
		String verifyPopup = popup.getText();
		System.out.println(verifyPopup);
		
		

	}

}
