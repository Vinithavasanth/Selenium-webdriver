package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioListInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement search = driver.findElement(By.name("searchVal"));
		search.sendKeys("Bags"+Keys.ENTER);
		driver.findElement(By.xpath("(//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men'])[1]']")).click();
		driver.findElement(By.xpath("(//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags)[1]']")).click();
		
		//to get brands list
		List<WebElement> Brands = driver.findElements(By.xpath("//div[@class='brand']/strong"));
		
		//to get name of bag
		List<WebElement> Names = driver.findElements(By.xpath("//div[@class='nameCls']"));
		
		//count of brand
		int numberofBrands = Brands.size();
		System.out.println("The number of brands found in a page is:"+numberofBrands);
		
		//Empty list to print brand names
		List<String> Brandslist= new ArrayList<String>();	
		//Empty list to print the names of the bag
		List<String> Namelist= new ArrayList<String>();		
		for (int i = 0; i < numberofBrands; i++) {
			String text = Brands.get(i).getText();
			String text2 = Names.get(i).getText();
			Brandslist.add(text);
  			Namelist.add(text2);
			
		}
		System.out.println("The Brands names are :"+Brandslist);
		System.out.println("The Names of the bags are :"+Namelist);
		
		}
		
		
	}

