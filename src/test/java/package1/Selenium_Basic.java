package package1;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Selenium_Basic {

	public static void main(String[] args) throws Exception {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("harshitha@gamil.com");
		driver.findElement(By.id("pass")).sendKeys("harshitha1234");
		System.out.println(driver.getTitle());
		
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 // Take FULL page screenshot ✅
       // File f = ((ChromeDriver) driver).getFullPageScreenshotAs(OutputType.FILE);
	     Files.copy(f, new File("D:\\Users\\dell\\Desktop\\growskill it\\Output\\FBhomepage.png"));
	     
		Thread.sleep(2000);
		driver.close();
		
	}

}
