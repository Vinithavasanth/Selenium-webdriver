package marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.sukgu.Shadow;

public class orderingMobile {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		// URL:https://dev186929.service-now.com/
		// User name: admin
		// Password: 2AqjN!lC2!Vy

		// Launch the Browswer
		ChromeDriver driver = new ChromeDriver();

		// 1. Load the url as https://www.tatacliq.com/
		driver.get("https://dev186929.service-now.com/");

		// Maximize the Browser
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// 2. Login with valid credentials username as admin and password
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("2AqjN!lC2!Vy");
		driver.findElement(By.id("sysverb_login")).click();

		// 3. Click-All Enter Service catalog in filter navigator and press enter or
		Shadow shd = new Shadow(driver);
		shd.setImplicitWait(30);
		// Actions mouseHover = new Actions(driver);
		Thread.sleep(3000);
		shd.findElementByXPath("//div[text()='All']").click();
		// mouseHover.moveToElement(all);
		// all.click();
		// shd.findElementByXPath("//input[@id='filter']").sendKeys("Service
		// Catalog"+Keys.ENTER);

		// Click the ServiceCatalog
		Thread.sleep(3000);
		shd.findElementByXPath("//a[@id='e660172ac611227b00fa88fb47ae3fad']").click();

		// 4. Click on mobiles
		WebElement sss = shd.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(sss);
		driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();

		// 5. Select Apple iphone13pro
		driver.findElement(By.xpath("//a[@id='item_link_73b1bafa9752cd1021983d1e6253afb5']")).click();

		// 6. Choose yes option in lost or broken
		driver.findElement(By.xpath("(//label[@class='radio-label'])[1]")).click();

		// 7. Enter phonenumber as 99 in original phonenumber field
		driver.findElement(By.xpath("//input[@class='cat_item_option sc-content-pad form-control']"))
				.sendKeys("99" + Keys.ENTER);

		// 8. Select Unlimited from the dropdown in Monthly data allowance
		WebElement Dropdown = driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']"));
		Select data = new Select(Dropdown);
		data.selectByVisibleText("Unlimited [add $4.00]");

		// 9. Update color field to SierraBlue and storage field to 512GB
		driver.findElement(By.xpath("(//label[@class='radio-label'])[7]")).click();
		driver.findElement(By.xpath("(//label[@class='radio-label'])[10]")).click();

		// 10. Click on Order now option
		driver.findElement(By.id("oi_order_now_button")).click();
		Thread.sleep(3000);

		// 11. Verify order is placed and copy the request number
		String title = driver.getTitle();
		WebElement reqnum = driver.findElement(By.id("requesturl"));
		String RequestNumber = reqnum.getText();
		if (title.contains(RequestNumber)) {
			System.out.println("Title matched");
		}
		// 12.Take a Snapshot of order placed page
		// Step1:take the screenshot from source
		File source = driver.getScreenshotAs(OutputType.FILE);

		// Step2: Set the destination
		File destination = new File("./Snaps/orderpage.png");

		// Step3: Copy the source and paste it in the destination
		// full page
		FileUtils.copyFile(source, destination);

	}

}
