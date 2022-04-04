package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.TestNGUtils;

public class EditPage extends TestNGUtils {
    public WebDriver driver;


    By editButton = By.xpath("//a[@aria-label= 'Edit']");
    By eventNameEdit = By.xpath("(//input[@dir= 'ltr'])[3]");
    By editedNameNextButton = By.cssSelector("div[aria-label = 'Next']");
    By locationOther = By.xpath("(//div[@role= 'radio'])[5]");
    By saveLocationButton = By.xpath("//div[@aria-label= 'Next']");
    By newEventName = By.xpath("(//input[@dir= 'ltr'])[3]");
    By descriptionTextArea = By.xpath("//textarea[@dir = 'ltr']");
    By nextButtonDescriptionArea = By.xpath("//div[@aria-label= 'Next']");
    By newImage = By.xpath("//img[@alt= 'Seasons and Holiday']");
    By updateEventButton = By.xpath("//div[@aria-label= 'Update']");

    public EditPage(WebDriver driver) {

        this.driver = driver;
    }

    public WebElement clickNameClear(){
        WebDriverWait wait = new WebDriverWait(driver,  40);
        wait.until(ExpectedConditions.elementToBeClickable(eventNameEdit));
        return driver.findElement(eventNameEdit);
    }

    public WebElement changeName() throws InterruptedException {
        WebElement ele = driver.findElement(eventNameEdit);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele);
        return driver.findElement(eventNameEdit);

    }
    public WebElement editButtonAction(){
        WebDriverWait wait = new WebDriverWait(driver,  30);
        wait.until(ExpectedConditions.elementToBeClickable(editButton));
        return driver.findElement(editButton);
    }
    public WebElement clickNextButtonEditedName(){
        return driver.findElement(editedNameNextButton);
    }
    public WebElement chooseOtherLocation(){
        return driver.findElement(locationOther);

    }
    public WebElement clickNextButtonLocation(){
        return driver.findElement(saveLocationButton);

    }
    public WebElement cleanDescription(){
        WebElement ele = driver.findElement(descriptionTextArea);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele);
        return driver.findElement(descriptionTextArea);
    }
    public  WebElement clickNextButtonDescriptionArea(){
        return driver.findElement(nextButtonDescriptionArea);
    }
    public WebElement chooseNewImage(){
        return driver.findElement(newImage);
    }
    public WebElement clickEventUpdate(){
        return driver.findElement(updateEventButton);
    }
}