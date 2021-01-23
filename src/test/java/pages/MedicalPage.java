package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.BasePage;

import java.util.List;

public class MedicalPage extends BasePage {


    // Find elements for the medical page - Add Medical info

    @FindBy(xpath = "//div[@class='card-title' and text()='ME']/following::button")
    WebElement addMedical;

    @FindBy(xpath = "//*[@class='css-bg1rzq-control']")
    WebElement selectValues;

    @FindBy(xpath = "//*[@class='css-fk865s-option']")
    List<WebElement> dropOptions;

    @FindBy(xpath = "//button[text()='Save Items']")
    WebElement saveMedicalItem;

    // Delete or Remove medical info element

    @FindBy(xpath = "//div/a[text()='remove']")
    List<WebElement> clickRemove;

    @FindBy(xpath = "//button[text()='Delete' and @class='btn btn-danger']")
    WebElement confirmMedDelete;


//Define constructor

    public MedicalPage() {
        PageFactory.initElements(driver, this);
    }

    //Custom Method declare for Medical steps

    public void clickAddNewMedical() {
        addMedical.click();
    }

    public void selectMedicalValues(String value) {
        selectValues.click();
        sleepFor(5);
        for (WebElement dropElement : dropOptions) {
            if (dropElement.getText().equals(value)) {
                dropElement.click();
                break;
            }
        }
//        System.out.println(dropOptions.size());

    }

    public void clickSaveItemMedical() {
        saveMedicalItem.click();
    }

    public void clickRemoveItem() {
        sleepFor(3);
        clickRemove.get(1).click();
    }

    public void confirmDeleteMedicItem() {
        sleepFor(3);
        confirmMedDelete.click();
    }

}
