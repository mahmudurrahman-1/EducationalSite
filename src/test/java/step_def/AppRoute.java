package step_def;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
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
    @And("^Arman selects requirements for admission process$")
    public void selectItems() throws InterruptedException{
        approutePage.setSelectRequirements();
        Thread.sleep(2000);
    }

    @And("^Arman clicks apply when popup appears$")
    public void clickApplybtn(){
        approutePage.popUp();
    }
    @Then("^Arman enter \"([^\"]*)\" for getting login link$")
    public void getLoginLink(){
        approutePage.loginProceed();
    }

}
