package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBoswer {

	@Test
	@Parameters("browser")
	public void tc2(String browserName) throws InterruptedException {
		WebDriver driver = null;

		if (browserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Exe/geckodriver.exe");
			driver = new FirefoxDriver();
			Thread.sleep(8000);
		} else if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Exe/chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			driver = null;
		}
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("Selenium", Keys.ENTER);
		Thread.sleep(4000);

		driver.close();
	}
	
}
