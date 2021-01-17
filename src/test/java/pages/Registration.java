package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.BasePage;

public class Registration extends BasePage {


    @FindBy(id = "details-button")
    WebElement btnAdv;

    @FindBy(id = "proceed-link")
    WebElement btnProceed;

    @FindBy(id = "userEmail")
    WebElement emailID;

    //To Find the Elements for the Registration Page
    @FindBy(id = "userName")
    WebElement fullName;
    @FindBy(id = "userPassword")
    WebElement userPass;
    @FindBy(xpath = "//button[contains(text(),'Register')]")
    WebElement registerBtn;

    //constructor define
    public Registration() {
        PageFactory.initElements(driver, this);
    }


    public void advDetailsBtn() {
        sleepFor(1);
        btnAdv.click();

    }

    public void proceedToLoginBtn() {
        sleepFor(1);
        btnProceed.click();
    }


    public void userInfo() {
        emailID.clear();
        emailID.sendKeys("buynoirtest@yopmail.com");
        fullName.clear();
        fullName.sendKeys("Hasib Rahat");
        userPass.clear();
        userPass.sendKeys("hasib12345;;");
        sleepFor(3);
    }

    public void registerUser() {
        registerBtn.click();
    }

}
