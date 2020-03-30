import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CreateAccountTest extends BaseTest {
    HomePage objHomePage = new HomePage(driver);
    RegisterFormPage objRegisterFormPage = new RegisterFormPage(driver);
    @Test
    public void createAccount() {
        objHomePage.clickOnSignIn();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        objRegisterFormPage.enterArandomEmail().ClickContinue().fillForm();
        assertTrue(driver.getTitle().contains("My account - My Store"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        objRegisterFormPage.clickOnAccountInfo();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String lastname = driver.findElement(By.id("lastname")).getAttribute("value");
        String firstname = driver.findElement(By.id("firstname")).getAttribute("value");
        assertEquals("Axel", firstname);
        assertEquals("Foley", lastname);

    }

}
