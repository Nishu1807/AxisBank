import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAutomation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Jar Files\\chromedriver_win32\\chromedriver.exe");
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElementByName("q").sendKeys("Testing Shastra");
    
		//driver.findElementByXPath("//*[@id=\"tsf\"]/div[2]");
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(1000);
        			
        		driver.findElementByXPath("//h3[contains(text(),'A detailed scripture of Testing')]").click();
        		driver.findElementByXPath("//li[@class ='page_item page-item-963']//a[contains(text(), downloads)]").click();
        		driver.findElementByXPath("//li[@class = 'page_item page-item-736']//a[contains(text(),'Interview Questions')]").click();
        		//driver.findElementByXPath("/html[1]/body[1]/div[1]/header[1]/nav[1]/div[1]/ul[1]/li[3]/a[1]").click();
        		
        		Thread.sleep(6000);
        		driver.close();
        	
		
	
	}

}
