package utils;

import Resourses.Base;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.FeedPage;
import pageObjects.LoginPage;


import java.io.IOException;

public class HomePage extends Base {

    public static final String EMAIL = "golovinaav2019@gmail.com";
    public static final String PASSWORD = "fesco7635";
    public static final String EVENT_NAME_IN = "My first Event";
    public static final String DESCRIPTION = "Please come to my first event";
    public static final String ACTUAL_RESULT_DATE = "WEDNESDAY, APRIL 6, 2022 AT 10:00 PM PDT";

    final static By PRIVACY = By.xpath("//div[@class='tojvnm2t a6sixzi8 k5wvi7nf q3lfd5jv pk4s997a bipmatt0 cebpdrjk qowsmv63 owwhemhu dp1hu0rb dhp61c6y l9j0dhe7 iyyx5f41 a8s20v7p']");
    final static By EVENT_NAME = By.xpath("//input[@class='oajrlxb2 f1sip0of hidtqoto e70eycc3 lzcic4wl g5ia77u1 gcieejh5 bn081pho humdl8nn izx4hr6d rq0escxv oo9gr5id qc3s4z1d knj5qynh fo6rh5oj osnr6wyh hv4rvrfc dati1w0a p0x8y401 k4urcfbm iu8raji3 nfbje2wv']");
    final static By EVENT_NAME_CREATION = By.cssSelector("div[class= 'bi6gxh9e aov4n071]");

    @BeforeTest
    public void initialize() throws IOException {
        driver = initializeDriver();
        driver.get("https://facebook.com");
    }

    @AfterTest
    public void teardown() {
        driver.close();
    }

    @Test
    public void basePageNav() throws IOException, InterruptedException {

        LoginPage l = new LoginPage(driver);
        l.getEmail().sendKeys("golovinaav2019@gmail.com");
        l.getPassword().sendKeys("fesco7635");
        l.logIn().click();
    }

    @Test
    public void createEvent() throws InterruptedException, IOException {
        driver.manage().timeouts();
        LoginPage l = new LoginPage(driver);
        l.getEmail().sendKeys(EMAIL);
        l.getPassword().sendKeys(PASSWORD);
        l.logIn().click();
        FeedPage feedPage = new FeedPage(driver);
        driver.manage().window().maximize();
        feedPage.selectEvents().click();
        feedPage.createNewEvent().click();
        feedPage.createOnlineNewEvent().click();
        feedPage.chooseLocation().click();
        feedPage.inputName().sendKeys(EVENT_NAME_IN);
        feedPage.chooseDate().click();
        feedPage.chooseTime().click();
        feedPage.choosePrivacy().click();
        feedPage.choosePrivacyOption().click();
        feedPage.clickNext().click();
        feedPage.chooseEventLocation().click();
        feedPage.checkLocationTitle().isDisplayed();
        feedPage.checkPopUp().click();
        feedPage.tapNext().click();
        feedPage.checkDescriptionTitle().isDisplayed();
        feedPage.addDescription().sendKeys(DESCRIPTION);
        feedPage.tapDesrNextButton().click();
        feedPage.chooseIllustration().click();
        feedPage.chooseFoodAndDrink().click();
        feedPage.createEventFinal().click();
        Thread.sleep(3000);

        String actualName =  driver.findElement(By.xpath("//span[@class ='d2edcug0 hpfvmrgz qv66sw1b c1et5uql lr9zc1uh a8c37x1j fe6kdd0r mau55g9w c8b282yb keod5gw0 nxhoafnm aigsh9s9 embtmqzv teo7jy3c m6dqt4wy h7mekvxk hnhda86s oo9gr5id hzawbc8m']")).getText();
        String actualEventDate = driver.findElement(By.xpath("//span[@class ='d2edcug0 hpfvmrgz qv66sw1b c1et5uql" +
                " lr9zc1uh a8c37x1j fe6kdd0r mau55g9w c8b282yb keod5gw0 nxhoafnm aigsh9s9 d3f4x2em iv3no6db jq4qci2q " +
                "a3bd9o3v hnhda86s jdix4yx3 hzawbc8m']")).getText();

        Assert.assertEquals(actualName,EVENT_NAME_IN);
        Assert.assertEquals(actualEventDate, ACTUAL_RESULT_DATE);

    }
}
