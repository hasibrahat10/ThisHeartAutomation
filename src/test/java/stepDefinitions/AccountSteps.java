package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.AccountPage;
import pages.MedicalPage;

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

    @Then("I click on delete button")
    public void iClickOnDeleteButton() {
        new AccountPage().clickAccDelete();
    }

    @And("I confirm the account delete button")
    public void iConfirmTheAccountDeleteButton() {
        new AccountPage().confirmAccDelete();
    }

    @Then("I click on remove link")
    public void iClickOnRemoveLink() {
        new MedicalPage().clickRemoveItem();
    }

    @And("I confirm the delete medical item")
    public void iConfirmTheDeleteMedicalItem() {
        new MedicalPage().confirmDeleteMedicItem();
    }
}
