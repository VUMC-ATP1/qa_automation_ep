package pageObjectsHomework;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CheckoutSuccessPage {

    private WebDriver driver;

    public CheckoutSuccessPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private final By backHomeButton = By.id("back-to-products");

    @Then("I press back to home button")
    public void backHomeButtonClick() {
        driver.findElement(backHomeButton).click();
    }
}
