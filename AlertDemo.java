import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Jar Files\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///D:/SimpleAlert.html");
		driver.findElement(By.id("User")).sendKeys("Nisha");
		driver.findElement(By.xpath("/html/body/button")).click();
		Thread.sleep(4000);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(3000);
		driver.quit();
	}

}
