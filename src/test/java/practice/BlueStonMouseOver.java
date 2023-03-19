package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BlueStonMouseOver {

	@Test
	@Parameters("browser")
	public void mouse(String browserName) throws InterruptedException {
		
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
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.bluestone.com/");

WebElement pop = driver.findElement(By.xpath("//div[@class='popup-content']//span[contains(.,'Not now')]"));
		
		
      WebDriverWait ww = new WebDriverWait(driver, 10);
		
		ww.until(ExpectedConditions.visibilityOf(pop));
		pop.click();
		
		List<WebElement> tabs = driver.findElements(By.xpath("//ul[@class='wh-main-menu']/li"));
		
		Actions a = new Actions(driver);
		
		for (WebElement tab : tabs) {
			a.moveToElement(tab).perform();
			Thread.sleep(1000);
			
		}

		driver.close();
		
	}
	
}
