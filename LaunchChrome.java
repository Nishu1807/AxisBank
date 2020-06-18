import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LaunchChrome {
	private static RemoteWebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Jar Files\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver drv = new ChromeDriver();
		drv.get("https://www.google.com/");
		driver.manage().window().maximize();
	}

}
