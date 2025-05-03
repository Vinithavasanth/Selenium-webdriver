package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnScroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		driver.get("https://www.amazon.in/");
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Actions act = new Actions(driver);
		WebElement scrollele = driver.findElement(By.linkText("Conditions of Use & Sale"));
		act.scrollToElement(scrollele).perform();
		scrollele.click();

	}

}
