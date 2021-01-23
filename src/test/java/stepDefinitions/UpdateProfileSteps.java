package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.UpdateProfilePage;

public class UpdateProfileSteps extends BasePage {

    @Then("I click on profile name")
    public void i_click_on_profile_name() {
        new UpdateProfilePage().clickProfileName();

    }

    @Then("I click on update profile")
    public void i_click_on_update_profile() {
        new UpdateProfilePage().clickUpdateProfileText();
    }

    @Then("I choose profile image")
    public void i_choose_profile_image() {
        new UpdateProfilePage().choosePhotoProfile();
    }

    @Then("Click upload button")
    public void click_upload_button() {
        new UpdateProfilePage().clickUploadButton();

    }


    @Then("I have enter the password info")
    public void iHaveEnterThePasswordInfo() {

        new UpdateProfilePage().enterPassWordInfo();
    }

    @Then("I click on update button")
    public void iClickOnUpdateButton() {
        new UpdateProfilePage().clickUpdateButton();
    }

}
