package SecondWebsite.second;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.awt.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisappearingElementsTest {
	static WebDriver driver;

	@BeforeClass
	public static void openChrome() {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Disappearing Elements")).click();
	}

	@Test
	public void doesHomeButtonWorks() throws InterruptedException {
		driver.get("http://the-internet.herokuapp.com/disappearing_elements");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/a")).click();
		String header = driver.findElement(By.cssSelector("#content > h2")).getText();
		assertTrue(header.contains("Available Examples"));
		driver.navigate().back();
	}

	@Test
	public void doesAboutButtonWorks() throws InterruptedException {
		driver.get("http://the-internet.herokuapp.com/disappearing_elements");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/a")).click();
		String header = driver.findElement(By.xpath("/html/body/h1")).getText();
		assertTrue(header.contains("Not Found"));
		driver.navigate().back();
	}

	@Test
	public void doesContactUsButtonWorks() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/a")).click();
		String header = driver.findElement(By.xpath("/html/body/h1")).getText();
		assertTrue(header.contains("Not Found"));
		driver.navigate().back();
	}

	@Test
	public void doesPortfolioButtonWorks() throws InterruptedException {
		driver.get("http://the-internet.herokuapp.com/disappearing_elements");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[4]/a")).click();
		String header = driver.findElement(By.xpath("/html/body/h1")).getText();
		assertTrue(header.contains("Not Found"));
		driver.navigate().back();
	}

	@Test
	public void doesGalleryButtonWorks() {
		while (true) {
			driver.navigate().refresh();
			if (driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[5]/a")) != null) {
				driver.findElement(By.linkText("Gallery")).click();
				String header = driver.findElement(By.xpath("/html/body/h1")).getText();
				assertTrue(header.contains("Not Found"));
				break;
			}
		}
	}

	@AfterClass
	public static void closeChrome() {
		driver.quit();
	}

}
