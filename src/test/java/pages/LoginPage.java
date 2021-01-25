package pages;

import helper.WaitHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.BasePage;

public class LoginPage extends BasePage {


    // To Find the Elements for the Login Page

    @FindBy(id = "username")
    WebElement emailId;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement btnLogin;

    @FindBy(xpath = "//button[contains(text(),'Skip')]")
    WebElement btnSkip;

    @FindBy(xpath = "//button[text()='Logout']")
    WebElement clickLogOut;

    @FindBy(xpath = "//button[text()='Logout' and @class='btn btn-danger']")
    WebElement confirmLogOut;


    //constructor define
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    //Custom method declare for the Login steps

    public String getPageTitle (){
        return driver.getTitle();
    }

    public void userInfo() {
        new WaitHelper().WaitForElement(emailId, 30);
        emailId.clear();
        emailId.sendKeys("demot@yopmail.com");
        password.clear();
        password.sendKeys("hasib12345;;");
    }

    public void clickLogin() {
        btnLogin.click();
        sleepFor(3);

    }

    public void clickSkip() {
        btnSkip.click();
        sleepFor(1);
    }

    public void loginInfo(String email, String pass) {
        emailId.clear();
        emailId.sendKeys(email);

        password.clear();
        password.sendKeys(pass);
    }

    public void clickLogoutBtn() {
        clickLogOut.click();
        sleepFor(2);
    }

    public void confirmLogOut() {
        confirmLogOut.click();
        sleepFor(5);
    }


}
