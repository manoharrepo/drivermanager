package drivermanager;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import drivermanagerresources.locators;
import io.github.bonigarcia.wdm.WebDriverManager;

public class autoit {
	
	
 public static void main(String args[]) throws  IOException, InterruptedException
 {
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.ilovepdf.com/pdf_to_jpg");
	
	 locators lp= new locators(driver);
	 lp.uploadbtn().click();
	 
		Runtime.getRuntime().exec("C:\\Users\\Manohar\\Documents\\fileupload.exe");
	

	 //File fl = new File();
		 Thread.sleep(5000);

	 lp.convert().click();
	 WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(10));
     wt.until(ExpectedConditions.presenceOfElementLocated((By) lp.download()));
	// Thread.sleep(6000);
	 lp.download().click();
	 
 }
}
