package week6.day1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnSceenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		WebElement srcsnap = driver.findElement(By.id("username"));
		
//Step1:take the screenshot from source
		File source = srcsnap.getScreenshotAs(OutputType.FILE);
		
//Step2: Set the destination
		File destination=new File("./Snaps/username.png");
		
//Step3: Copy the source and paste it in the destination
		//full page
		FileUtils.copyFile(source, destination);
		
		
		FileUtils.copyFile(source, destination);

	}

}
