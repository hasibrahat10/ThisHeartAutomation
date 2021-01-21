package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.AccountPage;

public class AccountSteps extends BasePage {


    @Given("I click on add new account")
    public void i_click_on_add_new_account() {
        new AccountPage().clickAddNewAccountBtn();
    }

    @Then("I fill up the form info and click on save button")
    public void i_fill_up_the_form_info_and_click_on_save_button() {
        AccountPage accountPage = new AccountPage();
        accountPage.enterFormInfo();
        accountPage.clickOnSaveButton();
    }
}
