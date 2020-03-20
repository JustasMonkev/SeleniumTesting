package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruAjaxDemo;
import pages.GuruHomePage99;

import static org.junit.jupiter.api.Assertions.*;

public class GuruAjaxDemoTest extends BaseTest {
    GuruAjaxDemo objGuruAjaxDemo = new GuruAjaxDemo(driver);
    GuruHomePage99 objGuruHomePage99 = new GuruHomePage99(driver);

    @Test
    public void testPathToAjaxDemo() {
        objGuruHomePage99.openDropMenu().clickAjaxDemo();
        assertEquals("Ajax Test", objGuruAjaxDemo.getTitle());
    }

    @Test
    public void checksumbitYesOption() {
        objGuruAjaxDemo.
                clickYesOption().
                clickCheckButton();
        assertEquals("Radio button is checked and it's value is Yes", objGuruAjaxDemo.getValue());
        objGuruAjaxDemo.clickresetButton();
        WebElement yesButton = driver.findElement(By.xpath("//p[@class='radiobutton']"));
        assertFalse(yesButton.isSelected());
    }

    @Test
    public void checksumbitNoOption() {
        objGuruAjaxDemo.clickNoOption().clickCheckButton();
        assertEquals("Radio button is checked and it's value is No", objGuruAjaxDemo.getValue());
        objGuruAjaxDemo.clickresetButton();
        WebElement noButton = driver.findElement(By.id("no"));
        assertFalse(noButton.isSelected());
    }

}