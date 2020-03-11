package SecondWebsite.second;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.awt.Desktop;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AddandRemoveItem {
	static WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;

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
	public void addItem() throws InterruptedException {
		driver.get("http://the-internet.herokuapp.com");
		driver.findElement(By.cssSelector("#content > ul > li:nth-child(2) > a")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#content > div > button")).click();
		String button = driver.findElement(By.xpath("//*[@id=\"elements\"]/button")).getText();
		assertEquals("Didn't add button Delete", button, "Delete");
	}
	
	@Test 
	public void deleteItem() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#elements > button")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String button = driver.findElement(By.id("elements")).getText();
		assertEquals("Item wasn't deleted","", button);
	}
	
	@AfterClass
	public static void closeChrome() {
		driver.quit();
	}
}
