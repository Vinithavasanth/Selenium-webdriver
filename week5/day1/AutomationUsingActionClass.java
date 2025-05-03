package week5.day1;



import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomationUsingActionClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Launch Chrome
		ChromeDriver driver = new ChromeDriver();

		// 1. Load the URL (https://www.amazon.in/)
		driver.get("https://www.amazon.in/");
		driver.navigate().refresh();
		driver.manage().window().maximize();

		// add implicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().refresh();
		
		//2. Search for "oneplus 9 pro".
		Actions mouseHover = new Actions(driver);
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		mouseHover.moveToElement(search).perform();
		search.click();
		mouseHover.sendKeys("oneplus 9 pro"+Keys.ENTER).perform();
		
	    //3. Get the price of the first product.
		//Actions mouseHoverToFirstProduct = new Actions(driver);
		WebElement priceOf1Product = driver.findElement(By.xpath("(//span[@class='a-price'])[1]"));
		//mouseHoverToFirstProduct.moveToElement(priceOf1Product);
		String Price = priceOf1Product.getText();
		System.out.println("price of the first product is:"+Price);
		
	    //4. Print the number of customer ratings for the first displayed product.
		WebElement rating = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]"));
		String Ratingtext = rating.getText();
		System.out.println("customer ratings for the first displayed product:"+Ratingtext);
		
		//5. Click the first text link of the first image.
		Actions mouseHoverTofirstTextLink=new Actions(driver);
		WebElement firstTextLink = driver.findElement(By.xpath("//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal']"));
		mouseHoverTofirstTextLink.moveToElement(firstTextLink);
		firstTextLink.click();
		
		//6. Take a screenshot of the product displayed.
		
		//transfer driver focus to 1st link text
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("All opened window are:"+windowHandles);
		List<String> allAddress = new ArrayList<String>(windowHandles);
		driver.switchTo().window(allAddress.get(1));
		
		Thread.sleep(2000);
		//7. Click the 'Add to Cart' button.
		Actions addToCart = new Actions(driver);
		WebElement addTocartbutton = driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]"));
		addToCart.moveToElement(addTocartbutton).click().build().perform();
		
		//Transfer driver focus
		//Set<String> subTotalwindow = driver.getWindowHandles();
		//System.out.println("All opened window are:"+subTotalwindow);
		//List<String> allAddressnew = new ArrayList<String>(subTotalwindow);		
		//driver.switchTo().window(allAddressnew.get(1));
		
		//8. Get the cart subtotal and verify if it is correct.
		Thread.sleep(5000);
		WebElement subTotalElement = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']"));
		String subTotalValue = subTotalElement.getText();
		System.out.println(subTotalValue);
		   if(subTotalElement==priceOf1Product) {
			System.out.println("Price is Equal so verified");
		    }

		//9. Close the browser
		//driver.close();

	}

}
