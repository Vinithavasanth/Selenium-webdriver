package week5.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebtable {

	public static void main(String[] args) {
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// Load the url
		driver.get("https://www.leafground.com/table.xhtml");

		// Maximize the Browser
		driver.manage().window().maximize();

		// locate a table
		WebElement table = driver.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody"));

		// Find the number of rows
		List<WebElement> findElements = table.findElements(By.tagName("tr"));

		int rowCount = findElements.size();
		System.out.println("Number of Rows " + rowCount);

		// Find the column count
		List<WebElement> column = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr[1]/td"));

		int columnCount = column.size();
		System.out.println("Number of Columns is: " + columnCount);

		// Retrieve a particular data
		WebElement row1Col1Data = driver.findElement(
				By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr[1]/td[1]"));
		String row1col1Value = row1Col1Data.getText();
		System.out.println("Value is: " + row1col1Value);
		
		//Retrieve 1 entire row
		List<WebElement> row2Data= driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr[2]/td"));
			
		//[WE1, WE2, WE3, WE4, WE5, WE6]
		//  0    1    2    3    4    5
		    for (int i = 0; i < row2Data.size(); i++) {
		    	String text = row2Data.get(i).getText();
		    	System.out.println("Row 2 Data: "+text);
			}
		
		//To retrieve the entire data
		List<WebElement> entireData = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr/td"));
		
		  for (int i = 0; i <entireData.size(); i++) {
			  String text = entireData.get(i).getText();
			  System.out.println("The entire data is: "+text);
		}

	}

}
