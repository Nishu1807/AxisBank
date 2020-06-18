import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.gargoylesoftware.htmlunit.javascript.host.event.KeyboardEvent;

public class HandlingKeyboard {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Jar Files\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.testingshastra.com/Assignments/prompt.html");
	Actions action = new Actions(driver);
	action.sendKeys(Keys.TAB);
	Thread.sleep(3000);
	
	action.sendKeys(Keys.ENTER);
	action.build().perform();
	
	action.sendKeys("Nisha");
	action.build().perform();
}
}
