import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class ShopPageTest extends BaseTest {
    ShopPage objShopPage = new ShopPage(driver);
    @Test
    public void CheckHowManyProductsExist() {
        objShopPage.sendTextToInput("dress").clickSumbitSearchButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        assertEquals(7,objShopPage.getAllItems().size());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        objShopPage.addItemToCart();
    }
}
