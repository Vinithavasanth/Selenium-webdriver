package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// Load the url
		driver.get("https://www.pvrcinemas.com/");

		// Maximize the Browser
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Step1: Create Object for Actions Class
		Actions mouseHover = new Actions(driver);
		WebElement moreElement = driver.findElement(By.xpath("//span[text()='More']"));
		mouseHover.moveToElement(moreElement);
		
		//offers
		WebElement mouseHover2 = driver.findElement(By.xpath("(//div[text()='Offers'])[2]"));
		mouseHover.moveToElement(mouseHover2).perform();

	}

}
