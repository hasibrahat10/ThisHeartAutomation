package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BeneficiaryPage;

public class BeneficiarySteps extends BasePage {


    @Then("I click on add beneficiary button")
    public void i_click_on_add_beneficiary_button() {
        new BeneficiaryPage().clickOnAddBeneficiary();

    }

    @Then("I enter the beneficiary form info and I click on save button")
    public void i_enter_the_beneficiary_form_info_and_I_click_on_save_button() {
        BeneficiaryPage beneficiaryPage = new BeneficiaryPage();
        beneficiaryPage.enterFormInfo();
        beneficiaryPage.clickOnSaveButton();

    }


    @Then("Text displayed with {string}")
    public void textDisplayedWith(String expectedText) {
        sleepFor(5);
        Assert.assertEquals(expectedText, new BeneficiaryPage().checkTextDisplay());
    }

    @And("I click on beneficiary delete button")
    public void iClickOnBeneficiaryDeleteButton() {
        new BeneficiaryPage().beneficiaryDelete();
    }

    @And("I confirm the beneficiary delete item")
    public void iConfirmTheBeneficiaryDeleteItem() {
        new BeneficiaryPage().beneficiaryDeleteConfirm();

    }
}
