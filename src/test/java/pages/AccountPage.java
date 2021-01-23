package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import stepDefinitions.BasePage;

import java.util.List;

public class AccountPage extends BasePage {
    @FindBy(xpath = "//button[text()='+ Add Account']")
    WebElement addAccountBtn;

    //Find Elements for account page - Add Account
    @FindBy(id = "accName")
    WebElement accName;
    @FindBy(id = "accountType")
    WebElement accountType; // select "Financial" item type
    @FindBy(id = "textdesc")
    WebElement textDesc;
    @FindBy(id = "accUrl")
    WebElement accUrl;
    @FindBy(id = "username")
    WebElement accUserName;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(xpath = "//button[text()='Save']")
    WebElement accSaveBtn;

    // Delete Account from the list
    @FindBy(xpath = "//div[text()='Delete']")
    List<WebElement> accDelete;

    @FindBy(xpath = "//button[text()='Delete' and @class='btn btn-danger']")
    WebElement confirmAccDel;

    // Element find to Edit Account from the list


    // Define constructor
    public AccountPage() {

        PageFactory.initElements(driver, this);
    }
// Custom method declare for the account steps

    public void clickAddNewAccountBtn() {
        addAccountBtn.click();
    }

    public void enterFormInfo() {
        accName.clear();
        accName.sendKeys("Hasib account");

        Select accType = new Select(accountType);
        accType.selectByVisibleText("Financial");

        textDesc.clear();
        textDesc.sendKeys("Account description details");

        accUrl.clear();
        accUrl.sendKeys("www.hasibtestauto.com");

        accUserName.clear();
        accUserName.sendKeys("hr1047");

        password.clear();
        password.sendKeys("test12345");

    }

    public void clickOnSaveButton() {
        accSaveBtn.click();
        sleepFor(3);
    }

    public void clickAccDelete() {
        sleepFor(3);
        accDelete.get(1).click();
    }

    public void confirmAccDelete() {
        sleepFor(2);
        confirmAccDel.click();
        sleepFor(3);
    }


}
