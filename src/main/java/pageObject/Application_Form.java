package pageObject;

import driver.PageDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Common;

public class Application_Form extends Common {
    public Application_Form() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    //Locators
    @FindBy(css = "label[for='epro6d-eu9xu0iz--2']")
    WebElement selectField;
    @FindBy(className = "btn-md")
    WebElement nextButton;
    @FindBy(id = "epro6d-ekyragh--4")
    WebElement getField;
    @FindBy(id = "esf7rv-degree_name")
    WebElement selectProgram; //103
    @FindBy(id = "epro6d-esdux7--N")
    WebElement selectNo;
    String LearnMore = "Thank you! We would love to learn more about you.";



}
