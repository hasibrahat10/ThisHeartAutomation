package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.BasePage;

import java.util.List;

public class MemoriesPage extends BasePage {

    //Element Finder for Photos section

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

    //Deleting photos from the memories section

    @FindBy(xpath = " //button[text()='X']")
    List<WebElement> clickDelete;

    @FindBy(xpath = " //button[text()='Delete' and @class='btn btn-danger']")
    WebElement confirmDeletePhoto;


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

    //Edit & View a letter in the memories page

    @FindBy(xpath = "//button[text()='Edit']")
    List<WebElement> clickEdit;

    @FindBy(id = "subj")
    WebElement editSubj;

    @FindBy(xpath = "//input[@class='react-tagsinput-input']")
    WebElement editTag;

    @FindBy(xpath = "//div[@class='public-DraftStyleDefault-block public-DraftStyleDefault-ltr']")
    WebElement editDescription;

    @FindBy(xpath = "//button[text()='Save changes']")
    WebElement clickSaveChanges;

    @FindBy(xpath = "//button[text()='View']")
    List<WebElement> clickViewLetter;

    @FindBy(xpath = "//button[text()='Close']")
    WebElement closeLetter;


    //Delete letter from the memories

    @FindBy(xpath = "//button[@class='btn-control-delete']")
    List<WebElement> clickLetterDel;

    @FindBy(xpath = " //button[text()='Delete' and @class='btn btn-danger']")
    WebElement confirmDeleteLetter;

    @FindBy(id = "search_txt")
    WebElement searchText;

    @FindBy(xpath = "//div[@class='row list-letter']")
    List<WebElement> srcResult;


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


    //Delete video from the memories

    @FindBy(xpath = "//button[@class='textvideos']")
    List<WebElement> clickVidDel;

    @FindBy(xpath = " //button[text()='Delete' and @class='btn btn-danger']")
    WebElement confirmDeleteVideo;

    // Element for the records section


    @FindBy(xpath = "//a[text()='Recordings']")
    WebElement navRecords;

    @FindBy(xpath = "//button[text()='+Add New Record']")
    WebElement addRecords;

    @FindBy(xpath = "//input[@class='react-tagsinput-input']")
    WebElement tagAudio;

    @FindBy(xpath = "//input[@type='file']")
    WebElement chooseAudio;

    @FindBy(xpath = "//span[@class = 'UploadItem_percentage__2BgDA']")
    WebElement uploadProgressAudio;

    //Delete record from the memories

    @FindBy(xpath = "//button[@class='textrecord']")
    List<WebElement> clickRecordDel;

    @FindBy(xpath = " //button[text()='Delete' and @class='btn btn-danger']")
    WebElement confirmDeleteRecord;


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
        sleepFor(5);
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

    public void clickRecordingsNavLink() {
        navRecords.click();
    }

    public void clickAddNewRecord() {
        addRecords.click();
    }

    public void fillAudioInfo() {
        tagAudio.clear();
        tagAudio.sendKeys("SampleAudio");
        sleepFor(2);
        chooseAudio.sendKeys("C:\\Users\\rootnext\\Downloads\\mp700kb.mp3");

    }

    public String getUploadProgressAudio() {
        sleepFor(10);
        return uploadProgressAudio.getText();
    }

    public void clickPhotoDelete() {
        sleepFor(15);
        clickDelete.get(5).click();
    }

    public void confirmDelete() {
        sleepFor(3);
        confirmDeletePhoto.click();
        sleepFor(3);

    }


    public void clickVideoDelete() {
        sleepFor(15);
        clickVidDel.get(1).click();
    }

    public void deleteVideoConfirm() {
        sleepFor(3);
        confirmDeleteVideo.click();
        sleepFor(3);
    }

    public void clickLetterDelete() {
        sleepFor(5);
        clickLetterDel.get(1).click();
    }

    public void deleteLetterConfirm() {
        sleepFor(3);
        confirmDeleteLetter.click();
        sleepFor(3);
    }

    public void clickRecordDelete() {
        sleepFor(5);
        clickRecordDel.get(1).click();
    }

    public void deleteRecordConfirm() {
        sleepFor(3);
        confirmDeleteRecord.click();
        sleepFor(3);
    }

    public void clickEditLetter() {
        clickEdit.get(1).click();
    }

    public void editLetterInfo() {
        editSubj.clear();
        editSubj.sendKeys("Subject Edit");

        editTag.clear();
        editTag.sendKeys("letterEdit");

        editDescription.clear();
        editDescription.sendKeys("Description edited by automatic call,no need to worry");
        sleepFor(5);
    }

    public void clickSaveButton() {
        clickSaveChanges.click();
        sleepFor(5);
    }


    public void letterView() {
        sleepFor(2);
        clickViewLetter.get(1).click();
        sleepFor(10);
        closeLetter.click();
    }


    public void searchText(String text) {
        sleepFor(5);
        searchText.clear();
        searchText.sendKeys(text);
    }

    public String searchResultDisplay() {
        String results = srcResult.get(0).getText();
        sleepFor(3);
        for (WebElement webElement : srcResult) {
        }

        return results;
    }

}
