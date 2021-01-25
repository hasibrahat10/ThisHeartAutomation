package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jdk.internal.instrumentation.Logger;
import org.junit.Assert;
import pages.LoginPage;
import pages.UpdateProfilePage;

public class LoginSteps extends BasePage {

    @Then("click on advance button")
    public void click_on_advance_button() {
//        new Login().advDetails();
    }

    @Then("click on back to safe button")
    public void click_on_back_to_safe_button() {
//        new Login().proceedToLogin();

    }

    @Then("Enter user details")
    public void enter_user_details() {
        new LoginPage().userInfo();
    }


    @Then("Click on login")
    public void click_on_login() {

        new LoginPage().clickLogin();

    }

    @Then("Click on Skip")
    public void click_on_Skip() {
        new LoginPage().clickSkip();

    }


    @Then("Page title should be {string}")
    public void pageTitleShouldBe(String title) {
        sleepFor(2);
        if (driver.getPageSource().contains("Sorry, that didn’t work. Please try again")) {

            Assert.assertTrue(false);
        } else Assert.assertEquals(title, driver.getTitle());

    }

    @Then("User enter Email as {string} and Password as {string}")
    public void userEnterEmailAsAndPasswordAs(String email, String password) {
        new LoginPage().loginInfo(email, password);

    }

    @Then("Click on profile name")
    public void clickOnProfileName() {
        new UpdateProfilePage().clickProfileName();
    }

    @When("User click on Log out link")
    public void userClickOnLogOutLink() {
        new LoginPage().clickLogoutBtn();

    }

    @And("Confirm the logout")
    public void confirmTheLogout() {
        new LoginPage().confirmLogOut();


    }
}
