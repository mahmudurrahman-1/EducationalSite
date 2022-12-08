package step_def;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObject.ApplicationRouting;

public class AppRoute {
    //Create the instance of pageobject
    ApplicationRouting approutePage = new ApplicationRouting();

    //Apply the testcases
    @Given("^Nu site loaded and close popup$")
    public void popUpClose(){
        approutePage.waitForPageLoad();
        approutePage.clicktoClosePopUp();
    }
    @When("^Arman goes to nu site and click apply$")
    public void gotoApply() throws InterruptedException{
        Thread.sleep(3000);
        approutePage.clickApply();
    }
}
