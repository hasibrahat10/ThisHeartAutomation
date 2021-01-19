package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.BasePage;

public class MemoriesPage extends BasePage {

    //Element Finder

    @FindBy(xpath = "//button[text()='+Add New Photo']")
    WebElement addPhotoBtn;

    @FindBy(xpath = "//input[@class='react-tagsinput-input']")
    WebElement tagInput;

    @FindBy(id = "pht_select")
    WebElement choosePhoto;

    @FindBy(xpath = "//button[text()='Upload']")
    WebElement uploadBtn;

    @FindBy(xpath = "//span[@class = 'UploadItem_percentage__2BgDA']")
    WebElement uploadProgress;


    // Element for Letter section
    @FindBy(xpath = "//a[text()='Letters']")
    WebElement navLetter;

    @FindBy(xpath = "//button[text()='+Add New Letter']")
    WebElement addLetter;

    @FindBy(id = "sub_txt")
    WebElement subLetter;

    @FindBy(xpath = "//input[@class='react-tagsinput-input']")
    WebElement tagLetter;

    @FindBy(xpath = "//div[@class='public-DraftStyleDefault-block public-DraftStyleDefault-ltr']")
    WebElement descriptionLetter;

    @FindBy(xpath = "//button[text()='Save']")
    WebElement btnSaveLetter;


    //Define constructor
    public MemoriesPage() {

        PageFactory.initElements(driver, this);
    }

    //Custom method declare for Memories Page

    public void addNewPhotoBtn() {
        addPhotoBtn.click();
    }

    public void enterTag() {
        tagInput.clear();
        tagInput.sendKeys("Hasibphoto");
    }

    public void uploadPhoto() {
        choosePhoto.sendKeys("C:\\Users\\rootnext\\Downloads\\scd1.png");
    }

    public void clickUploadBtn() {
        uploadBtn.click();
    }

    public String getUploadProgress() {
        sleepFor(10);
        return uploadProgress.getText();
    }

    public void navLinkClick() {
        navLetter.click();
    }

    public void clickOnAddLetterButton() {
        addLetter.click();
    }

    public void enterSubjectLetter() {
        subLetter.clear();
        subLetter.sendKeys("This is subject");
    }

    public void enterLetterTag() {
        tagLetter.clear();
        tagLetter.sendKeys("hasibletter");
    }

    public void enterDescription() {
        descriptionLetter.clear();
        descriptionLetter.sendKeys("Letter description for the details. We can add letter");
    }

    public void clickOnSaveButton() {
        btnSaveLetter.click();
    }


}
