package pages;

import com.github.javafaker.Faker;
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

    public void setEmailID(String email){

        emailID.clear();
        emailID.sendKeys(email);
    }

    public void setFullName(String fName){

        fullName.clear();
        fullName.sendKeys(fName);
    }

    public void setUserPass(String pass) {
        userPass.clear();
        userPass.sendKeys(pass);
        sleepFor(3);
    }


    public void registerUser() {
        registerBtn.click();
    }

}
