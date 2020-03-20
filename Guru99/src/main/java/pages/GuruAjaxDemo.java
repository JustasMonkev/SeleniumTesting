package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GuruAjaxDemo extends BasePage {
    @FindBy(id = "yes")
    private WebElement yesOption;
    @FindBy(id = "no")
    private WebElement noOption;
    @FindBy(id = "buttoncheck")
    private WebElement checkButton;
    @FindBy(xpath = "//form/p/input[1]")
    private WebElement resetButton;
    @FindBy(xpath = "//p[@class='radiobutton']")
    private WebElement yesValue;

    public GuruAjaxDemo(WebDriver driver) {
        super(driver);
    }

    public GuruAjaxDemo clickYesOption() {
        yesOption.click();
        return this;
    }

    public GuruAjaxDemo clickNoOption() {
        noOption.click();
        return this;
    }

    public GuruAjaxDemo clickCheckButton() {
        checkButton.click();
        return this;
    }

    public GuruAjaxDemo clickresetButton() {
        resetButton.click();
        return this;
    }


    public String getValue() {
        return yesValue.getText();
    }

    public String getTitle() {
        return this.driver.getTitle();
    }
}
