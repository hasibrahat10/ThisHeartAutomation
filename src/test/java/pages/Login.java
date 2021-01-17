package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.BasePage;

public class Login extends BasePage {
    @FindBy(id = "details-button")
    WebElement btnAdv;

    // To Find the Elements for the Login Page
    @FindBy(id = "proceed-link")
    WebElement btnProceed;
    @FindBy(id = "username")
    WebElement emailId;

    // Find the login form elements
    @FindBy(id = "password")
    WebElement password;
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement btnLogin;
    @FindBy(xpath = "//button[contains(text(),'Skip')]")
    WebElement btnSkip;
//    @FindBy(xpath = "//title[contains(text(),'ThisHeart- Dashboard')]")
//    WebElement expectedTitle;

    //constructor define
    public Login() {
        PageFactory.initElements(driver, this);
    }

    // custom Method declare to step define
    public void advDetails() {
        sleepFor(2);
        btnAdv.click();

    }

    public void proceedToLogin() {
        sleepFor(2);
        btnProceed.click();
    }

    public void userInfo() {
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


}
