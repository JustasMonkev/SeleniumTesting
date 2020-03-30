import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(xpath = "//div[@id = \"contact-link\"]//a")
    private WebElement clickContactUs;
    @FindBy(xpath = "//div[@class = \"header_user_info\"]//a")
    private WebElement clickSignIn;
    @FindBy(xpath = "//div[@id = \"header_logo\"]//img")
    private WebElement clickLogo;
    @FindBy(id = "search_query_top")
    private WebElement searchBox;
    @FindBy(xpath = "//button[@name = \"submit_search\"]")
    private WebElement sumbitSearchButton;
    @FindBy(xpath = "//div[@class = \"shopping_cart\"]/a")
    private WebElement shopCart;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage clickOnContactUs() {
        clickContactUs.click();
        return this;
    }
    public HomePage clickOnSignIn() {
        clickSignIn.click();
        return this;
    }
    public HomePage clickOnLogo() {
        clickLogo.click();
        return this;
    }
    public HomePage clickOnSearchBox(String words) {
        searchBox.sendKeys(words);
        return this;
    }
    public HomePage clickonSumbitButton() {
        sumbitSearchButton.click();
        return this;
    }
    public HomePage clickonShopCart() {
        shopCart.click();
        return this;
    }
}
