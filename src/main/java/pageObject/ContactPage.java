package pageObject;

import driver.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Common;

public class ContactPage extends Common {
    public ContactPage(){
        PageFactory.initElements(PageDriver.getCurrentDriver(),this);
    }

    @FindBy(id="essnxnh-first_name")
    WebElement firstName;
    @FindBy(id="enrcixk-last_name")
    WebElement lastName;
    @FindBy(id="etmyb6b-middle_name")
    WebElement middleName;
    @FindBy(id="es9fa5q-suffix")
    WebElement suffix;
    @FindBy(id="env958e-email")
    WebElement enail;
    @FindBy(id="e11g6b3-sparkroom_zipcode")
    WebElement zipCode;
    @FindBy(id="essnxnh-first_name")
    WebElement firstName;
    @FindBy(id="essnxnh-first_name")
    WebElement firstName;
}
