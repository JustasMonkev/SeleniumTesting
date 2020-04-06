import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ShopPageTest extends BaseTest {
    ShopPage objShopPage = new ShopPage(driver);

    @Test
    public void checkHowManyProductsExist() {
        objShopPage.sendTextToInput("dress").clickSumbitSearchButton();
        assertEquals(7, objShopPage.getAllItems().size());
    }

    @Test
    public void checkifItemsCanBeAddedToCart() throws InterruptedException {
        objShopPage.hoverShopItem();
        objShopPage.addItemToCart();
        Thread.sleep(3000);
        objShopPage.clickcontinueButton();
        objShopPage.hoverOnCart();
        Thread.sleep(3000);
        assertTrue(objShopPage.getTotalPrice().equalsIgnoreCase("$30.98"));
    }
}
