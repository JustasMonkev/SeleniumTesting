package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GuruInsideOutsideBlockLevelTag extends BasePage {
    @FindBy(xpath = "//body//p/a")
    private WebElement firstButton;
    @FindBy(xpath = "//body//a//div//span")
    private WebElement secondButton;
    public GuruInsideOutsideBlockLevelTag(WebDriver driver) {
        super(driver);
    }
    public GuruInsideOutsideBlockLevelTag goToGoogle() {
        firstButton.click();
        return this;
    }
    public GuruInsideOutsideBlockLevelTag goToFacebook() {
        secondButton.click();
        return this;
    }
    public String getTitle() {
        return this.driver.getTitle();
    }
}
