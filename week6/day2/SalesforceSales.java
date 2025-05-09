package week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SalesforceSales {

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
        driver.findElement(By.xpath("//p[text()='Sales']")).click();
        WebElement account = driver.findElement(By.xpath("//span[text()='Accounts']"));
        driver.executeScript("arguments[0].click();", account);
        driver.findElement(By.xpath("//div[text()='New']")).click();
        driver.findElement(By.xpath("(//input[@class='slds-input'])[5]")).sendKeys("Vinitha");
        driver.findElement(By.xpath("(//span[text()='--None--'])[3]")).click();
        driver.findElement(By.xpath("//span[text()='Public']")).click();
        driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();

	}

}
