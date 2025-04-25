package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.irctc.co.in/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();

		Set<String> allWindowAddress = driver.getWindowHandles();
		System.out.println("All window address is :" + allWindowAddress);

		List<String> allAddress = new ArrayList<String>(allWindowAddress);

		// Transferring driver focus
		driver.switchTo().window(allAddress.get(1));

		String CurrentTitle = driver.getTitle();
		System.out.println("Current Page title is:" + CurrentTitle);

		driver.switchTo().window(allAddress.get(0));

		driver.close();

	}

}
