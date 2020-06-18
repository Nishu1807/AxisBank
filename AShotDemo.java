import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class AShotDemo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Jar Files\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	//driver.get("http://www.testingshastra.com/Assignments/SimpleAlert.html");
	driver.get("http://www.testingshastra.com/");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	
	AShot ashot = new AShot();
	ashot.shootingStrategy(ShootingStrategies.viewportPasting(3000));
	Screenshot sc = ashot.takeScreenshot(driver);
	BufferedImage image = sc.getImage();	
	try {
	ImageIO.write(image, "JPG", new File("UsingAshothot.jpg"));
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	finally {
		driver.quit();
	}
	//TakesScreenshot ts = (TakesScreenshot)driver;
	
}
}
