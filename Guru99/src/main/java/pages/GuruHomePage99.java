package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GuruHomePage99 extends BasePage {
    @FindBy(xpath = "//li[@class=\"dropdown\"][1]")
    private WebElement selenium;
    @FindBy(xpath = "//li[@class='dropdown open']//ul[@class='dropdown-menu']//li[1]")
    private WebElement flashMovieDemo;
    @FindBy(xpath = "//li[@class='dropdown open']//ul[@class='dropdown-menu']//li[2]")
    private WebElement checkboxesandRadios;
    @FindBy(xpath = "//li[@class='dropdown open']//li[4]")
    private WebElement accessingLink;
    @FindBy(xpath = "//li[1]//ul[@class = \"dropdown-menu\"]//li[5]")
    private WebElement ajaxDemo;
    @FindBy(xpath = "//ul[@class = \"nav navbar-nav\"]//li[6]")
    private WebElement blockLevelTag;
    @FindBy(xpath = "//ul[@class = \"nav navbar-nav\"]//li[7]")
    private WebElement deleteCustomerForm;
    @FindBy(xpath = "//li[@class  = \"dropdown open\"]//li[8]")
    private WebElement yahoo;
    @FindBy(xpath = "//li[@class='dropdown open']//li[9]")
    private WebElement toolTip;
    @FindBy(xpath = "//li[@class='dropdown open']//li[10]")
    private WebElement fileUpload;
    @FindBy(xpath = "//nav[@class = \"navbar navbar-default\"]//ul[1]//li[3]")
    private WebElement insuranceProject;
    @FindBy(xpath = "//nav[@class = \"navbar navbar-default\"]//ul[1]//li[4]")
    private WebElement agileProject;
    @FindBy(xpath = "//nav[@class = \"navbar navbar-default\"]//ul[1]//li[5]")
    private WebElement bankProject;
    @FindBy(xpath = "//nav[@class = \"navbar navbar-default\"]//ul[1]//li[5]//li[1]")
    private WebElement bankProjectV1;
    @FindBy(xpath = "//nav[@class = \"navbar navbar-default\"]//ul[1]//li[5]//li[2]")
    private WebElement bankProjectV2;
    @FindBy(xpath = "//nav[@class = \"navbar navbar-default\"]//ul[1]//li[5]//li[3]")
    private WebElement bankProjectV3;
    @FindBy(xpath = "//nav[@class = \"navbar navbar-default\"]//ul[1]//li[6]")
    private WebElement securityProject;
    @FindBy(xpath = "//nav[@class = \"navbar navbar-default\"]//ul[1]//li[8]")
    private WebElement telecomProject;
    @FindBy(xpath = "//nav[@class = \"navbar navbar-default\"]//ul[1]//li[9]")
    private WebElement paymentGatewayProject;
    @FindBy(xpath = "//nav[@class = \"navbar navbar-default\"]//ul[1]//li[10]")
    private WebElement newsTour;
    @FindBy(xpath = "//nav[@class = \"navbar navbar-default\"]//ul[1]//li[11]")
    private WebElement seo;

    public GuruHomePage99(WebDriver driver) {
        super(driver);
    }

    public GuruHomePage99 openDropMenu() {
        selenium.click();
        return this;
    }

    public GuruHomePage99 clickFlashMovieDemo() {
        flashMovieDemo.click();
        return this;
    }

    public GuruHomePage99 clickCheckBoxesAndRadios() {
        checkboxesandRadios.click();
        return this;
    }

    public GuruHomePage99 clickAccessingLink() {
        accessingLink.click();
        return this;
    }

    public GuruHomePage99 clickAjaxDemo() {
        ajaxDemo.click();
        return this;
    }

    public GuruHomePage99 clickblockLevelTag() {
        blockLevelTag.click();
        return this;
    }

    public GuruHomePage99 clickDeleteCustomerForm() {
        deleteCustomerForm.click();
        return this;
    }

    public GuruHomePage99 clickYahoo() {
        yahoo.click();
        return this;
    }

    public GuruHomePage99 clickToolTip() {
        toolTip.click();
        return this;
    }

    public GuruHomePage99 clickFileUpload() {
        fileUpload.click();
        return this;
    }

    public GuruHomePage99 clickInsuranceProjectLink() {
        insuranceProject.click();
        return this;
    }

    public GuruHomePage99 clickAgileProject() {
        agileProject.click();
        return this;
    }

    public GuruHomePage99 clickbankProject() {
        bankProject.click();
        return this;
    }

    public GuruHomePage99 clickbankProjectbankProjectV1() {
        bankProjectV1.click();
        return this;
    }

    public GuruHomePage99 clickbankProjectbankProjectV2() {
        bankProjectV2.click();
        return this;
    }

    public GuruHomePage99 clickbankProjectbankProjectV3() {
        bankProjectV3.click();
        return this;
    }

    public GuruHomePage99 clickSecurityProject() {
        securityProject.click();
        return this;
    }

    public GuruHomePage99 clickTelecomProject() {
        telecomProject.click();
        return this;
    }

    public GuruHomePage99 clickPaymentGatewayProject() {
        paymentGatewayProject.click();
        return this;
    }

    public GuruHomePage99 clickNewsTour() {
        newsTour.click();
        return this;
    }

    public GuruHomePage99 clickSEO() {
        seo.click();
        return this;
    }

    public String getTitle() {
        return this.driver.getTitle();
    }

}
