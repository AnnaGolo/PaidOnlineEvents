package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.TestNGUtils;

public class FeedPage extends TestNGUtils {

    public WebDriver driver;

    By eventButton = By.xpath("//span[text()='Events']");
    By createEventButton = By.xpath("//span[text() = 'Create new event']");


    public FeedPage(WebDriver driver) {

        this.driver = driver;
    }

    public WebElement selectEvents() {

        return driver.findElement(eventButton);
    }
    public WebElement createNewEvent(){
        return driver.findElement(createEventButton);
    }
}
