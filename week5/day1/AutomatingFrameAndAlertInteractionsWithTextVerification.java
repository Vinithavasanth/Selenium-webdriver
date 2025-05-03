package week5.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingFrameAndAlertInteractionsWithTextVerification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Launch Chrome
		ChromeDriver driver = new ChromeDriver();

		// 1. Load the URL (https://www.amazon.in/)
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");

		// add implicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Click the "Try It" button inside the frame 
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		//Click OK/Cancel in the alert that appears
		Alert alert = driver.switchTo().alert();
		
		
		//Confirm the action is performed correctly by verifying the text displayed
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		String Expectedtext="You pressed OK!";
		WebElement textDisplayed = driver.findElement(By.id("demo"));
		String text2 = textDisplayed.getText();
		  if(Expectedtext.equals(text2)) {
			 System.out.println("Performed actions is Correct");
		 }
		 
		
	}
	
	
	
	

}
