package stepDefinitions;

import io.cucumber.java.en.Then;

import pages.Login;
import pages.Registration;

public class RegisterSteps extends BasePage {

    @Then("click on Advance details btn")
    public void clickOnAdvanceDetailsBtn() {
        new Registration().advDetailsBtn();
    }

    @Then("click on proceed to safe btn")
    public void clickOnProceedToSafeBtn() {
        new Registration().proceedToLoginBtn();
    }

    @Then("Enter user valid info")
    public void enter_user_valid_info() {
        new Registration().userInfo();

    }

    @Then("click on register")
    public void click_on_register() {

        new Registration().registerUser();
    }


}
