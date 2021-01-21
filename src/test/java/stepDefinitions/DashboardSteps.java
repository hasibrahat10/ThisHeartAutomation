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
        sleepFor(3);
    }


    @Then("I click on memories link")
    public void iClickOnMemoriesLink() {
        new DashboardPage().clickMemoriesLink();
    }

    @Then("I click on account link")
    public void i_click_on_account_link() {
        new DashboardPage().clickAccountsLink();
    }


    @Then("I click on medical link")
    public void iClickOnMedicalLink() {
        new DashboardPage().clickMedicalLink();
    }

    @Then("I click on beneficiary link")
    public void i_click_on_beneficiary_link() {
        new DashboardPage().clickBeneficiaryLink();
    }
}
