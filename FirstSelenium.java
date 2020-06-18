import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstSelenium {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
	RemoteWebDriver driver = new ChromeDriver();
	driver.get("file:///D:/new%206.html");
		driver.manage().window().maximize();
	
	driver.findElement(By.id("uname")).sendKeys("Nisha");
	driver.findElement(By.id("Password")).sendKeys("Harsh123@");

	//WebElement pswrd = driver.findElement(By.id("password"));
	//pswrd.sendKeys("Nisha123");
	
	driver.findElement(By.tagName("Button")).click();
	Thread.sleep(4000);

	driver.close();
	
	
}
}
