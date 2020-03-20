package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.BasePage;
import pages.Guru99RadioandCheckboxes;
import pages.GuruHomePage99;

public class Guru99RadioandCheckboxesTest extends BaseTest {
	Guru99RadioandCheckboxes objRadioAndCheckboxes;
	GuruHomePage99 objGuruHomePage99;

	@Test
	public void gotoSeleniumWeb() {
		objRadioAndCheckboxes = new Guru99RadioandCheckboxes(driver);
		objGuruHomePage99 = new GuruHomePage99(driver);
		objGuruHomePage99.openDropMenu()
		.clickCheckBoxesAndRadios();
		String seleniumPage = objRadioAndCheckboxes.getTitle();
		assertEquals("Radio Button & Check Box Demo", seleniumPage);
	}

	@Test
	public void checkifAllCheckboxsareSelected() {
		objRadioAndCheckboxes = new Guru99RadioandCheckboxes(driver);
		objRadioAndCheckboxes.selectAllCheckBoxes().selectSecondOption();
		WebElement CheckBox1 = driver.findElement(By.id("vfb-6-0"));
		WebElement CheckBox2 = driver.findElement(By.id("vfb-6-1"));
		WebElement CheckBox3 = driver.findElement(By.id("vfb-6-2"));
		assertTrue(CheckBox1.isSelected());
		assertTrue(CheckBox2.isSelected());
		assertTrue(CheckBox3.isSelected());
	}

	@Test
	public void checkifSecondRadionisSelected() {
		WebElement secondRadio = driver.findElement(By.id("vfb-7-2"));
		assertTrue(secondRadio.isSelected());
	}
}
