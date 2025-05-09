package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PvrCinemas {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@Class='cities-placed'])[2]")).click();
		
		driver.findElement(By.xpath("//span[@Class='sc-gsTDqH ghtqhz pointer']")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//4) Click on Cinema under Quick Book
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
        
		//5) Select Your Cinema
        driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
        driver.findElement(By.xpath("//span[text()='PVR AEROHUB Chennai']")).click();
    
      
		//6) Select Your Date as Tomorrow
        driver.findElement(By.xpath("//span[text()='Tomorrow']")).click();
        
		//7) Select Your Movie
        //driver.findElement(By.xpath("//span[text()='Select Movie']/parent::div")).click();
        driver.findElement(By.xpath("(//span[text()='KESARI CHAPTER 2'])[2]")).click();
        
		//8) Select Your Show Time
        //driver.findElement(By.xpath("//span[text()='Select Timing']")).click();
        driver.findElement(By.xpath("//span[text()='06:45 PM']")).click();
        
		//9) Click on Book Button
        driver.findElement(By.xpath("(//span[text()='Book'])[5]")).click();
        
		//10) Click Accept on Term and Condition
        driver.findElement(By.xpath("//button[text()='Accept']")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//button[text()='Accept']")).click();
        Thread.sleep(2000);
		//11) Click any one available seat
        driver.findElement(By.id("PE.PRIME|C:15")).click();
        
		//12) Click Proceed Button
        driver.findElement(By.xpath("//button[text()='Proceed']")).click();
        
		//13) Print the Seat info under book summary
        driver.findElement(By.xpath("//p[text()='C15']")).getText();
        
		//14) Print the grand total under book summary
        driver.findElement(By.xpath("//h6[text()='Grand Total']/following::h6/span")).getText();
        
		//15) Click Proceed Button
        driver.findElement(By.xpath("//button[@class=\"sc-dQpIV kXNFEA btn-proceeded\"]")).click();
        
		//16) Close the popup
        driver.findElement(By.xpath("(//i[@class=\"pi pi-times\"])[2]")).click();
        
		//17) Print Your Current Page title
        String title= driver.getTitle();
        System.out.println("Title of current Page:"+title);
		//18) Close Browser

	}

}
