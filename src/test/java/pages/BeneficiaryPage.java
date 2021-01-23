package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.BasePage;

import java.util.List;

public class BeneficiaryPage extends BasePage {
    //Find elements for the beneficiary page - ADD beneficiary
    @FindBy(xpath = "//button[text()='+ Add Beneficiary']")
    WebElement addBeneficiary;
    @FindBy(id = "firstname")
    WebElement firstName;
    @FindBy(id = "lastname")
    WebElement lastName;
    @FindBy(id = "mail_address")
    WebElement mailAddressOne;
    @FindBy(id = "mail_address2")
    WebElement mailAddressTwo;
    @FindBy(id = "email")
    WebElement emailID;
    @FindBy(id = "city")
    WebElement city;
    @FindBy(id = "cityState")
    WebElement state;
    @FindBy(id = "zip")
    WebElement zip;
    @FindBy(id = "last_4_beneficiary")
    WebElement socialNumber;
    @FindBy(xpath = "//button[text()='Save']")
    WebElement clickSaveBtn;
    @FindBy(xpath = "//h1[text()='BENEFICIARIES']")
    WebElement expectedText;

    // Delete beneficiary
    @FindBy(xpath = "//div[text()='Delete']")
    List<WebElement> clickBeneficiaryDelete;

    @FindBy(xpath = "//button[text()='Delete' and @class='btn btn-danger']")
    WebElement confirmBeneficiaryDelete;


    //Define constructor
    public BeneficiaryPage() {
        PageFactory.initElements(driver, this);

    }


    //Custom Method declare for Beneficiary steps

    public void clickOnAddBeneficiary() {
        addBeneficiary.click();
        sleepFor(1);
    }

    public void enterFormInfo() {
        firstName.clear();
        firstName.sendKeys("Hasib");

        lastName.clear();
        lastName.sendKeys("Rahat");

        mailAddressOne.clear();
        mailAddressOne.sendKeys("Easter House");
        mailAddressTwo.clear();
        mailAddressTwo.sendKeys("road-02,h-02");

        emailID.clear();
        emailID.sendKeys("rahat@mailinator.com");

        city.clear();
        city.sendKeys("Dhaka");
        state.clear();
        state.sendKeys("BD");
        zip.clear();
        zip.sendKeys("12345");

        socialNumber.clear();
        socialNumber.sendKeys("2345");

        sleepFor(5);

    }

    public void clickOnSaveButton() {
        clickSaveBtn.click();

    }


    public String checkTextDisplay() {
        return expectedText.getText();
    }

    public void beneficiaryDelete() {
        sleepFor(4);
        clickBeneficiaryDelete.get(0).click();
    }

    public void beneficiaryDeleteConfirm() {
        sleepFor(2);
        confirmBeneficiaryDelete.click();
        sleepFor(3);
    }


}
