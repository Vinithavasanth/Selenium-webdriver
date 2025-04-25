package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandlingAndInteractionAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("Democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(3000);

		// click on contact button
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();

		// Click on Merge Contacts.
		driver.findElement(By.linkText("Merge Contacts")).click();

		// Click on the widget of the "From Contact".
		driver.findElement(By.xpath("//a[img[@src='/images/fieldlookup.gif']]")).click();
		Thread.sleep(3000);
		// driver focus
		Set<String> allwindowaddress = driver.getWindowHandles();
		System.out.println("All opened window address in From contact: " + allwindowaddress);
		List<String> allAddress = new ArrayList<String>(allwindowaddress);
		driver.switchTo().window(allAddress.get(1));
        Thread.sleep(3000);
		// Click on the first resulting contact.
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//tr/td[1]/div/a")).click();

		// return focus to parent window
		driver.switchTo().window(allAddress.get(0));

		// Click on the widget of the "To Contact".
		driver.findElement(By.xpath("(//a[img[@src='/images/fieldlookup.gif']])[2]")).click();
		Thread.sleep(3000);

		Set<String> toContactWindowHandles = driver.getWindowHandles();
		System.out.println("All opened window address in To Contact :"+toContactWindowHandles);
		List<String>allAddress2= new ArrayList<String>(toContactWindowHandles);
		driver.switchTo().window(allAddress2.get(1));

		// Click on the second resulting contact.
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table'])[2]//tr/td/div/a")).click();
		driver.switchTo().window(allAddress2.get(0));

		// Click on the Merge button.
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		// Accept the alert.
		Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();
		// Verify the title of the page.
		String title = driver.getTitle();
		String ExpectedTitle="View Contact | opentaps CRM";
		System.out.println(title);
		System.out.println("Title of the page is:"+title);
	    if(title.equals(ExpectedTitle)) {
		   System.out.println("Title Matched with Current Web Page");
		
	     }
	     else {
		   System.out.println("Title not matched");
	}
		

	}

}
