import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class SelectOptionDemo {
public static void main(String[] args) throws InterruptedException {
	//System.setProperty("webdriver.chrome.driver", "D:\\Jar Files\\chromedriver_win32\\chromedriver.exe");
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.get("https://www.naukri.com/");
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//button[@ class = \"btn waves-effect waves-light btn-large\"]")).click();
	driver.findElement(By.xpath("//a[contains(text(), 'Search CVs for Free now')]")).click();
	Thread.sleep(4000);
	
	ArrayList<String> tabs = new ArrayList<> (driver.getWindowHandles());
    driver.switchTo().window(tabs.get(1));
    
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scroll(2000,0)");
	
	driver.findElement(By.id("min_ctc")).click();
	Thread.sleep(2000);
	driver.quit();
	}

}
