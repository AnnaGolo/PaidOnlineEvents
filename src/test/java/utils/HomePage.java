package utils;

import Resourses.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.FeedPage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;


import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HomePage extends Base {

    private static By privacy = By.xpath("//div[@class='tojvnm2t a6sixzi8 k5wvi7nf q3lfd5jv pk4s997a bipmatt0 cebpdrjk qowsmv63 owwhemhu dp1hu0rb dhp61c6y l9j0dhe7 iyyx5f41 a8s20v7p']");


    @BeforeTest
    public void initialize() throws IOException {
        driver = initializeDriver();
        driver.get("https://facebook.com");
    }

    @AfterTest
    public void teardown(){
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
        l.getEmail().sendKeys("golovinaav2019@gmail.com");
        l.getPassword().sendKeys("fesco7635");
        l.logIn().click();
        FeedPage feedPage = new FeedPage(driver);
        driver.manage().window().maximize();
        feedPage.selectEvents().click();
        feedPage.createNewEvent().click();
        feedPage.createOnlineNewEvent().click();
        feedPage.chooseLocation().click();
        feedPage.inputName().sendKeys("My first Event");
        feedPage.chooseDate().click();
        feedPage.chooseTime().click();
        feedPage.choosePrivacy().click();
    }
}
