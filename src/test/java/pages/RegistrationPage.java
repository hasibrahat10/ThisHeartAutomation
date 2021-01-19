package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.BasePage;

public class RegistrationPage extends BasePage {

    //To Find the Elements for the Registration Page

    @FindBy(xpath = "//a[text()='Create an account']")
    WebElement createBtn;

    @FindBy(id = "userEmail")
    WebElement emailID;

    @FindBy(id = "userName")
    WebElement fullName;

    @FindBy(id = "userPassword")
    WebElement userPass;

    @FindBy(xpath = "//button[contains(text(),'Register')]")
    WebElement registerBtn;

    //constructor define
    public RegistrationPage() {
        PageFactory.initElements(driver, this);
    }

    //Custom Method declare for the steps

    public void clickCreateAnAccountLink() {
        createBtn.click();
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
