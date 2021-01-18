package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Memories;

public class MemoriesSteps extends BasePage {
    @Then("I click on add new photo button")
    public void i_click_on_add_new_photo_button() {
        new Memories().addNewPhotoBtn();
    }

    @Then("I fill add photo form and click upload button")
    public void i_fill_add_photo_form_and_click_upload_button() {
        Memories memories = new Memories();
        memories.enterTag();
        sleepFor(1);
        memories.uploadPhoto();
        sleepFor(1);
        memories.clickUploadBtn();
    }

    @Then("I should see photo upload status {int}%")
    public void iShouldSeePhotoUploadStatus(int statusProgress) {
        Assert.assertEquals(statusProgress + "%", new Memories().getUploadProgress());
//        String text= Integer.toString(statusProgress);
//        System.out.println(text);

    }

    @And("I click on letter nav link")
    public void iClickOnLetterNavLink() {
        new Memories().navLinkClick();
        
    }

    @And("I click on add new letter button")
    public void iClickOnAddNewLetterButton() {
        new Memories().clickOnAddLetterButton();
    }

    @And("I fill add letter form and click save button")
    public void iFillAddLetterFormAndClickSaveButton() {
        Memories memories = new Memories();
        memories.enterSubjectLetter();
        memories.enterTag();
        memories.enterDescription();
        sleepFor(2);
        memories.clickOnSaveButton();
    }
}
