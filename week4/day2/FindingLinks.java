package week4.day2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		//load url
		driver.get("https://en-gb.facebook.com/");
		//max browser
		driver.manage().window().maximize();
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		 		
		//count the number of links
		int numberOfLinks = allLinks.size();
		System.out.println("The number of links is :"+numberOfLinks);
		
		//Print the Links
		List<String> allStrings=new ArrayList<String>();
		for (int i = 0; i < numberOfLinks; i++) {
			String text = allLinks.get(i).getText();
			allStrings.add(text);
			
		}
		System.out.println("The links are: "+allStrings);
		
		

	}

}
