package stepDefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BasePage {
    @Before
    public void setUpDriver() {
        startDriver();
        driver.manage().window().maximize();
        driver.get("https://thisheart.co/register");
    }

    @After
    public void tearDown() {
        stopDriver();
    }

}
