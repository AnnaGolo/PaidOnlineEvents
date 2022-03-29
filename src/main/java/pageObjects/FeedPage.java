package pageObjects;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.TestNGUtils;

public class FeedPage extends TestNGUtils {

    public WebDriver driver;

    By eventButton = By.xpath("//span[text()='Events']");
    By createEventButton = By.xpath("//span[text() = 'Create new event']");
    By eventType = By.xpath("//div[@class = 'bp9cbjyn rq0escxv j83agx80 cbu4d94t datstx6m discj3wi hv4rvrfc ihqw7lf3 dati1w0a dk4b0urn m3jzkkrl hgj6luyd d4g538ow']");
    By eventLocation = By.xpath("//div[@class= 'bp9cbjyn rq0escxv j83agx80 cbu4d94t datstx6m discj3wi hv4rvrfc ihqw7lf3 dati1w0a dk4b0urn m3jzkkrl hgj6luyd d4g538ow']");
    By eventDetails = By.xpath("//h1[text()='Event Details']");
    By eventName = By.xpath("//input[@class='oajrlxb2 f1sip0of hidtqoto e70eycc3 lzcic4wl g5ia77u1 gcieejh5 bn081pho humdl8nn izx4hr6d rq0escxv oo9gr5id qc3s4z1d knj5qynh fo6rh5oj osnr6wyh hv4rvrfc dati1w0a p0x8y401 k4urcfbm iu8raji3 nfbje2wv']");
    By calendarDate = By.xpath("//label[@aria-label='Choose Date']");
    By eventTime = By.xpath("//input[@aria-haspopup='listbox']");
    By privacy = By.xpath("//label[@aria-label='Privacy']");

    public FeedPage(WebDriver driver) {

        this.driver = driver;
    }

    public WebElement selectEvents() {

        return driver.findElement(eventButton);
    }
    public WebElement createNewEvent(){
        return driver.findElement(createEventButton);
    }
    public WebElement createOnlineNewEvent(){
        return driver.findElement(eventType);
    }
    public WebElement chooseLocation(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(eventLocation));
        return driver.findElement(eventLocation);
    }
    public boolean eventDetailsTitleCheck(){
        return driver.findElement(eventDetails).isDisplayed();
    }
    public WebElement inputName(){
        return driver.findElement(eventName);
    }
    public WebElement chooseDate(){
        WebDriverWait wait = new WebDriverWait(driver,  10);
        wait.until(ExpectedConditions.elementToBeClickable(calendarDate));
        return driver.findElement(calendarDate);
    }
    public WebElement chooseTime(){
        return driver.findElement(eventTime);
    }
    public WebElement choosePrivacy(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement ele = driver.findElement(privacy);
        js.executeScript("arguments[0].click()", ele);
        return driver.findElement(privacy);
    }
}
