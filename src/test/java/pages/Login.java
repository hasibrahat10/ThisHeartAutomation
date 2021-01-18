package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.BasePage;

public class Login extends BasePage {


    // To Find the Elements for the Login Page

    @FindBy(id = "username")
    WebElement emailId;

    @FindBy(id = "password")
    WebElement password;
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement btnLogin;
    @FindBy(xpath = "//button[contains(text(),'Skip')]")
    WebElement btnSkip;


    //constructor define
    public Login() {
        PageFactory.initElements(driver, this);
    }

    //Custom method declare for the Login steps

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
