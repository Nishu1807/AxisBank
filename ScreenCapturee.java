import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenCapturee {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Jar Files\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.testingshastra.com/Assignments/prompt.html");
		driver.manage().window().maximize();
		Robot robo = new Robot();
		Rectangle rec = new Rectangle();
		rec.setFrameFromDiagonal(0, 0, 1200, 800);
		
		Thread.sleep(5000);
		BufferedImage img=robo.createScreenCapture(rec);
		ImageIO.write(img, "PNG", new File("D:\\ScreenShot\\Nisha.png"));
	}
}
