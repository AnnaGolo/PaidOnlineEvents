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
    By eventType = By.xpath("(//div[@class = 'oajrlxb2 gs1a9yip g5ia77u1 mtkw9kbi tlpljxtp qensuy8j ppp5ayq2 goun2846 ccm00jje s44p3ltw mk2mc5f4 rt8b4zig n8ej3o3l agehan2d sk4xxmp2 rq0escxv nhd2j8a9 mg4g778l pfnyh3mw p7hjln8o kvgmc6g5 cxmmr5t8 oygrvhab hcukyx3x hpfvmrgz jb3vyjys rz4wbd8a qt6c0cv9 a8nywdso l9j0dhe7 i1ao9s8h esuyzwwr f1sip0of du4w35lb n00je7tq arfg74bv qs9ysxi8 k77z8yql btwxx1t3 abiwlrkh p8dawk7l lzcic4wl j83agx80 sn7ne77z k4urcfbm'])[1]");
    By eventLocation = By.xpath("//div[@class= 'bp9cbjyn rq0escxv j83agx80 cbu4d94t datstx6m discj3wi hv4rvrfc ihqw7lf3 dati1w0a dk4b0urn m3jzkkrl hgj6luyd d4g538ow']");
    By eventDetails = By.xpath("//h1[text()='Event Details']");
    By eventName = By.xpath("//input[@class='oajrlxb2 f1sip0of hidtqoto e70eycc3 lzcic4wl g5ia77u1 gcieejh5 bn081pho humdl8nn izx4hr6d rq0escxv oo9gr5id qc3s4z1d knj5qynh fo6rh5oj osnr6wyh hv4rvrfc dati1w0a p0x8y401 k4urcfbm iu8raji3 nfbje2wv']");
    By calendarDate = By.xpath("//label[@aria-label='Choose Date']");
    By eventTime = By.xpath("//input[@aria-haspopup='listbox']");
    By privacy = By.xpath("//label[@aria-label='Privacy']");
    By privacyChoice = By.xpath("(//div[@role= 'radio'])[1]");
    By nextClick = By.xpath("//div[@aria-label ='Next']");
    By location = By.xpath("(//div[@role ='radio'])[1]");
    By locationTitle = By.xpath("//h1[text()='Location']");
    By popup = By.xpath("//div[@aria-label='Got it']");
    By followNextButton = By.xpath("//div[@aria-label = 'Next']");
    By description = By.xpath("//h1[text()= 'Description']");
    By descriptionField = By.xpath("//label[@aria-label= 'Description']");
    By descriptionNextButton = By.xpath("//div[@aria-label= 'Next']");
    By illustrationButton = By.xpath("//div[@aria-label= 'Choose Illustration']");
    By foodDrinkIllustration = By.cssSelector("img[alt= 'Food and Drink']");
    By createEventButtonPic = By.cssSelector("div[aria-label= 'Create event'");

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
        return driver.findElement(eventLocation);
    }
    public boolean eventDetailsTitleCheck(){
        return driver.findElement(eventDetails).isDisplayed();
    }
    public WebElement inputName(){
        return driver.findElement(eventName);
    }
    public WebElement chooseDate(){
        WebDriverWait wait = new WebDriverWait(driver,  20);
        wait.until(ExpectedConditions.elementToBeClickable(calendarDate));
        return driver.findElement(calendarDate);
    }
    public WebElement chooseTime(){
        return driver.findElement(eventTime);
    }
    public WebElement choosePrivacy(){
        //JavascriptExecutor js = (JavascriptExecutor)driver;
        //WebElement ele = driver.findElement(privacy);
       // js.executeScript("arguments[0].click()", ele);
        return driver.findElement(privacy);
    }
    public WebElement choosePrivacyOption(){

        return driver.findElement(privacyChoice);
    }
    public WebElement clickNext(){
        return driver.findElement(nextClick);
    }
    public WebElement chooseEventLocation(){
        WebDriverWait wait = new WebDriverWait(driver,  40);
        wait.until(ExpectedConditions.elementToBeClickable(location));
        return driver.findElement(location);

    }
    public  WebElement checkLocationTitle(){
        return driver.findElement(locationTitle);
    }
    public WebElement checkPopUp(){
        return driver.findElement(popup);
    }
    public WebElement tapNext(){
        return driver.findElement(nextClick);
    }
    public WebElement checkDescriptionTitle(){
        return driver.findElement(description);
    }
    public WebElement addDescription(){
        return driver.findElement(descriptionField);
    }
    public WebElement tapDesrNextButton(){
        WebDriverWait wait = new WebDriverWait(driver,  10);
        wait.until(ExpectedConditions.elementToBeClickable(descriptionNextButton));
        return driver.findElement(descriptionNextButton);
    }
    public WebElement chooseIllustration(){
        return driver.findElement(illustrationButton);
    }
    public WebElement chooseFoodAndDrink(){
        return driver.findElement(foodDrinkIllustration);
    }
    public WebElement createEventFinal(){
        return driver.findElement(createEventButtonPic);
    }
}
