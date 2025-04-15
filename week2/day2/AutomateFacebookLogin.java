package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		//load url
		driver.get("https://www.facebook.com/");
		//max browser
		driver.manage().window().maximize();
		//enter the username
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		//enter the password
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		//click login button	
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		//Click find your account and login
		driver.findElement(By.partialLinkText("Find your account and log in.")).click();
		//to get Title
		String Title = driver.getTitle();
		String ExpectedTitle = "Forgotten Password | Can't Log In | Facebook";
		System.out.println("Title of the page is:"+Title);
		    if(Title.equals(ExpectedTitle)) {
			   System.out.println("Title Matched with Current Web Page");
			
		     }
		     else {
			   System.out.println("Title not matched");
		}
		

	}

}
