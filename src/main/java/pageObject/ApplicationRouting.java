package pageObject;

import driver.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationRouting {
    public ApplicationRouting(){
        PageFactory.initElements(PageDriver.getCurrentDriver(),this);
    }
    /**************
     Locators
     ***/
    //first "// then[ then normalize-space() then = then ' text ' ]"
     @FindBy(xpath = "//a[normalize-space()='Apply Now']")
     WebElement applyNowBtn;

    /***************
     * All the actions
     */
     public void clickApply(){
         applyNowBtn.click();
     }
}
