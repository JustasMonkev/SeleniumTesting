package test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public abstract class BaseTest {
	protected static WebDriver driver;

	@BeforeClass
	public static void setup() {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
		driver.manage().window().maximize();
	}

	@AfterClass
	public static void tearDown() {
		driver.quit();
	}
}
