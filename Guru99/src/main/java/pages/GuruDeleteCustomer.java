package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GuruDeleteCustomer extends BasePage {
    @FindBy(xpath = "//input[@name = \"cusid\"]")
    private WebElement textBox;
    @FindBy(xpath = "//input[@name = \"submit\"]")
    private WebElement sumbitButton;
    @FindBy(xpath = "//input[@name='res']")
    private WebElement resetButton;
    public GuruDeleteCustomer(WebDriver driver) {
        super(driver);
    }
    public GuruDeleteCustomer fillingTextBox(String words) {
        this.textBox.sendKeys(words);
        return this;
    }
    public GuruDeleteCustomer clickSumbitButton() {
        sumbitButton.click();
        return this;
    }
    public GuruDeleteCustomer clickResetButton() {
        resetButton.click();
        return this;
    }
    public String getTitle() {
        return this.driver.getTitle();
    }
}
