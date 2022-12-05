package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utilities.PropertyDataParser;

import java.time.Duration;
import java.util.Properties;

public class BaseDrive {
    //set webdriver type driver variable as null
    public WebDriver driver = null;

    //Now extract drivers and site url
    //create an object of properties class and initialize
    Properties props = PropertyDataParser.props("browserData");
    // extract
    String browser = props.getProperty("b1");
    String siteurl = props.getProperty("baseUrl");

    //setup the driver
    public WebDriver setup() {
        switch (browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
        }
        driver.get(siteurl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        PageDriver.getInstance().setWebdriver(driver);
        return driver;
    }
}
