package week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSimpleAlert {
	public static void main(String[] args) {
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// Load the url
		driver.get("https://leafground.com/alert.xhtml");

		// Maximize the Browser
		driver.manage().window().maximize();

		// To click on the show button
		driver.findElement(By.xpath("//span[text()='Show']")).click();

		// Transfer the driver focus from webpage to alert box
		Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();
	}

}
