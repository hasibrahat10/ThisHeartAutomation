package stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Login;

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
        new Login().userInfo();
    }


    @Then("Click on login")
    public void click_on_login() {
        new Login().clickLogin();

    }

    @Then("Click on Skip")
    public void click_on_Skip() {
        new Login().clickSkip();

    }


    @Then("Page title should be {string}")
    public void pageTitleShouldBe(String title) {
        sleepFor(2);
        if (driver.getPageSource().contains("ThisHeart- Dashboard")) {

            Assert.assertTrue(false);
        } else Assert.assertEquals(title, driver.getTitle());

    }
}
