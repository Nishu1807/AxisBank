import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PopUp {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Jar Files\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions option = new ChromeOptions();
		//option.getPlatform();
		option.addArguments("--disable-notifications", "--start-maximized");
		option.setCapability("ACCEPT_SSL_CERTIFICATE", true);
		RemoteWebDriver driver = new ChromeDriver(option);
		driver.get("http://www.axisbank.com/");
		System.out.println(option.getPlatform().getCurrent());
		
		//driver.get("http://www.bookmyshow.com/");
		
	}

}
