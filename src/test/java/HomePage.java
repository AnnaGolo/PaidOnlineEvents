import Resourses.Base;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import pageObjects.LoginPage;


import java.io.IOException;

public class HomePage extends Base {

    @Test
    public void basePageNav() throws IOException, InterruptedException {
        driver = initializeDriver();
        driver.get("https://facebook.com");

        LoginPage l = new LoginPage(driver);
        l.getEmail().sendKeys("golovinaav2019@gmail.com");
        l. getPassword().sendKeys("fesco7635");

        l.logIn().click();
    }
}
