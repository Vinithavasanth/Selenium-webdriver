package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class testleafPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		//load url
		driver.get("http://leaftaps.com/opentaps");
		//max browser
		driver.manage().window().maximize();
		//enter the username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click login button		
		driver.findElement(By.className("decorativeSubmit")).click();

	}

}
