package pageObject;

import driver.PageDriver;
import io.cucumber.java.de.Wenn;
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
    @FindBy(css = "select[id]")
    List<WebElement> selectRequirements;
    @FindBy(css = "button[class='btn']")
    public WebElement submitBtn;
    @FindBy(className = "school-button")
    public WebElement applyBtn;
    @FindBy(id = "HEADER_LOGIN_LINK")
    public WebElement continueProcess;
    @FindBy(id="NU_OA2_WORK_EMAILID")
    public WebElement enterEmail;
    @FindBy(id="NU_OA2_WORK_NU_OA2_SND_LNK_PB")
    public WebElement getLoginLinkBtn;
    /***************
     * All the actions
     */
    public void clicktoClosePopUp(){
        closePopup.get(1).click();
    }
    public void clickApply() throws InterruptedException{
         System.out.println(selectRequirements.size());
         applyNowBtn.get(1).click();

     }

     public void setSelectRequirements(){
        selectitem(selectRequirements.get(0),"1");
         selectitem(selectRequirements.get(1),"3");
         selectitem(selectRequirements.get(2),"199");
        submitBtn.click();

     }
     public void popUp(){
        applyBtn.click();
        continueProcess.click();
     }

     public void loginProceed(){

     }

}
