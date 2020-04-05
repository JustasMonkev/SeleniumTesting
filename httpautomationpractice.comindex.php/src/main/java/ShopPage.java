import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ShopPage extends BasePage {
    @FindBy(xpath = "//input[@id = \"search_query_top\"]")
    private WebElement input;
    @FindBy(xpath = "//button[@name = \"submit_search\"]")
    private WebElement submitsearchButton;
    @FindBy(xpath = "//ul[@class = \"product_list grid row\"]//a[@class=\"product-name\"]")
    private List<WebElement> getAllItemsList;
    @FindBy(xpath = "//li[1]//span[contains(text(),'Add to cart')]")
    private WebElement addItem;
    @FindBy(xpath = "//ul//li[1]//div[@class = \"product-container\"]")
    private WebElement firstProduct;

    public ShopPage(WebDriver driver) {
        super(driver);
    }

    public ShopPage sendTextToInput(String product) {
        input.sendKeys(product);
        return this;
    }

    public ShopPage clickSumbitSearchButton() {
        submitsearchButton.click();
        return this;
    }

    public List<String> getAllItems() {
        List<String> list = new ArrayList<>();
        for (WebElement webElement : getAllItemsList) {
            list.add(webElement.getText());
        }
        return list;
    }

    public ShopPage addItemToCart() {
        Actions builder = new Actions(driver);
        builder.moveToElement(firstProduct).perform();
        addItem.click();
        return this;
    }
}
