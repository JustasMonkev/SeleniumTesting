package First.main;

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
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstTest {
	static WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	public static final String name = "Jonas";
	public static final String last = "Jonaitis";
	public static final String email = "Jonatiogptkks@gmail.com";

	@BeforeClass
	public static void startWebsite() {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
	
	}

	@Test
	public void verifyTitleAndCheckMenu() {
		String title = driver.getTitle();
		List<WebElement> listOfMenu = (ArrayList<WebElement>) driver
				.findElements(By.cssSelector("#header > div.nav > div > div"));
		assertTrue(title.contains("My Store"));
		assertEquals(1, listOfMenu.size());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.print(listOfMenu.get(0).getText()); 
		assertEquals("Wrong items","\r\n" + 
				"			Sign in\r\n" + 
				"		\r\n" + 
				"			Sign in\r\n" + 
				"		Contact us\r\nCall us now: 0123-456-789", listOfMenu.get(0).getText());
	}

	@Test
	public void goToRegisterForm() {
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.findElement(By.xpath("//*[@id=\"email_create\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys(email);
		driver.findElement(By.cssSelector("#SubmitCreate > span")).click();
		String title = driver.getTitle();
		js.executeScript("window.scrollBy(0,10)");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement checkbox = driver.findElement(By.id("id_gender1"));
		checkbox.click();
		driver.findElement(By.id("customer_firstname")).sendKeys(name);
		driver.findElement(By.id("customer_lastname")).sendKeys(last);
		driver.findElement(By.cssSelector("#passwd")).sendKeys("!@$#G85");
		js.executeScript("window.scrollBy(0,25)");
		Select years = new Select(driver.findElement(By.id("years")));
		years.selectByVisibleText("-");
		years.selectByIndex(40);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Select months = new Select(driver.findElement(By.id("months")));
		months.selectByVisibleText("-");
		months.selectByIndex(7);
		Select days = new Select(driver.findElement(By.id("days")));
		days.selectByVisibleText("-");
		days.selectByValue("20");
		WebElement checkBoxForNewsLetter = driver.findElement(By.id("uniform-newsletter"));
		checkBoxForNewsLetter.click();
		WebElement checkBoxForUniform = driver.findElement(By.id("uniform-optin"));
		checkBoxForUniform.click();
		js.executeScript("window.scrollBy(0,50)");
		driver.findElement(By.id("company")).click();
		driver.findElement(By.id("company")).sendKeys("JavaPanda");
		driver.findElement(By.id("address1")).click();
		driver.findElement(By.id("address1")).sendKeys("732  Edsel Road");
		driver.findElement(By.id("address2")).click();
		driver.findElement(By.id("address2")).sendKeys("Edsel Road Flat 5");
		driver.findElement(By.id("city")).click();
		driver.findElement(By.id("city")).sendKeys("North Hollywood");
		Select state = new Select(driver.findElement(By.id("id_state")));
		state.selectByVisibleText("California");
		driver.findElement(By.id("postcode")).click();
		driver.findElement(By.id("postcode")).sendKeys("91605");
		driver.findElement(By.id("phone")).click();
		driver.findElement(By.id("other")).click();
		driver.findElement(By.id("other")).sendKeys("words");
		driver.findElement(By.id("phone")).sendKeys("8698554822");
		driver.findElement(By.id("phone_mobile")).click();
		driver.findElement(By.id("phone_mobile")).sendKeys("88463846846");
		driver.findElement(By.id("alias")).click();
		driver.findElement(By.id("alias")).clear();
		driver.findElement(By.id("alias")).sendKeys("Road Flat 5");
		driver.findElement(By.id("submitAccount")).click();

		assertEquals("Wrong page", title, "Login - My Store");
	}

	@Test
	public void checkMyaccountTitle() {
		driver.get("http://automationpractice.com/index.php?controller=my-account");
		String title = driver.getTitle();
		assertEquals("My account - My Store", title);
	}

	@Test
	public void checkIdentityTitle() {
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[4]/a")).click();
		driver.get("http://automationpractice.com/index.php?controller=identity");
		js.executeScript("window.scrollBy(0,250)");
		String title = driver.getTitle();
		assertEquals("Identity - My Store", title);

	}

	@Test
	public void checkLastNameAndEmail() {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		String lastname = driver.findElement(By.id("lastname")).getAttribute("value");
		String myEmail = driver.findElement(By.id("email")).getAttribute("value");
		String firstname = driver.findElement(By.id("firstname")).getAttribute("value");
		System.out.println(firstname + " " + lastname + " " + myEmail);
		assertEquals(name, firstname);
		assertEquals(last, lastname);
		assertEquals(email, myEmail);
	}

	@AfterClass
	public static void closeChrome() {
		driver.quit();
	}
}
