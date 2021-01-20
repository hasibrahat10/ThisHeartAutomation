package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.MedicalPage;

public class MedicalSteps extends BasePage {

    @Then("I click on add new button")
    public void i_click_on_add_new_button() {
        new MedicalPage().clickAddNewMedical();
    }

    @Then("I select a medical info and click save button")
    public void i_select_a_medical_info_and_click_save_button() {
        MedicalPage medicalPage = new MedicalPage();
        medicalPage.selectMedicalValues("Aortic Valve Stenosis");
        sleepFor(10);
        medicalPage.clickSaveItemMedical();
    }

}
