package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import pages.GuruAccessingLink;
import pages.GuruHomePage99;

public class GuruAccessingLinkTest extends BaseTest {
	GuruAccessingLink objGuruAccessingLink = new GuruAccessingLink(driver);
	GuruHomePage99 objGuruHomePage99 = new GuruHomePage99(driver);

	@Test
	public void gotoSeleniumWebAndSelectAccessingLinkTest() {
		objGuruHomePage99.openDropMenu().clickAccessingLink();
		String getTitle = objGuruAccessingLink.getTitle();
		assertEquals("Sample Link Page Demo", getTitle);
	}

	@Test
	public void testPathToGoogle() {
		objGuruAccessingLink.gotoGoogle();
		String getGoogleTitle = objGuruAccessingLink.getTitle();
		driver.navigate().back();
		assertEquals("Google", getGoogleTitle);
	}

	@Test
	public void testPathToFacebook() {
		objGuruAccessingLink.gotoFB();
		String getFacebookTitle = objGuruAccessingLink.getTitle();
		driver.navigate().back();
		assertEquals("Facebook - Log In or Sign Up", getFacebookTitle);
	}

}
