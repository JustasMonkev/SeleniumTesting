package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class GuruTooltip extends BasePage {
    @FindBy(xpath = "//a[@id=\"download_now\"]")
    private WebElement downloadNowButton;
    @FindBy(xpath = "//tbody//tr//td[2]")
    private List<WebElement> getInfo;

    public GuruTooltip(WebDriver driver) {
        super(driver);
    }

    public GuruTooltip hoverDownloadNowButton() {
        Actions builder = new Actions(driver);
        builder.moveToElement(downloadNowButton).perform();
        return this;
    }

    public List<String>  getAllInfo() {
        List<String> list = new ArrayList<>();
        for (WebElement webElement : getInfo) {
            list.add(webElement.getText());
        }
        return list;
    }
}
