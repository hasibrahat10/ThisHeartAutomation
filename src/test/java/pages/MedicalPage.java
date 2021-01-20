package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.BasePage;

import java.util.List;

public class MedicalPage extends BasePage {
    @FindBy(xpath = "//div[@class='card-title' and text()='ME']/following::button")
    WebElement addMedical;

    // Find elements for the medical page
    @FindBy(xpath = "//*[@class='css-bg1rzq-control']")
    WebElement selectValues;
    @FindBy(xpath = "//button[text()='Save Items']")
    WebElement saveMedicalItem;

    @FindBy(xpath = "//*[@class='css-fk865s-option']")
    List<WebElement> dropOptions;


    public MedicalPage() {
        PageFactory.initElements(driver, this);
    }

    //Custom Method declare for Medical steps

    public void clickAddNewMedical() {
        addMedical.click();
    }

    public void selectMedicalValues(String value) {
        selectValues.click();
//        Select selectValue = new Select(selectValues);
//        selectValue.selectByVisibleText("Aortic Valve Stenosis");
        sleepFor(5);
        for (WebElement element : dropOptions) {
            if (element.getText().equals(value)) {
                element.click();
                break;
            }
        }
        System.out.println(dropOptions.size());

    }

    public void clickSaveItemMedical() {
        saveMedicalItem.click();
    }

}
