import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Implicit {
	private static WebDriver driver;

	public static FluentWait waiting() {
		FluentWait wait = new FluentWait(driver);
		wait.withTimeout(5, TimeUnit.SECONDS);
		wait.ignoring(NoSuchElementException.class);
		wait.pollingEvery(100, TimeUnit.SECONDS);
		return wait;
	}
	
  public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Jar Files\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	//FluentWait wait = new FluentWait(driver);
	//wait.withTimeout(3000, TimeUnit.MILLISECONDS);
	//wait.pollingEvery(200, TimeUnit.MILLISECONDS);
	//wait.until(ExpectedConditions.alertIsPresent());
	//wait.ignoring(NoSuchElementException.class,ElementClickInterceptedException.class);
	
	waiting().until(ExpectedConditions.elementToBeClickable(By.xpath("//button")));
	waiting().until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(""))));
	 WebElement button = driver.findElement(By.xpath("//button"));
	 button.click();
	 
	
	/*
	 * WebDriverWait
	 * It has difffernt constructors which provide differnt variations of Explicit wait with respect
	 * driver instance.
	 */
  }
}
