package marathon2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tatacliq {

	public static void main(String[] args) throws InterruptedException {

		// Launch the Browswer
		ChromeDriver driver = new ChromeDriver();

		// 1. Load the url as https://www.tatacliq.com/
		driver.get("https://www.tatacliq.com/");

		// Maximize the Browser
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//pop handling
		driver.findElement(By.id("wzrk-cancel")).click();

		// 2. MouseHover on 'Brands'
		Actions mouseHover = new Actions(driver);
		WebElement brands = driver.findElement(By.xpath("//div[text()='Brands']"));
		mouseHover.moveToElement(brands).perform();

		// 3. MouseHover on 'Watches & Accessories'
		Actions mouseHover1 = new Actions(driver);
		WebElement watchaccess = driver.findElement(By.xpath("(//div[@class='DesktopHeader__categoryDetailsValue'])[4]"));
		mouseHover1.moveToElement(watchaccess).perform();
		//watchaccess.click();
		
		// 4. Choose the first option from the 'Featured brands'.
		driver.findElement(By.xpath("(//div[@class='DesktopHeader__brandsDetails'])[1]")).click();
		
		// 5. Select sortby: New Arrivals
		driver.findElement(By.xpath("//div[text()='Sort by :']")).click();
		driver.findElement(By.xpath("//option[@value='isProductNew']")).click();
		
		// 6. choose men from catagories filter.
		driver.findElement(By.xpath("(//div[@class='CheckBox__base'])[1]")).click();
		
		// 7. print all price of watches
		Thread.sleep(3000);
		List<WebElement> prices = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']"));
		int sizeOfPrice = prices.size();
		System.out.println("Total Products in a Page is:"+sizeOfPrice);
		
		//empty list to print the price list
		List<String> Pricelist= new ArrayList<String>();
		for (int i = 0; i < sizeOfPrice; i++) {
			String text1 = prices.get(i).getText();
			Pricelist.add(text1);			
		}
		System.out.println("Price list are:"+Pricelist);
		
		// 8. click on the first resulting watch.
		driver.findElement(By.xpath("(//div[@class='ProductModule__dummyDiv'])[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("All Opened windows are:"+windowHandles);
		List<String> allwinaddress= new ArrayList<String>(windowHandles);
		driver.switchTo().window(allwinaddress.get(1));
		
		// 9. Handle Alert Pop Up
		
		// 9. compare two price are similar
		WebElement price = driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']"));
		String priceInfo = price.getText();
		System.out.println("Price of first opened product is:"+priceInfo);
		
		if(Pricelist.get(0).equals(priceInfo)) {
			System.out.println("prices are Equal");
		}
		
		// 10. click Add to cart and get count from the cart icon.
		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		Thread.sleep(3000);
		WebElement addtocardcount = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']"));
		String addtocardInfo = addtocardcount.getText();
		System.out.println("Total number of items in your cart is:"+addtocardInfo);
		
		
		// 11. Click on the cart
		driver.findElement(By.xpath("//div[@class='DesktopHeader__myBagShow']")).click();
		
		// 12. Take a snap of the resulting page.
		
		// 13. Close All the opened windows one by one.
		driver.close();
		driver.switchTo().window(allwinaddress.get(0)).close();

	}

}
