package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class GuruTooltip extends BasePage {
    @FindBy(xpath = "//a[@id=\"download_now\"]")
    private WebElement downloadNowButton;
    @FindBy(xpath = "//tbody//td[2]")
    private WebElement getFileName;

    public GuruTooltip(WebDriver driver) {
        super(driver);
    }

    public GuruTooltip hoverDownloadNowButton() {
        Actions builder = new Actions(driver);
        builder.moveToElement(downloadNowButton).perform();
        return this;
    }

    public String getAllInfo() {
        return this.getFileName.getText();
    }
}
