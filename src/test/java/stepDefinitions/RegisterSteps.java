package stepDefinitions;

import com.github.javafaker.Faker;
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
//        String emailId= randomString()+"@gmail.com";
        RegistrationPage registrationPage= new RegistrationPage();
        String userEmail = "hasib" + new Faker().number().digits(2)+"@yopmail.com";
        registrationPage.setEmailID(userEmail);

        String fullName =  new Faker().name().fullName();
        registrationPage.setFullName(fullName);

        String passWord = new Faker().internet().password();
        System.out.println(passWord);
        registrationPage.setUserPass(passWord);

    }

    @Then("click on register")
    public void click_on_register() {

        new RegistrationPage().registerUser();
    }


}
