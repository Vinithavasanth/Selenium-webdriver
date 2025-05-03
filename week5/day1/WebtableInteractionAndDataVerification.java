package week5.day1;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableInteractionAndDataVerification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Launch Chrome
				ChromeDriver driver = new ChromeDriver();

				// Load the URL (https://www.amazon.in/)
				driver.get("https://erail.in/");
				driver.manage().window().maximize();

				// add implicitlyWait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				//Enter "MAS" as the "From" station.
				driver.findElement(By.id("txtStationFrom")).clear();
				driver.findElement(By.id("txtStationFrom")).sendKeys("MAS"+Keys.ENTER);
				
				//- Enter "MDU" as the "To" station. 
				driver.findElement(By.id("txtStationTo")).clear();
				driver.findElement(By.id("txtStationTo")).sendKeys("MDU"+Keys.ENTER);
				
				//- Uncheck the "Sort on Date" checkbox.
				WebElement checkbox = driver.findElement(By.id("chkSelectDateOnly"));
				if(checkbox.isSelected()) {
					checkbox.click();
				}
				
				//- Retrieve the train names from the web table. 
				//List<WebElement> row2col2data = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']"));
				List<WebElement> row2col2data = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr/td[2]"));
				int row2col2dataSize = row2col2data.size();
				for (int i = 0; i < row2col2dataSize; i++) {
					String trainnames = row2col2data.get(i).getText();
					System.out.println("Entire Train name:"+trainnames);
					
					
				}
				
				//- Verify if there are any duplicate train names in the web table.		

	}

}
