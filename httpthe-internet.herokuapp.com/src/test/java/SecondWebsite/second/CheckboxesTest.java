package SecondWebsite.second;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxesTest {
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
	public void ifCheckBoxesareSelected() {
		driver.findElement(By.cssSelector("#content > ul > li:nth-child(6) > a")).click();
		driver.get("http://the-internet.herokuapp.com/checkboxes");
		driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).click();
		assertEquals(true, driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).isSelected());
		assertEquals(true, driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]")).isSelected());
	}

	@AfterClass
	public static void closeChrome() {
		driver.quit();
	}
}
