package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Page extends BaseModel{

    @FindBy(xpath = "xxxxxx")
    WebDriver osome;



    public Page(WebDriver driver) {
        super(driver);


    }
}
