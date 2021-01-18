package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Dashboard;
import pages.Login;

public class DashboardSteps extends BasePage {
    @Given("I am on dashboard page")
    public void iAmOnDashboardPage() {
        Login login = new Login();
        login.userInfo();
        login.clickLogin();
        login.clickSkip();
    }


    @Then("I click on memories link")
    public void iClickOnMemoriesLink() {
        new Dashboard().clickMemoriesLink();
    }


}
