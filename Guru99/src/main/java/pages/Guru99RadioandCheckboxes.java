package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99RadioandCheckboxes extends BasePage {
	@FindBy(id = "vfb-7-2")
	private WebElement secondOption;
	@FindBy(id = "vfb-6-0")
	private WebElement CheckBox1;
	@FindBy(id = "vfb-6-1")
	private WebElement CheckBox2;
	@FindBy(id = "vfb-6-2")
	private WebElement CheckBox3;

	public Guru99RadioandCheckboxes(WebDriver driver) {
		super(driver);
	}

	public Guru99RadioandCheckboxes selectSecondOption() {
		secondOption.click();
		return this;
	}

	public Guru99RadioandCheckboxes selectAllCheckBoxes() {
		if ((!CheckBox1.isSelected()) || (!CheckBox2.isSelected()) || (!CheckBox3.isSelected())) {
			CheckBox1.click();
			driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
			CheckBox2.click();
			CheckBox3.click();
		}
		return this;
	}

	public String getTitle() {
		return this.driver.getTitle();
	}

}
