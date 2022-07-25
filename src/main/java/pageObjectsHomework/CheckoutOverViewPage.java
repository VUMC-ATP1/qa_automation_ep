package pageObjectsHomework;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CheckoutOverViewPage {

    private WebDriver driver;

    public CheckoutOverViewPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private final By finishButton = By.id("finish");
    @Then("I click finish button")
    public void finishButtonClick() {
        driver.findElement(finishButton).click();
    }
}
