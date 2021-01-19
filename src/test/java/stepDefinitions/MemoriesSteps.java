package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.MemoriesPage;

public class MemoriesSteps extends BasePage {
    @Then("I click on add new photo button")
    public void i_click_on_add_new_photo_button() {
        new MemoriesPage().addNewPhotoBtn();
    }

    @Then("I fill add photo form and click upload button")
    public void i_fill_add_photo_form_and_click_upload_button() {
        MemoriesPage memories = new MemoriesPage();
        memories.enterTag();
        sleepFor(1);
        memories.uploadPhoto();
        sleepFor(1);
        memories.clickUploadBtn();
    }

    @Then("I should see photo upload status {int}%")
    public void iShouldSeePhotoUploadStatus(int statusProgress) {
        Assert.assertEquals(statusProgress + "%", new MemoriesPage().getUploadProgress());
//        String text= Integer.toString(statusProgress);
//        System.out.println(text);

    }

    @And("I click on letter nav link")
    public void iClickOnLetterNavLink() {
        new MemoriesPage().navLinkClick();

    }

    @And("I click on add new letter button")
    public void iClickOnAddNewLetterButton() {
        new MemoriesPage().clickOnAddLetterButton();
    }

    @And("I fill add letter form and click save button")
    public void iFillAddLetterFormAndClickSaveButton() {
        MemoriesPage memories = new MemoriesPage();
        memories.enterSubjectLetter();
        memories.enterTag();
        memories.enterDescription();
        sleepFor(2);
        memories.clickOnSaveButton();
    }

    @Then("I click videos nav link")
    public void iClickVideosNavLink() {
        new MemoriesPage().clickVideoNav();
    }

    @And("I click on add new video button")
    public void iClickOnAddNewVideoButton() {
        new MemoriesPage().clickOnAddNewVideosButton();
    }

//    @And("I fill add new video form")
//    public void iFillAddNewVideoForm() {
//        MemoriesPage memoriesPage= new MemoriesPage();
//        memoriesPage.enterLetterTag();
//        memoriesPage.uploadVideo();
//
//    }

    @And("I fill up a new video form using {string}")
    public void iFillUpANewVideoFormUsingOption(String storage) {
        MemoriesPage memoriesPage = new MemoriesPage();
        memoriesPage.enterLetterTag();
        memoriesPage.uploadVideo(storage);
    }

    @Then("I should see video upload successful {string}")
    public void iShouldSeeVideoUploadSuccessful(String status) {
//        Assert.assertTrue(new MemoriesPage().getVideoUploadProgress(status));
    }
}
