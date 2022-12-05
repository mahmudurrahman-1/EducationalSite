package driver;

import org.openqa.selenium.WebDriver;

public class PageDriver {
    //threadlocal variable is accessible(read and write) only by the same thread
    private static final ThreadLocal<WebDriver> webdriver = new ThreadLocal<>();
    //create a pagedriver instance that is null
    private static PageDriver instance = null;

    //private constructor
    //other class can not create this class object
    private PageDriver() {
        //Empty
    }

    public static PageDriver getInstance() {
        if (instance == null) {
            instance = new PageDriver();
        }
        return instance;
    }

    //Get the driver
    public WebDriver getDriver() {
        return webdriver.get();
    }

    //set the driver
    public void setWebdriver(WebDriver driver) {
        webdriver.set(driver);
    }

    //get current driver
    public static WebDriver getCurrentDriver() {
        return getInstance().getDriver();
    }
}
