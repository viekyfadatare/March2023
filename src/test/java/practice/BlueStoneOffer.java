package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BlueStoneOffer {

	
	@Test
	@Parameters("browser")
	public void offer(String browserName) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "./Exe/chromedriver.exe");

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
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.bluestone.com/");

WebElement pop = driver.findElement(By.xpath("//div[@class='popup-content']//span[contains(.,'Not now')]"));
		
		
      WebDriverWait ww = new WebDriverWait(driver, 10);
		
		ww.until(ExpectedConditions.visibilityOf(pop));
		pop.click();

		
		
		WebElement offer = driver.findElement(By.xpath("(//ul[@class='wh-main-menu']/li)[10]"));
		
		
		Actions a = new  Actions(driver);
		
		a.moveToElement(offer).build().perform();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[contains(.,'Up to 50% Off Making Charges')]")).click();
		
		Thread.sleep(2000);
		
		String url = driver.getCurrentUrl();
		
		
		System.out.println(url);
		
		// https://www.bluestone.com/jewellery/filter/upto+50+percent+off+on+making+charges.html


		String expurl = "https://www.bluestone.com/jewellery/filter/upto+50+percent+off+on+making+charges.html";
		
		Assert.assertEquals(url, expurl);
		
		driver.close();
	}
	
}
