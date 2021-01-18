package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.BasePage;

public class Dashboard extends BasePage {

    //Find element for Dashboard page
    @FindBy(xpath = "//a[text()='Memories']")
    WebElement memLink;

    public Dashboard() {

        PageFactory.initElements(driver, this);
    }


    //Custom method declare for dashboard steps

    public void clickMemoriesLink() {
        memLink.click();
    }

}
