package SecondWebsite.second;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImageTest {
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
	public void checkBrokenImages() {
		driver.findElement(By.cssSelector("#content > ul > li:nth-child(4) > a")).click();
		List<WebElement> listofimg = driver.findElements(By.tagName("img"));
		for (WebElement image : listofimg) {
			if (image.getAttribute("naturalWidth").equals("0")) {
				System.out.println(image.getAttribute("outerHTML"));
				assertEquals("No broken pictures", true, image.getAttribute("naturalWidth").equals("0"));
				assertEquals("Not enough items", listofimg.size(), 4);
			}
		}
	}

	@AfterClass
	public static void closeBrowser() {
		driver.quit();
	}
}
