package test;

import org.junit.Test;
import org.junit.jupiter.api.Order;
import pages.GuruHomePage99;
import pages.GuruInsideOutsideBlockLevelTag;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuruInsideOutsideBlockLevelTagTest extends BaseTest {
    GuruInsideOutsideBlockLevelTag objGuruInsideOutsideBlockLevelTag = new GuruInsideOutsideBlockLevelTag(driver);
    GuruHomePage99 objGuruHomePage99 = new GuruHomePage99(driver);

    @Test
    public void gotoInsideOutsideBlockLevelTag() {
        objGuruHomePage99.openDropMenu().clickblockLevelTag();
        assertEquals("Inside & Outside Block Level Tag", objGuruInsideOutsideBlockLevelTag.getTitle());
    }

    @Test
    public void testPathToGoogle() {
        objGuruInsideOutsideBlockLevelTag.goToGoogle();
        assertEquals("Google", objGuruInsideOutsideBlockLevelTag.getTitle());
        driver.navigate().back();
    }

    @Test
    public void testPathToFacebook() {
        objGuruInsideOutsideBlockLevelTag.goToFacebook();
        assertEquals("Facebook - Log In or Sign Up", objGuruInsideOutsideBlockLevelTag.getTitle());
        driver.navigate().back();
    }
}
