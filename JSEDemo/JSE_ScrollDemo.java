package JSEDemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class JSE_ScrollDemo {
	public void ScrollWindow() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Jar Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://howtodoinjava.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
	     js.executeScript("window.scroll(0,2000)");
	     js.executeAsyncScript("document.getElementsByTagName('a')[25].click()");

	}
	public static void main(String[] args) throws InterruptedException {
		JSE_ScrollDemo sc = new JSE_ScrollDemo();
		sc.ScrollWindow();
	}

}
