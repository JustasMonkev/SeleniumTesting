package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GuruAccessingLink extends BasePage {
	@FindBy(xpath = "//body/a[1]")
	private WebElement firstButton;
	@FindBy(xpath = "//body//a[2]")
	private WebElement secondButton;

	public GuruAccessingLink(WebDriver driver) {
		super(driver);
	}

	public String getTitle() {
		return this.driver.getTitle();
	}


	public GuruAccessingLink gotoGoogle() {
		firstButton.click();
		return this;
	}

	public GuruAccessingLink gotoFB() {
		secondButton.click();
		return this;
	}

}
