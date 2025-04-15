package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		//load url
		driver.get("https://en-gb.facebook.com/");
		//max browser
		driver.manage().window().maximize();
		
		//click on create new account
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		//Enter firstname
		driver.findElement(By.name("firstname")).sendKeys("Vinitha");
		//Enter the surname
		driver.findElement(By.name("lastname")).sendKeys("Vasanth");
		//Enter mobile number or email add
		driver.findElement(By.name("reg_email__")).sendKeys("vinitha.be1997@gmail.com");
		//Enter the New password
		driver.findElement(By.name("reg_passwd__")).sendKeys("Vinitha@123");
		//// Handling dropdown
		// object creating for dateofbirth
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		//object
		Select dropdown1 = new Select(day);
		Select dropdown2 = new Select(month);
		Select dropdown3 = new Select(year);
		

		//selecting day drop down
		dropdown1.selectByIndex(10);
		//selecting month in drop down
		dropdown2.selectByIndex(10);
		//selecting year in drop down
		dropdown3.selectByValue("1997");
		
		//radio button
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		
		


	}

}
