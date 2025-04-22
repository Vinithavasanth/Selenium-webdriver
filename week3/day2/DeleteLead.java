package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Browser Initialize
				EdgeDriver driver = new EdgeDriver();
				driver.get("http://leaftaps.com/opentaps");
				driver.manage().window().maximize();
				driver.findElement(By.id("username")).sendKeys("Democsr");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Leads")).click();
		        driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		        driver.findElement(By.xpath("//span[text()='Email']")).click();
		        driver.findElement(By.name("emailAddress")).sendKeys("vinitha.be1997@gmail.com");
		        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//a[text()='11693']")).click();
		        //driver.findElement(By.xpath("//a[text()='Delete']")).click();
		        //driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		      
		        //driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

	}

}
