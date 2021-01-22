package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.BasePage;

public class UpdateProfilePage extends BasePage {

    @FindBy(xpath = "//div/a [text()='Hasib Rahat']")
    WebElement profileName;

    //Find elements for the update profile page
    @FindBy(xpath = "//button[text()='Update Profile']")
    WebElement clickUpdateProfile;
    @FindBy(id = "txtProfileImage")
    WebElement chooseProfilePhoto;
    @FindBy(xpath = "//button[text()='Upload']")
    WebElement clickUpload;
    @FindBy(id = "current_pass")
    WebElement currentPass;

    //Update password field element
    @FindBy(id = "new_pass")
    WebElement newPass;
    @FindBy(id = "confirm_pass")
    WebElement confirmPass;
    @FindBy(xpath = "//button[@class='update-btn btn btn-secondary']")
    WebElement updateButton;

    public UpdateProfilePage() {
        PageFactory.initElements(driver, this);
    }


//Custom method declare for the Update profile steps

    public void clickProfileName() {
        sleepFor(4);
        profileName.click();
    }

    public void clickUpdateProfileText() {
        clickUpdateProfile.click();
        sleepFor(2);

    }

    public void choosePhotoProfile() {
        sleepFor(5);
        chooseProfilePhoto.sendKeys("C:\\Users\\rootnext\\Downloads\\ff.png");
        sleepFor(5);

    }

    public void clickUploadButton() {

        clickUpload.click();
        sleepFor(20);
    }

    public void enterPassWordInfo() {
        currentPass.clear();
        currentPass.sendKeys("hasib12345;;");

        newPass.clear();
        newPass.sendKeys("hasib12345;;");

        confirmPass.clear();
        confirmPass.sendKeys("hasib12345;;");
    }

    public void clickUpdateButton() {
        sleepFor(4);
        updateButton.click();
        sleepFor(5);
    }


}
