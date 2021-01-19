package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.DashboardPage;
import pages.LoginPage;

public class DashboardSteps extends BasePage {
    @Given("I am on dashboard page")
    public void iAmOnDashboardPage() {
        LoginPage login = new LoginPage();
        login.userInfo();
        login.clickLogin();
        login.clickSkip();
    }


    @Then("I click on memories link")
    public void iClickOnMemoriesLink() {
        new DashboardPage().clickMemoriesLink();
    }


}
