package hooks;

import driver.BaseDrive;
import driver.PageDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Driver extends BaseDrive {
    //@Before will call the method at first
    @Before
    public void initializeDriver() {
       driver= setup();
    }
//when all methods are executed @After notation will call closeDriver to quite browser
    @After
    public void closeDiver() {
        PageDriver.getCurrentDriver().quit();
    }
}
