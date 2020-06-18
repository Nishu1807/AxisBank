import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AxisBank {
	public static WebDriver driver;
	public static void main(String[] args)  {
	
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    
	    driver.get("http://www.axisbank.com/");
	    driver.manage().window().maximize();
	    
	    driver.switchTo().frame("viz_iframe46665e19a54ee9115930eba4cbbBNP");
	    driver.switchTo().frame("viz_iframe46665e19a54ea01404e8dd3b552BNP");
	  
	   String creditCardText = driver.findElement(By.xpath("//div[@id=\"productContainer\"]/child::a[@id=\"product-1\"]")).getText();
	   System.out.println(creditCardText);
	   
	    
	}

}
