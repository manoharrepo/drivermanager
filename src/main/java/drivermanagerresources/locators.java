package drivermanagerresources;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class locators {

	public WebDriver driver;
	
	private By uploadbtn = By.cssSelector("a[id*=\"pickfiles\"]");
	private By convert = By.cssSelector("button[class*=\"btn--red\"]");
	private By download = By.cssSelector("a[class*='downloader__btn']");
	  public locators(WebDriver driver) {
		  // TODO Auto-generated constructor stub
		  this.driver = driver; 
	  }
	 
	public WebElement uploadbtn() {
		return driver.findElement(uploadbtn);
	}
	public WebElement convert() {
		return driver.findElement(convert);
	}
	public WebElement download() {
		return driver.findElement(download);
	}

}
