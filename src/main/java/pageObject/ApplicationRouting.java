package pageObject;

import driver.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Common;

import java.util.List;

public class ApplicationRouting extends Common {
    public ApplicationRouting(){
        PageFactory.initElements(PageDriver.getCurrentDriver(),this);
    }
    /**************
     Locators
     ***/
    @FindBy(xpath = "//a[normalize-space()='Apply Now']")
    List<WebElement> applyNowBtn;
    @FindBy(className = "close")
    List<WebElement> closePopup;

    /***************
     * All the actions
     */
    public void clicktoClosePopUp(){
        closePopup.get(1).click();
    }
    public void clickApply() throws InterruptedException{
         System.out.println(applyNowBtn.size());
         applyNowBtn.get(1).click();
     }

}
