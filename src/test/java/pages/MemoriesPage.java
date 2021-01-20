package pages;

import org.openqa.selenium.By;
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


    // Element for video section

    @FindBy(xpath = "//a[text()='Videos']")
    WebElement navVideos;


    @FindBy(xpath = "//button[text()='+Add New Videos']")
    WebElement addVideos;

    @FindBy(xpath = "//input[@class='react-tagsinput-input']")
    WebElement tagVideo;

    @FindBy(xpath = "//input[@type='file']")
    WebElement chooseVideo;

    @FindBy(xpath = "//span[@class = 'UploadItem_percentage__2BgDA']")
    WebElement uploadProgressVideo;

    //Add URL in video section

    @FindBy(xpath = "//li[text()='Upload Url or Link']")
    WebElement urlVideo;

    @FindBy(id = "urltitle")
    WebElement urlTitle;

    @FindBy(xpath = "//input[@class='react-tagsinput-input']")
    WebElement tagURL;

    @FindBy(id = "urlpath")
    WebElement enterURL;

    @FindBy(xpath = "//button[text()='Save']")
    WebElement clickSaveURL;


    //Define constructor
    public MemoriesPage() {

        PageFactory.initElements(driver, this);
    }

    //Custom method declare for Memories Page Photo

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


    //Custom method declare for Memories Page Letter

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

    //Custom method declare for Memories Page video

    public void clickVideoNav() {
        navVideos.click();
    }

    public void clickOnAddNewVideosButton() {
        addVideos.click();
        sleepFor(5);
    }

    public void enterVideoTag() {
        tagVideo.clear();
        tagVideo.sendKeys("HasibVideo");
    }

    public void uploadVideo(String storage) {
        if (storage.equals("Url or Link")) {
            urlVideo.click();
            fillLinkOrUrlForm();
        } else {
            chooseVideo.sendKeys("C:\\Users\\rootnext\\Downloads\\samplevideo.mp4");
            sleepFor(2);
        }

    }

    public void fillLinkOrUrlForm() {
        enterUrlInfo();
        clickUrlSaveButton();
    }


    public boolean getVideoUploadProgress(String status) {
        sleepFor(3);
        if (driver.findElements(By.xpath("//*[contains(text()," + status + ")]")).size() > 0) {
            return true;
        } else return driver.findElements(By.xpath("//*[contains(text()," + status + ")]")).size() > 0;
    }


    public void enterUrlInfo() {
        urlTitle.clear();
        urlTitle.sendKeys("Kids Play");
        tagURL.clear();
        tagURL.sendKeys("hasibtag");
        enterURL.clear();
        enterURL.sendKeys("https://youtu.be/IRdSDC-fXXM");
    }

    public void clickUrlSaveButton() {
        clickSaveURL.click();
    }

}
