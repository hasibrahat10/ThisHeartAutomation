package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import stepDefinitions.BasePage;

public class AccountPage extends BasePage {
    @FindBy(xpath = "//button[text()='+ Add Account']")
    WebElement addAccountBtn;

    //Find Elements for account page
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

    public AccountPage() {

        PageFactory.initElements(driver, this);
    }

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


}
