package Resourses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {

    public WebDriver driver;

    public WebDriver initializeDriver() throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\golov\\IdeaProjects\\POE\\src\\main\\java\\Resourses\\data.properties");
        prop.load(fis);
        String browserName = prop.getProperty("browser");

        if(browserName.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "C://Users//golov//OneDrive//Documents//ChromeDriver//chromedriver.exe");
            driver = new ChromeDriver();

        } else if(browserName.equals("firefox")){
            System.setProperty("webdriver.firefox.driver", "C://Users//golov//OneDrive//Documents//geckodriver.exe");
         driver = new FirefoxDriver();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
        return driver;
    }
}
