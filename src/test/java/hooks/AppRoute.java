package hooks;

import io.cucumber.java.en.Given;
import pageObject.ApplicationRouting;

public class AppRoute {
    //Create the instance of pageobject
    ApplicationRouting approutePage = new ApplicationRouting();

    //Apply the testcases
    @Given("^Arman goes to nu site and click apply$")
    public void gotoApply(){
        approutePage.clickApply();
    }
}
