package SecondWebsite.second;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChallengingDOM {
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
	public void isBlueButtonDisplayed() throws InterruptedException {
		driver.findElement(By.cssSelector("#content > ul > li:nth-child(5) > a")).click();
		driver.get("http://the-internet.herokuapp.com/challenging_dom");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/a[1]")).click();
		String blueButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/a[1]")).getText();
		System.out.println(blueButton);
		js.executeScript("window.scrollBy(0,150)");
		assertEquals(true, driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/a[1]")).isDisplayed());
		assertFalse(blueButton.isEmpty());
	}

	@Test
	public void isRedButtonDisplayed() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/a[2]")).click();
		String redButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/a[2]")).getText();
		System.out.println(redButton);
		assertEquals(true, driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/a[2]")).isDisplayed());
		assertFalse(redButton.isEmpty());
	}

	@Test
	public void voidisGreenButtonDisplayed() {
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/a[3]")).click();
		String greenButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/a[3]")).getText();
		System.out.println(greenButton);
		assertEquals(true, driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/a[3]")).isDisplayed());
		assertFalse(greenButton.isEmpty());
	}

	@AfterClass
	public static void closeBrowser() {
		driver.quit();
	}

}
