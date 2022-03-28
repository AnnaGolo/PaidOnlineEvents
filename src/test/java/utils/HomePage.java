package utils;

import Resourses.Base;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.FeedPage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;


import java.io.IOException;

public class HomePage extends Base {

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
    public void createEvent() throws InterruptedException {
        LoginPage l = new LoginPage(driver);
        l.getEmail().sendKeys("golovinaav2019@gmail.com");
        l.getPassword().sendKeys("fesco7635");
        l.logIn().click();
        FeedPage feedPage = new FeedPage(driver);
        driver.manage().window().maximize();
        feedPage.selectEvents().click();
        feedPage.createNewEvent().click();








    }
}