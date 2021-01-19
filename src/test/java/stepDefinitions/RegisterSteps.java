package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.RegistrationPage;

public class RegisterSteps extends BasePage {
    @Given("I am on registration page")
    public void iAmOnRegistrationPage() {
        new RegistrationPage().clickCreateAnAccountLink();
    }

    @Then("Enter user valid info")
    public void enter_user_valid_info() {
        new RegistrationPage().userInfo();

    }

    @Then("click on register")
    public void click_on_register() {

        new RegistrationPage().registerUser();
    }


}
