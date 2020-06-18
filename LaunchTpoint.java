import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchTpoint {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Jar Files\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElementByName("q").sendKeys("Tpoint");
		driver.findElementByXPath("//*[@id=\"searchform\"]"); // for click on blank space
		driver.findElementByXPath("//*[@id=\"tsf\"]/div[2]");
		driver.findElementByName("btnK").click();
		
		driver.findElementByXPath("//h3[contains(Text(),'Javatpoint: Tutorials List')]").click();
		
		driver.findElementByXPath("//h3[contains(Text(),'Selenium')]").click();
	}

}
