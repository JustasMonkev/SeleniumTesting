import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class RegisterFormPage extends BasePage {
    @FindBy(id = "email_create")
    private WebElement enterEmail;
    @FindBy(id = "SubmitCreate")
    private WebElement clickSumbitButton;
    @FindBy(xpath = "//ul[@class = \"myaccount-link-list\"]//li[4]")
    private WebElement clickAccountInfo;

    public RegisterFormPage(WebDriver driver) {
        super(driver);
    }

    public RegisterFormPage enterArandomEmail() {
        Random r = new Random();
        String str = "";
        for (int i = 0; i < 6; i++) {
            str += (char) (r.nextInt(25) + 97);
        }
        enterEmail.sendKeys(str + "@gmail.com");
        return this;
    }

    public RegisterFormPage ClickContinue() {
        clickSumbitButton.click();
        return this;
    }

    public void fillForm() {
        WebElement checkbox = driver.findElement(By.id("id_gender1"));
        checkbox.click();
        driver.findElement(By.id("customer_firstname")).sendKeys("Axel");
        driver.findElement(By.id("customer_lastname")).sendKeys("Foley");
        driver.findElement(By.cssSelector("#passwd")).sendKeys("!@$#G85");
        Select years = new Select(driver.findElement(By.id("years")));
        years.selectByVisibleText("-");
        years.selectByIndex(40);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Select months = new Select(driver.findElement(By.id("months")));
        months.selectByVisibleText("-");
        months.selectByIndex(7);
        Select days = new Select(driver.findElement(By.id("days")));
        days.selectByVisibleText("-");
        days.selectByValue("20");
        WebElement checkBoxForNewsLetter = driver.findElement(By.id("uniform-newsletter"));
        checkBoxForNewsLetter.click();
        WebElement checkBoxForUniform = driver.findElement(By.id("uniform-optin"));
        checkBoxForUniform.click();
        driver.findElement(By.id("company")).click();
        driver.findElement(By.id("company")).sendKeys("JavaPanda");
        driver.findElement(By.id("address1")).click();
        driver.findElement(By.id("address1")).sendKeys("732  Edsel Road");
        driver.findElement(By.id("address2")).click();
        driver.findElement(By.id("address2")).sendKeys("Edsel Road Flat 5");
        driver.findElement(By.id("city")).click();
        driver.findElement(By.id("city")).sendKeys("North Hollywood");
        Select state = new Select(driver.findElement(By.id("id_state")));
        state.selectByVisibleText("California");
        driver.findElement(By.id("postcode")).click();
        driver.findElement(By.id("postcode")).sendKeys("91605");
        driver.findElement(By.id("phone")).click();
        driver.findElement(By.id("other")).click();
        driver.findElement(By.id("other")).sendKeys("words");
        driver.findElement(By.id("phone")).sendKeys("8698554822");
        driver.findElement(By.id("phone_mobile")).click();
        driver.findElement(By.id("phone_mobile")).sendKeys("88463846846");
        driver.findElement(By.id("alias")).click();
        driver.findElement(By.id("alias")).clear();
        driver.findElement(By.id("alias")).sendKeys("Road Flat 5");
        driver.findElement(By.id("submitAccount")).click();
    }
    public RegisterFormPage clickOnAccountInfo() {
        clickAccountInfo.click();
        return this;
    }
}
