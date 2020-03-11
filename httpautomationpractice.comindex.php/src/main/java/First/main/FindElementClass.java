package First.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementClass {
	public static final String email = "fsahds@gmail.com";
	static WebDriver driver = new ChromeDriver();

	public static WebElement findElement(By locator) {

		WebElement element = driver.findElement(locator);

		return element;
	}

	public static void main(String[] args) 
	}
}
