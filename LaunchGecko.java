import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class LaunchGecko {
	public static WebDriver gd;
	public static void main(String[] args) {
		WebElement Element;
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Jar Files\\chromedriver_win32\\chromedriver.exe");
	    gd = new ChromeDriver();
	    gd.get("https://www.youtube.com/");
	  
	    

		
	}
	private static void getTitle() {
		// TODO Auto-generated method stub
		
	}

}
