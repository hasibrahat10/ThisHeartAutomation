package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.BasePage;

public class DashboardPage extends BasePage {

    //Find element for Dashboard page
    @FindBy(xpath = "//a[text()='Memories']")
    WebElement memLink;

    @FindBy(xpath = "//a[text()='Accounts']")
    WebElement accountLink;

    @FindBy(xpath = "//a[text()='Medical']")
    WebElement medicalLink;

    @FindBy(xpath = "//div/ul[@class='menu-list']/li/a[text()='Beneficiaries']")
    WebElement beneficiaryLink;

    // Search from the Dashboard page

    @FindBy(xpath = "//button[text()='Search']")
    WebElement btnDashSearch;

    @FindBy(xpath = "//button[text()='By name']")
    WebElement clickByName;

    @FindBy(xpath = "//button[text()='Memories']")
    WebElement clickMemories;

    @FindBy(xpath = "//button[@class='btn-src btn btn-secondary']")
    WebElement searchBtnRes;



//Define constructor
    public DashboardPage() {

        PageFactory.initElements(driver, this);
    }


    //Custom method declare for dashboard steps

    public void clickMemoriesLink() {
        memLink.click();
    }


    public void clickAccountsLink() {
        accountLink.click();
    }

    public void clickMedicalLink() {
        medicalLink.click();
    }

    public void clickBeneficiaryLink() {
        beneficiaryLink.click();
    }

    public void btnDashboardSearchClick(){
        sleepFor(5);
        btnDashSearch.click();
    }

    public void filterItemMem(){
        clickByName.click();
        sleepFor(2);
        clickMemories.click();
        sleepFor(3);

    }

    public void searchResultMemory(){
        searchBtnRes.click();
        sleepFor(5);
    }




}
