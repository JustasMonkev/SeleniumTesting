package SecondWebsite.second;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Herokuapp {
	public Herokuapp() {
		WebDriver driver = new ChromeDriver();
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "\\Driver\\chromedriver.exe");
		driver.manage().window().maximize();
		
	}


	public  void secondexer(WebDriver driver) throws InterruptedException {
		driver.get("http://the-internet.herokuapp.com");
		driver.findElement(By.cssSelector("#content > ul > li:nth-child(2) > a")).click();
		driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#content > div > button")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#elements > button")).click();
		driver.manage();
	}


}
