package week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProSpecMethodBaseClass {
	public EdgeDriver driver;

	@BeforeMethod
	public void preConditions() {
		// Launch the browser
		driver = new EdgeDriver();

		// Login to https://login.salesforce.com
		driver.get("https://login.salesforce.com");

		// Maximize the window
		driver.manage().window().maximize();

		// - Username: dilip@testleaf.com
		driver.findElement(By.id("username")).sendKeys("bhuvanesh.moorthy@testleaf.com");

		// - Password: testleaf@2024
		driver.findElement(By.id("password")).sendKeys("Testleaf@2025");
		driver.findElement(By.id("Login")).click();

		// - Click on the toggle menu button from the left corner
		driver.findElement(By.xpath("//span[@tit='App Launcher']")).click();

	}

	@AfterMethod
	public void postConditions() {
		driver.close();

	}

}
