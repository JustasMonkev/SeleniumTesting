package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class GuruFileUpload extends BasePage {
    @FindBy(id = "uploadfile_0")
    private WebElement uploadButton;
    @FindBy(id = "terms")
    private WebElement checkbox;
    @FindBy(id = "submitbutton")
    private WebElement sumbitButton;
    @FindBy(xpath = "//*[@id=\"res\"]/center")
    private List<WebElement> getText;

    public GuruFileUpload(WebDriver driver) {
        super(driver);
    }

    public GuruFileUpload uploadFile() {
        uploadButton.sendKeys("D://games/License.txt");
        return this;
    }

    public GuruFileUpload selectCheckbox() {
        if (!checkbox.isSelected()) {
            checkbox.click();
        }
        return this;
    }

    public GuruFileUpload clickSumbitButton() {
        sumbitButton.click();
        return this;
    }

    public List<String> getMessage() {
        List<String> textList = new ArrayList<>();
        for (WebElement webElement : getText) {
            textList.add(webElement.getText());
        }
        return textList;
    }
}

