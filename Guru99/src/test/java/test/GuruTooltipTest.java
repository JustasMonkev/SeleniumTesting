package test;

import org.junit.Test;
import pages.GuruHomePage99;
import pages.GuruTooltip;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class GuruTooltipTest extends BaseTest {
    GuruTooltip objGuruToolTip = new GuruTooltip(driver);
    GuruHomePage99 objGuruHomePage99 = new GuruHomePage99(driver);
    @Test
    public void PathToToolTip() {
        objGuruHomePage99.openDropMenu().clickToolTip();
        assertEquals("Tooltip Demo",objGuruHomePage99.getTitle());
    }
    @Test
    public void testIfHoverWorksAndCheckText() {
        objGuruToolTip.hoverDownloadNowButton();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        assertEquals("flowplayer-3.2.7.zip",objGuruToolTip.getAllInfo());
    }
}
