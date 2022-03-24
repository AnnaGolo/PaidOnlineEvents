package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    public WebDriver driver;

    By email = By.xpath("//input[@id = 'email']");
    By password = By.xpath("//input[@type = 'password']");
    By logIn = By.xpath("//button[@type = 'submit']");






    public LoginPage(WebDriver driver){

        this.driver = driver;
    }
    public WebElement getEmail(){
        return driver.findElement(email);
    }
    public WebElement getPassword(){
        return driver.findElement(password);
    }
    public WebElement logIn(){
        return driver.findElement(logIn);
    }




}
