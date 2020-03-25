package test;


import org.junit.Test;
import org.junit.jupiter.api.*;
import pages.GuruHomePage99;
import pages.GuruYahoo;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuruYahoo99Test extends BaseTest {
    GuruYahoo objGuruYahoo = new GuruYahoo(driver);
    GuruHomePage99 objGuruHomePage99 = new GuruHomePage99(driver);

    @Test
    @Order(1)
    public void testPathToYahoo() {
        objGuruHomePage99.openDropMenu().clickYahoo();
        assertEquals("Selenium WebDriver Test", objGuruYahoo.getTitle());
    }

    @Test
    @Order(2)
    public void testFirstSlide() throws InterruptedException {
        objGuruYahoo.clickFirstSlide();
        Thread.sleep(2000);
        assertEquals("See What's Inside The New Yahoo! Messenger", objGuruYahoo.getH3Text().get(0));
        Thread.sleep(2000);
    }

    @Test
    @Order(3)
    public void testSecondSlide() throws InterruptedException {
        objGuruYahoo.clickSecondSlide();
        Thread.sleep(2000);
        assertEquals("Buddy vs. Buddy", objGuruYahoo.getH3Text().get(1));
    }

    @Test
    @Order(3)
    public void testThirdSlide() throws InterruptedException {
        objGuruYahoo.clickThirdSlide();
        Thread.sleep(2000);
        assertEquals("Facebook\n" +
                "™\n" +
                "\n" +
                "Friendly", objGuruYahoo.getH3Text().get(2));
    }

    @Test
    public void testFourthSlide() throws InterruptedException {
        objGuruYahoo.clickFourthSlide();
        Thread.sleep(2000);
        assertEquals("Share Away,\n" +
                "All From Here", objGuruYahoo.getH3Text().get(3));
    }

    @Test
    public void testFifthSlide() throws InterruptedException {
        objGuruYahoo.clickFifthSlide();
        Thread.sleep(2000);
        assertEquals("IM On Mobile", objGuruYahoo.getH3Text().get(4));
    }

    @Test
    public void testSixthSlide() throws InterruptedException {
        objGuruYahoo.clickSixthSlide();
        Thread.sleep(2000);
        assertEquals("Always On Chats", objGuruYahoo.getH3Text().get(5));
    }

    @Test
    public void testSeventhSlide() throws InterruptedException {
        objGuruYahoo.clickSeventhSlide();
        Thread.sleep(2000);
        assertEquals("Tabbed IMs", objGuruYahoo.getH3Text().get(6));
    }
}

