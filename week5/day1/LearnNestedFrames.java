package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNestedFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// Load the url
		driver.get("https://www.leafground.com/frame.xhtml");

		// Maximize the Browser
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// transfer the driver focus to outer frame
		driver.switchTo().frame(2);

		// transfer the driver focus to inner frame

		// By Name/ID
		// driver.switchTo().frame("frame2");

		// By Index
		driver.switchTo().frame(0);

		// By Webelement
		// WebElement findElement = driver.findElement(By.id("frame2"));
		// driver.switchTo().frame(findElement);

		// Click on the Clickme button
		driver.findElement(By.id("Click")).click();

		// Transfer the driver focus to the main webpage
		// driver.switchTo().defaultContent();

		// Transfer the driver focus to the parent frame
		// driver.switchTo().parentFrame();

	}

}
