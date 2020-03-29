package test;

import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import pages.GuruFileUpload;
import pages.GuruHomePage99;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class GuruFileUploadTest extends BaseTest {
    GuruHomePage99 objGuruHomePage99 = new GuruHomePage99(driver);
    GuruFileUpload objGuruFileUpload = new GuruFileUpload(driver);

    @Test
    @Order(1)
    public void testPathTouFileUpload() {
        objGuruHomePage99.openDropMenu().clickFileUpload();
        assertEquals("File Upload Demo", objGuruHomePage99.getTitle());
    }

    @Test
    public void testIfUploadWorks() throws InterruptedException {
        objGuruFileUpload.uploadFile().selectCheckbox().clickSumbitButton();
        Thread.sleep(2000);
        assertEquals("1 file\n" +
                "has been successfully uploaded.", objGuruFileUpload.getMessage().get(0));
    }
}
