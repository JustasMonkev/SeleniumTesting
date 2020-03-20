package test;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruDeleteCustomer;
import pages.GuruHomePage99;

import static org.junit.jupiter.api.Assertions.*;

public class GuruDeleteCustomerTest extends BaseTest {
    GuruHomePage99 objGuruHomePage99 = new GuruHomePage99(driver);
    GuruDeleteCustomer objGuruDeleteCustomerTest = new GuruDeleteCustomer(driver);

    @Test
    public void goToDeleteCustomer() {
        objGuruHomePage99.
                openDropMenu().
                clickDeleteCustomerForm();
        assertEquals("Delete Customer", objGuruDeleteCustomerTest.getTitle());
    }

    @Test
    public void testIfsumbitButtonWorks() throws InterruptedException {
        objGuruDeleteCustomerTest.fillingTextBox("16416")
                .clickSumbitButton();
        Alert box = driver.switchTo().alert();
        box.accept();
        assertFalse(box.equals(null));
    }
    @Test
    public void testIfResetButtonWorks() {
        objGuruDeleteCustomerTest.fillingTextBox("16417").clickResetButton();
        WebElement resetBox = driver.findElement(By.xpath("//input[@name = \"cusid\"]"));
        resetBox.clear();
        assertFalse(resetBox.equals(""));
    }
}
