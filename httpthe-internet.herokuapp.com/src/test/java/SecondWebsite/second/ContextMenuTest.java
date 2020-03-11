package SecondWebsite.second;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuTest {
	static WebDriver driver;

	@BeforeClass
	public static void startBrowser() {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/");
	}

	@Test
	public void testRightClick() throws InterruptedException {
		driver.findElement(By.cssSelector("#content > ul > li:nth-child(7) > a")).click();
		driver.get("http://the-internet.herokuapp.com/context_menu");
		Actions action = new Actions(driver);
		WebElement right = driver.findElement(By.id("hot-spot"));
		action.contextClick(right).perform();
		Alert alertbox = driver.switchTo().alert();
		assertTrue(alertbox != null);
		alertbox.accept();
	}

	@AfterClass
	public static void closeBrowser() {
		driver.quit();
	}
}
