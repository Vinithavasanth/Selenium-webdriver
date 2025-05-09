package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Launch Chrome  
		ChromeDriver driver=new ChromeDriver();
		
		//Load https://www.amazon.in/
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//add  implicitlyWait
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.navigate().refresh();
		
		//Type "Bags for boys" in the Search box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");
	    
		// Choose the 	 item in the result (bags for boys)
		driver.findElement(By.xpath("//div[text()='bags for boys'][1]")).click();
		
		// Print the total number of results (like 50000) xample like this-----> 1-48 of over 50,000 results for "bags for boys"
		WebElement numberOfResult = driver.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']"));
		String text = numberOfResult.getText();
		System.out.println(text);
		
		Thread.sleep(3000);
		// Select the first 2 brands in the left menu like American Tourister, Generic)
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
		
		// Choose New Arrivals (Sort)
		driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
		driver.findElement(By.xpath("//a[@id='s-result-sort-select_4']")).click();
		
		// Print the first resulting bag info (name, discounted price)
		WebElement bagNameInfo = driver.findElement(By.xpath("//h2[@class='a-size-base-plus a-spacing-none a-color-base a-text-normal'][1]"));
		String bagName = bagNameInfo.getText();
		System.out.println(bagName);
		
		WebElement discountPriceInfo = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[4]"));
		String discountPrice = discountPriceInfo.getText();
		System.out.println(discountPrice);
		
		// Get the page title and close the browser(driver.close())
		String title = driver.getTitle();
		System.out.println(title);
		//driver.close();

	}

}
