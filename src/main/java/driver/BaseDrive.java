package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.PropertyDataParser;

import java.util.Properties;

public class BaseDrive {
    //set webdriver type driver variable as null
    public WebDriver driver =null;
   //Now extract drivers and site url
    Properties props = PropertyDataParser.props("browserData");
    //setup the driver
    public WebDriver setup(String browser){
        switch (browser){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                
        }
        return driver;
    }
}
