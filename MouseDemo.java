import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Jar Files\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.testingshastra.com/");
		driver.manage().window().maximize();
		// driver.findElement(By.xpath("//li[@ id = \'menu-item-363\']
		// a[contains(text()Dowloads)]")).click();
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-item-153\"]")));
		
		//action.moveToElement(driver.findElement(By.xpath("//*[@id=\"masthead\"]/div[1]/div[2]/div[2]/div[1]/div[2]/span[2]")));
		action.build();
		action.perform();
	}
}