package SecondWebsite.second;

import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthTest {
	static WebDriver driver;

	@BeforeClass
	public static void startWebsite() {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/");

	}

	@Test
	public void verifyTitle() {
		String title = driver.getTitle();
		assertTrue(title.contains("The Internet"));
	}

	@Test
	public void fillsupAlertBoxAndChecksIfAuthWasSuccessful() throws InterruptedException {
		Thread.sleep(2000);
		driver.get("http://the-internet.herokuapp.com");
		driver.findElement(By.cssSelector("#content > ul > li:nth-child(3) > a")).click();
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		String header = driver.findElement(By.cssSelector("#content > div > h3")).getText();
		Thread.sleep(2000);
		assertTrue(header.contains("Basic Auth"));
	}

	@AfterClass
	public static void closeChrome() {
		driver.quit();
	}
}
