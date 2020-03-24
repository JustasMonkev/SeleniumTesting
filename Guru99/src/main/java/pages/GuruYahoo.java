package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class GuruYahoo extends BasePage {
    @FindBy(xpath = "//div[@class = \"car_paging\"]//a[1]")
    private WebElement firstSlide;
    @FindBy(xpath = "//div[@class = \"car_paging\"]//a[2]")
    private WebElement secondSlide;
    @FindBy(xpath = "//a[@id = \"pager3\"]")
    private WebElement thirdSlide;
    @FindBy(xpath = "//a[@id = \"pager4\"]")
    private WebElement fourthSlide;
    @FindBy(xpath = "//a[@id = \"pager5\"]")
    private WebElement fifthSlide;
    @FindBy(xpath = "//a[@id = \"pager6\"]")
    private WebElement sixthSlide;
    @FindBy(xpath = "//a[@id = \"pager7\"]")
    private WebElement seventhSlide;
    @FindBy(xpath = "//ol/li/h3")
    private List<WebElement> webElementList;

    public GuruYahoo(WebDriver driver) {
        super(driver);
    }

    public GuruYahoo clickFirstSlide() {
        firstSlide.click();
        return this;
    }

    public GuruYahoo clickSecondSlide() {
        secondSlide.click();
        return this;
    }

    public GuruYahoo clickThirdSlide() {
        thirdSlide.click();
        return this;
    }

    public GuruYahoo clickFourthSlide() {
        fourthSlide.click();
        return this;
    }

    public GuruYahoo clickFifthSlide() {
        fifthSlide.click();
        return this;
    }

    public GuruYahoo clickSixthSlide() {
        sixthSlide.click();
        return this;
    }

    public GuruYahoo clickSeventhSlide() {
        seventhSlide.click();
        return this;
    }
    public List<String> getH3Text() {
        List<String> labelsList = new ArrayList<>();
        for (WebElement webElement : webElementList) {
            labelsList.add(webElement.getText());
        }
        return labelsList;
    }
    public String getTitle() {
        return driver.getTitle();
    }
}
